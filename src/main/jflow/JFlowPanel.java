/*
 * JFlow v0.2
 * Created by Tim De Pauw <http://pwnt.be/>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package main.jflow;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import event.ShapeEvent;
import event.ShapeListener;
import geometry.Point3D;
import geometry.RotationMatrix;
import shape.ClothingItem;
import shape.Picture;

@SuppressWarnings("serial")
public class JFlowPanel extends JPanel implements MouseListener,
		MouseMotionListener {
	private Collection<ShapeListener> listeners;

	private Configuration config;

	private Scene scene;

	private double scrollDelta;

	private double dragStart;

	private double dragRate;

	private boolean buttonOnePressed;

	private boolean dragging;

	private Shape activeShape;

	private Timer easingTimer;

	private int shapeArrayOffset;
	
	private double price_min;
	private double price_max;
	private Shape[] active_shapes;
	private HashSet<String> filter_colors= new HashSet<String>();
	private HashSet<String> filter_sizes= new HashSet<String>();
	private int routeCounter;

	public JFlowPanel(Configuration config) {
		super();
		this.routeCounter = 0;
		this.config = config;
		this.price_max = 200;
		this.price_min = 0;
		active_shapes = config.shapes;
		listeners = new HashSet<ShapeListener>();
		scene = new Scene(new Point3D(0, 0, 1), new RotationMatrix(0, 0, 0),
				new Point3D(0, 0, 1));
		buttonOnePressed = false;
		dragging = false;
		shapeArrayOffset = 0;
		activeShape = null;
		setLayout(null);
		setBackground(config.backgroundColor);
		setScrollRate(0);
		if (config.autoScrollAmount != 0) {
			new Timer().scheduleAtFixedRate(new AutoScroller(), 0,
					1000 / config.framesPerSecond);
		}
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void resetRouteCounter(){
		routeCounter = 0;
	}

	public void addListener(ShapeListener listener) {
		listeners.add(listener);
	}

	public void removeListener(ShapeListener listener) {
		listeners.remove(listener);
	}

	public synchronized double getScrollRate() {
		return scrollDelta;
	}

	public synchronized void setScrollRate(double scrollRate) {
		this.scrollDelta = scrollRate;
		normalizeScrollRate();
		updateShapes();
	}

	private synchronized void normalizeScrollRate() {
		while (scrollDelta < -0.5) {
			scrollDelta += 1;
			if (--shapeArrayOffset < 0) {
				shapeArrayOffset += config.shapes.length;
			}

		}
		while (scrollDelta > 0.5) {
			scrollDelta -= 1;
			if (++shapeArrayOffset >= config.shapes.length) {
				shapeArrayOffset -= config.shapes.length;
			}
		}
	}
	
	// Reset Filter options
	public void resetSizes(){
		filter_sizes.clear();
		refreshActiveShapes();
		routeCounter++;
	}
	
	// Each of the following increments the RouteCounter
	
	public void resetPrice(){
		price_min = 0;
		price_max = 2000;
		refreshActiveShapes();
		routeCounter++;
	}
	
	public void resetColors(){
		filter_colors.clear();
		routeCounter++;
	}
	
	
	// Resets all filters; prints out RouteCounter and resets it as well
	public void resetAll(){
		filter_sizes.clear();
		filter_colors.clear();
		price_min = 0;
		price_max = 2000;
		refreshActiveShapes();
		System.out.println(routeCounter);
		routeCounter = 0;
	}
	//Filter Setters ; Each of these also increments the count
	
	public void setPriceRange(double min, double max){
		price_min = min;
		price_max = max;
		refreshActiveShapes();
		routeCounter++;
	}
	
	public void removeFilterSize(String size){
		filter_sizes.remove(size);
		refreshActiveShapes();
		routeCounter++;
	}
	// XL L S M XS
	public void addFilterSize(String size){
		filter_sizes.add(size);
		refreshActiveShapes();
		routeCounter++;
	}
	
	public void removeFilterColor(String color){
		filter_colors.remove(color);
		refreshActiveShapes();
		routeCounter++;
	}
	
	public void addFilterColor(String color){
		filter_colors.add(color);
		refreshActiveShapes();
		routeCounter++;
	}
	
	private void refreshActiveShapes(){
		ArrayList<Shape> active_objects = new ArrayList<Shape>();
		
		//Set level of constraint for filtering
		int NUMBER_OF_FILTERS = 0;
		if(!filter_sizes.isEmpty() && !filter_colors.isEmpty()){
			NUMBER_OF_FILTERS = 3;
		}
		else if(!filter_sizes.isEmpty() || !filter_colors.isEmpty()){
			NUMBER_OF_FILTERS = 2;
		}
		else{
			NUMBER_OF_FILTERS = 1;
		}
		
		for (Shape shape : config.shapes) {
			ClothingItem item = (ClothingItem) shape;
			// Simple filtering
			int j = 0;
			//Check within price range
			if (item.price >= price_min && item.price <= price_max) {
				j++;
			}
			//Check has at least one of the colors
			if (!filter_colors.isEmpty()) {
				Object[] colors = filter_colors.toArray();
				for (int i = 0; i < colors.length; i++) {
					if (item.colors.contains((String) colors[i])) {
						j++;
						break;
					}
				}
			}
			
			if (!filter_sizes.isEmpty()) {
				Object[] sizes = filter_sizes.toArray();
				for (int i = 0; i < filter_sizes.size(); i++) {
					if (item.sizes.contains((String) sizes[i])) {
						j++;
						break;
					}
				}
			}
			
			if(j >= NUMBER_OF_FILTERS){
				active_objects.add(shape);
			}
		}
		active_shapes = new Shape[active_objects.size()];
		for(int i=0; i < active_objects.size(); i++){
			active_shapes[i] = (Shape) active_objects.get(i);
		}		
		updateShapes();
	}
	
	// FIXME only works for Pictures
	private synchronized void updateShapes() {
		
		double maxHeight = 0;
		for (Shape shape : active_shapes) {
			if (shape instanceof Picture) {
				Picture pic = (Picture) shape;
				double height = config.shapeWidth * pic.getHeight()
						/ pic.getWidth();
				if (height > maxHeight) {
					maxHeight = height;
				}
			}
		}
		for (int i = 0; i < active_shapes.length; i++) {
			if (active_shapes[i] instanceof Picture) {
				Picture pic = (Picture) active_shapes[i];
				double j = transpose(i) - active_shapes.length / 2
						+ scrollDelta;
				j = (j < 0 ? -1 : 1)
						* Math.pow(Math.abs(j), config.scrollScale);
				double comp = 0;
				if (j < 0) {
					comp = config.shapeWidth / 2;
				} else if (j > 0) {
					comp = -config.shapeWidth / 2;
				}
				double height = config.shapeWidth * pic.getHeight()
						/ pic.getWidth();
				double top, bottom;
				switch (config.verticalShapeAlignment) {
				case TOP:
					top = maxHeight / 2 - height;
					bottom = maxHeight / 2;
					break;
				case BOTTOM:
					top = -maxHeight / 2;
					bottom = -maxHeight / 2 + height;
					break;
				default:
					top = -height / 2;
					bottom = height / 2;
				}
				double z = -config.zoomFactor
						* Math.pow(Math.abs(j), config.zoomScale);
				Point3D topLeft = new Point3D(-config.shapeWidth / 2 + comp,
						top, 0);
				Point3D bottomRight = new Point3D(config.shapeWidth / 2 + comp,
						bottom, 0);
				pic.setCoordinates(topLeft, bottomRight);
				pic.setRotationMatrix(new RotationMatrix(0,
						-config.shapeRotation * j, 0));
				pic.setLocation(new Point3D(config.shapeSpacing * j - comp, 0,
						z));
			}
		}
		checkActiveShape();
		repaint();
	}

	private synchronized void setActiveShape(Shape shape) {
		if (activeShape != shape) {
			if (activeShape != null) {
				ShapeEvent evt = new ShapeEvent(shape);
				for (ShapeListener listener : listeners) {
					listener.shapeDeactivated(evt);
				}
			}
			activeShape = shape;
			if (activeShape != null) {
				ShapeEvent evt = new ShapeEvent(shape);
				for (ShapeListener listener : listeners) {
					listener.shapeActivated(evt);
				}
			}
		}
	}

	@Override
	public synchronized void paintComponent(Graphics g) {
		//TODO Blow up HERE
		if(active_shapes.length == 0) {} 
		super.paintComponent(g);
		// respect stacking order
		for (int i = 0; i < active_shapes.length / 2; i++) {
			paintShape(active_shapes[untranspose(i)], g);
			paintShape(active_shapes[untranspose(active_shapes.length - 1 - i)], g);
		}
		paintShape(active_shapes[untranspose(active_shapes.length / 2)], g);
	}

	// physical (array) to logical (visual)
	private int transpose(int index) {
		return (index + shapeArrayOffset) % active_shapes.length;
	}

	// logical to physical
	private int untranspose(int index) {
		return (shapeArrayOffset + index)
				% active_shapes.length;
	}

	private void paintShape(Shape shape, Graphics g) {
		shape.paint(g, scene, getSize(), shape == activeShape, config);
	}

	private void checkActiveShape() {
		if (config.enableShapeSelection) {
			SwingUtilities.invokeLater(new ActiveShapeChecker());
		}
	}

	private void updateCursor() {
		setCursor(dragging ? Cursor.getPredefinedCursor(Cursor.MOVE_CURSOR)
				: (activeShape == null ? Cursor.getDefaultCursor() : Cursor
						.getPredefinedCursor(Cursor.HAND_CURSOR)));
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (config.enableShapeSelection && activeShape != null) {
			ShapeEvent evt = new ShapeEvent(activeShape, e);
			for (ShapeListener listener : listeners) {
				listener.shapeClicked(evt);
			}
		}
	}


	public void mouseEntered(MouseEvent e) {
	}


	public void mouseExited(MouseEvent e) {
	}


	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			buttonOnePressed = true;
			dragStart = e.getLocationOnScreen().getX();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		buttonOnePressed = false;
		if (e.getButton() == MouseEvent.BUTTON1) {
			dragging = false;
			updateCursor();
			checkActiveShape();
			if (config.autoScrollAmount == 0) {
				if (easingTimer != null) {
					easingTimer.cancel();
				}
				easingTimer = new Timer();
				easingTimer.scheduleAtFixedRate(new DragEaser(), 0, 100);
			}
		}
	}
	
	//Increments Route
	@Override
	public void mouseDragged(MouseEvent e) {
		if (buttonOnePressed) {
			dragging = true;
			setActiveShape(null);
			updateCursor();
			double dragEnd = e.getLocationOnScreen().getX();
			dragRate = config.scrollFactor * (dragEnd - dragStart) / getWidth();
			setScrollRate(getScrollRate()
					+ (config.inverseScrolling ? dragRate : -dragRate));
			dragStart = dragEnd;
			routeCounter++;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		checkActiveShape();
	}

	private class AutoScroller extends TimerTask {
		@Override
		public void run() {
			if (!dragging) {
				setScrollRate(getScrollRate() + config.autoScrollAmount);
			}
		}
	}

	private class DragEaser extends TimerTask {
		@Override
		public void run() {
			dragRate /= config.dragEaseOutFactor;
			if (dragRate != 0) {
				setScrollRate(getScrollRate() - dragRate);
			} else {
				easingTimer.cancel();
			}
		}
	}

	private class ActiveShapeChecker implements Runnable {
		@Override
		public void run() {
			if (!dragging) {
				Point mp = getMousePosition();
				Shape newActiveShape = null;
				if (mp != null) {
					Point3D p = new Point3D(mp.getX(), mp.getY(), 0);
					int i = 0;
					while (i < active_shapes.length && newActiveShape == null) {
						if (active_shapes[i].contains(p)) {
							newActiveShape = active_shapes[i];
						}
						i++;
					}
				}
				repaint();
				if (activeShape != newActiveShape) {
					setActiveShape(newActiveShape);
				}
			}
			updateCursor();
		}
	}
}
