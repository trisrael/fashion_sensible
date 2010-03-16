/*
 * Created by JFormDesigner on Fri Mar 12 16:00:20 PST 2010
 */

package MainScreen;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 * @author Travis Holt
 */
public class Prototype  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Travis Holt
		FashionSensible = new JPanel();
		TeamLabel = new JLabel();
		BrowseLabel = new JLabel();
		panel1 = new JPanel();
		button7 = new JButton();	
		button8 = new JButton();
		button9 = new JButton();
		button10 = new JButton();
		button11 = new JButton();
		button12 = new JButton();
		button13 = new JButton();
		separator1 = new JSeparator();
		CellConstraints cc = new CellConstraints();

		//======== FashionSensible ========
		{

			// JFormDesigner evaluation mark
			FashionSensible.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), FashionSensible.getBorder())); FashionSensible.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			FashionSensible.setLayout(new FormLayout(
				"6*(default, $lcgap), default",
				"3*(default, $lgap), 78dlu, $lgap, default, $lgap, 23dlu"));

			//---- TeamLabel ----
			TeamLabel.setText("Fashion Sensible");
			TeamLabel.setFont(new Font("Dialog", Font.BOLD, 14));
			FashionSensible.add(TeamLabel, cc.xywh(7, 3, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- BrowseLabel ----
			BrowseLabel.setText("Browse Items");
			FashionSensible.add(BrowseLabel, cc.xywh(7, 5, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//======== panel1 ========
			{
				panel1.setLayout(new FormLayout(
					"6*(default, $lcgap), default",
					"86dlu"));

				//---- button7 ----
				button7.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/CollaredShirts.png")));
				panel1.add(button7, cc.xywh(1, 1, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

				//---- button8 ----
				button8.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/Shirt.png")));
				panel1.add(button8, cc.xy(3, 1));

				//---- button9 ----
				button9.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/Jackets.png")));
				panel1.add(button9, cc.xy(5, 1));

				//---- button10 ----
				button10.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/TankTop.png")));
				panel1.add(button10, cc.xy(7, 1));

				//---- button11 ----
				button11.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/Dresses.png")));
				panel1.add(button11, cc.xy(9, 1));

				//---- button12 ----
				button12.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/Pants.png")));
				panel1.add(button12, cc.xy(11, 1));

				//---- button13 ----
				button13.setIcon(new ImageIcon(getClass().getResource("/MainScreen/DockItems/underwear.png")));
				panel1.add(button13, cc.xy(13, 1));
			}
			FashionSensible.add(panel1, cc.xy(7, 7));
			FashionSensible.add(separator1, cc.xy(7, 9));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}
	
	public static void main(String[] ARGS)
	{
		Prototype myProtoType = new Prototype();
		myProtoType.initComponents();
		
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Travis Holt
	private JPanel FashionSensible;
	private JLabel TeamLabel;
	private JLabel BrowseLabel;
	private JPanel panel1;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JSeparator separator1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
