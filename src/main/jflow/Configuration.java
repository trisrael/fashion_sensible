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

import java.awt.Color;

public class Configuration {
	public enum VerticalAlignment {
		TOP, MIDDLE, BOTTOM
	}

	public Shape[] shapes;

	public double shapeWidth = 1.0 / 3.0;

	public VerticalAlignment verticalShapeAlignment = VerticalAlignment.BOTTOM;

	public double shapeRotation = Math.PI / 6;

	public double shapeSpacing = 1.0 / 3;

	public double scrollScale = 7.0 / 8;

	public double scrollFactor = 3;

	public double autoScrollAmount = 0;

	public double dragEaseOutFactor = 4.0 / 3;

	public boolean inverseScrolling = false;

	public boolean enableShapeSelection = true;

	public boolean enableAlphaTransparency = true	;

	public int framesPerSecond = 60;

	public double reflectionOpacity = 1.0 / 4;

	public double darkeningFactor = 3;

	public boolean darkenBorder = true;

	public double zoomScale = 10;

	public double zoomFactor = 0.02;

	public int pictureReflectionOverlap = 2;

	public int activeShapeBorderWidth = 3;

	public Color backgroundColor = Color.black;

	public Color activeShapeBorderColor = Color.blue;
}
