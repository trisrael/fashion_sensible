package demo;
import java.awt.*;
import java.awt.event.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.event.*;

import shape.Picture;

import com.jgoodies.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Tue Mar 16 01:24:33 PDT 2010
 */
import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jidesoft.swing.*;
import com.jidesoft.utils.DateUtils;

import main.jflow.JFlowPanel;
import net.java.dev.colorchooser.*;
import event.*;


/**
 * @author Awais Iqbal
 */
public class MainScreen extends JFrame {
	public MainScreen(){

		try {
			UIManager.setLookAndFeel(new Plastic3DLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		initComponents();
	}

	private void DockButton_JacketMouseClicked(MouseEvent e) {
		DockLabel_Jacket.setEnabled(true);
		DockLabel_CShirt.setEnabled(false);
		DockLabel_TShirt.setEnabled(false);
		DockLabel_TTop.setEnabled(false);
		DockLabel_Dress.setEnabled(false);
		DockLabel_Pants.setEnabled(false);
		DockLabel_UWear.setEnabled(false);
	}

	private void DockButton_CShirtMouseClicked(MouseEvent e) {
		DockLabel_Jacket.setEnabled(false);
		DockLabel_CShirt.setEnabled(true);
		DockLabel_TShirt.setEnabled(false);
		DockLabel_TTop.setEnabled(false);
		DockLabel_Dress.setEnabled(false);
		DockLabel_Pants.setEnabled(false);
		DockLabel_UWear.setEnabled(false);
	}

	private void DockButton_TShirtMouseClicked(MouseEvent e) {
		coverFlow().resetAll();
		System.out.println("**--__Male");
		isMale = true;
		femaleCoverFlow.setVisible(false);
		maleCoverFlow.setVisible(true);
		
		DockLabel_Jacket.setEnabled(false);
		DockLabel_CShirt.setEnabled(false);
		DockLabel_TShirt.setEnabled(true);
		DockLabel_TTop.setEnabled(false);
		DockLabel_Dress.setEnabled(false);
		DockLabel_Pants.setEnabled(false);
		DockLabel_UWear.setEnabled(false);
	}

	private void DockButton_TTopMouseClicked(MouseEvent e) {
		DockLabel_Jacket.setEnabled(false);
		DockLabel_CShirt.setEnabled(false);
		DockLabel_TShirt.setEnabled(false);
		DockLabel_TTop.setEnabled(true);
		DockLabel_Dress.setEnabled(false);
		DockLabel_Pants.setEnabled(false);
		DockLabel_UWear.setEnabled(false);
	}

	private void DockButton_DressMouseClicked(MouseEvent e) {
		coverFlow().resetAll();
		isMale = false;
		System.out.println("**--__Female switch");
		femaleCoverFlow.setVisible(true);
		maleCoverFlow.setVisible(false);
		
		
		DockLabel_Jacket.setEnabled(false);
		DockLabel_CShirt.setEnabled(false);
		DockLabel_TShirt.setEnabled(false);
		DockLabel_TTop.setEnabled(false);
		DockLabel_Dress.setEnabled(true);
		DockLabel_Pants.setEnabled(false);
		DockLabel_UWear.setEnabled(false);
	}

	private void DockButton_PantsMouseClicked(MouseEvent e) {
		DockLabel_Jacket.setEnabled(false);
		DockLabel_CShirt.setEnabled(false);
		DockLabel_TShirt.setEnabled(false);
		DockLabel_TTop.setEnabled(false);
		DockLabel_Dress.setEnabled(false);
		DockLabel_Pants.setEnabled(true);
		DockLabel_UWear.setEnabled(false);
	}

	private void DockButton_UwearMouseClicked(MouseEvent e) {
		DockLabel_Jacket.setEnabled(false);
		DockLabel_CShirt.setEnabled(false);
		DockLabel_TShirt.setEnabled(false);
		DockLabel_TTop.setEnabled(false);
		DockLabel_Dress.setEnabled(false);
		DockLabel_Pants.setEnabled(false);
		DockLabel_UWear.setEnabled(true);
	}

	private void DockButton_JacketMouseEntered(MouseEvent e) {
		// TODO add your code here
	}

	private void DockButton_JacketMouseExited(MouseEvent e) {
		// TODO add your code here
	}

	private void SizeButton_XSMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("XS");
		coverFlow().resetSizes(false);
		coverFlow().addFilterSize("XS");
	}

	private void SizeButton_SMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("S");
		coverFlow().resetSizes(false);
		coverFlow().addFilterSize("S");
	}

	private void SizeButton_MMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("M");
		coverFlow().resetSizes(false);
		coverFlow().addFilterSize("M");
	}

	private void SizeButton_LMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("L");
		coverFlow().resetSizes(false);
		coverFlow().addFilterSize("L");
	}

	private void SizeButton_XLMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("XL");
		coverFlow().resetSizes(false);
		coverFlow().addFilterSize("XL");
	}

	private void SizeButton_ClearMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("--");
		coverFlow().resetSizes(false);
	}
	
	private void Button_DarkBlueMouseClicked(MouseEvent e){
		Label_ColorStatus.setBackground(new Color(0, 0, 132));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("dark blue");
	}

	private void Button_BlackMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 0, 0));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("black");

	}

	private void ButtonPinkButtonClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 31, 229));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("pink");
	}

	private void Button_GreyMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(198, 198, 198));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("grey");
	}

	private void Button_BlueMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0,0,255));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("blue");
	}

	private void Button_GreenMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(54, 127, 31));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("green");
	}

	private void ButtonLightBlue(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 255, 255));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("light blue");
	}

	private void Button_RedMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 0, 0));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("red");
	}

	private void Button_PurpleMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(94, 61, 155));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("purple");
	}

	private void Button_YellowMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 255, 0));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("yellow");
	}

	private void Button_WhiteMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 255, 255));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("white");
	}

	private void ColorButton_ClearMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(225, 225, 225));
		coverFlow().resetColors(false);
	}

	private void setPrice50_74(MouseEvent e) {
		Label_PriceStatus.setText("$50-$74");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(50,74);
	}

	private void setPrice75_99(MouseEvent e) {
		Label_PriceStatus.setText("$75-$99");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(75, 99);
	}

	private void setPrice100AndUp(MouseEvent e) {
		Label_PriceStatus.setText("$100 And Up");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(100,150);
	}
	
	private void setPrice25_49(MouseEvent e) {
		Label_PriceStatus.setText("$25-$49");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(25,49);
	}

	private void PriceButton_ClearMouseClicked(MouseEvent e) {
		Label_PriceStatus.setText("----------");
		coverFlow().resetPrice(true);
	}
	int a = 1;
	private void Button_AddPaletteMouseClicked(MouseEvent e) {
		
		if(a==1)
		{
		colorChooser3.setVisible(true);
		colorChooser3.setEnabled(true);
		Button_AddPalette.setText("Remove Color");
		colorChooser3.setColor(Color.red);
		a = 2;
		}
		else if (a==2)
		{
			colorChooser3.setVisible(false);
			//colorChooser3.setEnabled(false);
			Button_AddPalette.setText("Add More Colors");
			colorChooser3.setColor(Color.red);			
			a = 1;
		}
	}

	private void rangeSlider1StateChanged(ChangeEvent e) {
		textField2.setText( Integer.toString(rangeSlider1.getLowValue()));
		textField3.setText( Integer.toString(rangeSlider1.getHighValue()));
	}

	private void comboBox1ActionPerformed(ActionEvent e) {
		JComboBox cb = (JComboBox)e.getSource();
		String DesignSelection = (String)cb.getSelectedItem();
		System.out.println(DesignSelection);
		if (DesignSelection == "Design A")
		{
			Frame_ShirtFilter.setVisible(true);
			DesignB.setVisible(false);
		}
		else if (DesignSelection == "Design B")
		{
			Frame_ShirtFilter.setVisible(false);
			DesignB.setVisible(true);
		}
		else
		{
			Frame_ShirtFilter.setVisible(false);
			DesignB.setVisible(false);
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Travis Holt
		
		TeamTitleLabel = new JLabel();
		FilterItemLabel = new JLabel();
		separator1 = new JSeparator();
		panel2 = new JPanel();
		comboBox1 = new JComboBox();
		textField1 = new JTextField();
		startTiming = new JButton();
		beingTimed = false;
		panel1 = new JPanel();
		DockButton_Jacket = new JButton();
		DockButton_CShirt = new JButton();
		DockButton_TShirt = new JButton();
		DockButton_TTop = new JButton();
		DockButton_Dress = new JButton();
		DockButton_Pants = new JButton();
		DockButton_Uwear = new JButton();
		DockLabel_Jacket = new JLabel();
		DockLabel_CShirt = new JLabel();
		DockLabel_TShirt = new JLabel();
		DockLabel_TTop = new JLabel();
		DockLabel_Dress = new JLabel();
		DockLabel_Pants = new JLabel();
		DockLabel_UWear = new JLabel();
		separator2 = new JSeparator();
		Frame_ShirtFilter = new JInternalFrame();
		Label_Options = new JLabel();
		vSpacer2 = new JPanel(null);
		Label_SizeSelection = new JLabel();
		splitPane2 = new JSplitPane();
		Label_SizeStatus = new JLabel();
		SizeButton_Clear = new JButton();
		panel6 = new JPanel();
		SizeButton_XS = new JButton();
		SizeButton_S = new JButton();
		SizeButton_M = new JButton();
		SizeButton_L = new JButton();
		SizeButton_XL = new JButton();
		vSpacer1 = new JPanel(null);
		Label_ColorSelection = new JLabel();
		splitPane1 = new JSplitPane();
		Label_ColorStatus = new JButton();
		ColorButton_Clear = new JButton();
		colorPalette = new JPanel();
		Button_Black = new JButton();
		Button_DarkBlue = new JButton();
		Button_Pink = new JButton();
		Button_Grey = new JButton();
		Button_Blue = new JButton();
		Button_Green = new JButton();
		ButtonLightBlue = new JButton();
		Button_Red = new JButton();
		Button_Purple = new JButton();
		Button_Yellow = new JButton();
		Button_White = new JButton();
		vSpacer3 = new JPanel(null);
		Label_PriceSelection = new JLabel();
		splitPane3 = new JSplitPane();
		Label_PriceStatus = new JLabel();
		PriceButton_Clear = new JButton();
		panel8 = new JPanel();
		bPrice25_50 = new JButton();
		bPrice50_75 = new JButton();
		bPrice75_100 = new JButton();
		bPriceMore100 = new JButton();
		DesignB = new JInternalFrame();
		label1 = new JLabel();
		label2 = new JLabel();
		panel3 = new JPanel();
		Toggle_XS = new JToggleButton();
		Toggle_S = new JToggleButton();
		Toggle_M = new JToggleButton();
		Toggle_L = new JToggleButton();
		Toggle_XL = new JToggleButton();
		vSpacer4 = new JPanel(null);
		label3 = new JLabel();
		panel4 = new JPanel();
		colorChooser2 = new ColorChooser();
		colorChooser3 = new ColorChooser();
		Button_AddPalette = new JButton();
		vSpacer5 = new JPanel(null);
		label4 = new JLabel();
		textField2 = new JTextField();
		rangeSlider1 = new RangeSlider();
		textField3 = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle("Fashion Sensible");
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"default, $lcgap, 195dlu, $lcgap, default, $lcgap, 149dlu, $lcgap, default",
			"7*(default, $lgap), 253dlu, 2*($lgap, default)"));

		//---- TeamTitleLabel ----
		TeamTitleLabel.setText("Fashion Sensible");
		TeamTitleLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		contentPane.add(TeamTitleLabel, cc.xywh(5, 3, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

		//---- FilterItemLabel ----
		FilterItemLabel.setText("Filtering Items");
		contentPane.add(FilterItemLabel, cc.xywh(5, 5, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));
		contentPane.add(separator1, cc.xy(5, 7));

		//======== panel2 ========
		{

			// JFormDesigner evaluation mark
			panel2.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel2.getBorder())); panel2.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

			panel2.setLayout(new FormLayout(
				"51dlu, $lcgap, 54dlu",
				"default, $lgap, default"));

			//---- comboBox1 ----
			comboBox1.setModel(new DefaultComboBoxModel(new String[] {
				"<Design>",
				"Design A",
				"Design B"
			}));
			comboBox1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboBox1ActionPerformed(e);
				}
			});
			panel2.add(comboBox1, cc.xy(1, 1));
			panel2.add(textField1, cc.xy(3, 1));

			//---- button1 ----
			startTiming.setText("Start");
			startTiming.setBackground(Color.green);
			startTiming.addMouseListener( new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				int b =1;
				@Override
				public void mousePressed(MouseEvent e){}
				public void mouseExited(MouseEvent e){}
				public void mouseEntered(MouseEvent e){}
				public void mouseClicked(MouseEvent e)
				{
				/*	if(b==1)
					{
						watch.start();
						b=2;
					}
					if(b==2)
					{
						watch.stop();
						System.out.println("Time Taken: " + watch.getElapsedTimeSecs());
						b=1;
					}*/
					
					
					if(!beingTimed){
//						beingTimed = true;
//						tempTime = new Timer();
//						
//						System.out.println("Task begun:");
//						startTiming.setText("Stop");
//						startTiming.setBackground(Color.red);
					}else{
//						beingTimed = false;
//						System.out.println("Task Completion Time: " + (tempTime - cal.getTime().getTime()));
//						startTiming.setBackground(Color.green);
//						startTiming.setText("Start");
						}
				}
			});
			panel2.add(startTiming, cc.xy(1, 3));
		}
		contentPane.add(panel2, cc.xywh(3, 9, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"6*(default, $lcgap), default",
				"2*(default)"));

			//---- DockButton_Jacket ----
			DockButton_Jacket.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/Jackets.png")));
			DockButton_Jacket.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_JacketMouseClicked(e);
				}
			});
			panel1.add(DockButton_Jacket, cc.xy(1, 1));

			//---- DockButton_CShirt ----
			DockButton_CShirt.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/CollaredShirts.png")));
			DockButton_CShirt.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_CShirtMouseClicked(e);
				}
			});
			panel1.add(DockButton_CShirt, cc.xy(3, 1));

			//---- DockButton_TShirt ----
			DockButton_TShirt.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/Shirt.png")));
			DockButton_TShirt.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_TShirtMouseClicked(e);
				}
			});
			panel1.add(DockButton_TShirt, cc.xy(5, 1));

			//---- DockButton_TTop ----
			DockButton_TTop.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/TankTop.png")));
			DockButton_TTop.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_TTopMouseClicked(e);
				}
			});
			panel1.add(DockButton_TTop, cc.xy(7, 1));

			//---- DockButton_Dress ----
			DockButton_Dress.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/Dresses.png")));
			DockButton_Dress.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_DressMouseClicked(e);
				}
			});
			panel1.add(DockButton_Dress, cc.xy(9, 1));

			//---- DockButton_Pants ----
			DockButton_Pants.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/Pants.png")));
			DockButton_Pants.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_PantsMouseClicked(e);
				}
			});
			panel1.add(DockButton_Pants, cc.xy(11, 1));

			//---- DockButton_Uwear ----
			DockButton_Uwear.setIcon(new ImageIcon(getClass().getResource("/Assets/DockItems/underwear.png")));
			DockButton_Uwear.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					DockButton_UwearMouseClicked(e);
				}
			});
			panel1.add(DockButton_Uwear, cc.xy(13, 1));

			//---- DockLabel_Jacket ----
			DockLabel_Jacket.setText("Jackets");
			DockLabel_Jacket.setEnabled(false);
			panel1.add(DockLabel_Jacket, cc.xywh(1, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- DockLabel_CShirt ----
			DockLabel_CShirt.setText("Collared Shirts");
			DockLabel_CShirt.setEnabled(false);
			panel1.add(DockLabel_CShirt, cc.xywh(3, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- DockLabel_TShirt ----
			DockLabel_TShirt.setText("T-Shirts");
			DockLabel_TShirt.setEnabled(false);
			panel1.add(DockLabel_TShirt, cc.xywh(5, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- DockLabel_TTop ----
			DockLabel_TTop.setText("Tank Tops");
			DockLabel_TTop.setEnabled(false);
			panel1.add(DockLabel_TTop, cc.xywh(7, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- DockLabel_Dress ----
			DockLabel_Dress.setText("Dresses");
			DockLabel_Dress.setEnabled(false);
			panel1.add(DockLabel_Dress, cc.xywh(9, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- DockLabel_Pants ----
			DockLabel_Pants.setText("Pants");
			DockLabel_Pants.setEnabled(false);
			panel1.add(DockLabel_Pants, cc.xywh(11, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

			//---- DockLabel_UWear ----
			DockLabel_UWear.setText("Underwear");
			DockLabel_UWear.setEnabled(false);
			panel1.add(DockLabel_UWear, cc.xywh(13, 2, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));
		}
		contentPane.add(panel1, cc.xy(5, 9));
		contentPane.add(separator2, cc.xy(5, 11));

		//======== Frame_ShirtFilter ========
		{
			Frame_ShirtFilter.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			Frame_ShirtFilter.setTitle("Design A");
			Container Frame_ShirtFilterContentPane = Frame_ShirtFilter.getContentPane();
			Frame_ShirtFilterContentPane.setLayout(new FormLayout(
				"default, $lcgap, 85dlu, $lcgap, default",
				"default, $lgap, [8dlu,default], 2*($lgap, default), $lgap, 10dlu, 2*($lgap, default), $lgap, 11dlu, 3*($lgap, default)"));

			//---- Label_Options ----
			Label_Options.setText("Options");
			Label_Options.setFont(new Font("Dialog", Font.BOLD, 14));
			Frame_ShirtFilterContentPane.add(Label_Options, cc.xy(3, 1));
			Frame_ShirtFilterContentPane.add(vSpacer2, cc.xy(3, 3));

			//---- Label_SizeSelection ----
			Label_SizeSelection.setText("Size:");
			Frame_ShirtFilterContentPane.add(Label_SizeSelection, cc.xy(1, 5));

			//======== splitPane2 ========
			{

				//---- Label_SizeStatus ----
				Label_SizeStatus.setText("--");
				splitPane2.setLeftComponent(Label_SizeStatus);

				//---- SizeButton_Clear ----
				SizeButton_Clear.setText("Clear");
				SizeButton_Clear.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						coverFlow().resetSizes(true);
						Label_SizeStatus.setText("--");
					}
				});
				splitPane2.setRightComponent(SizeButton_Clear);
			}
			Frame_ShirtFilterContentPane.add(splitPane2, cc.xywh(3, 5, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

			//======== panel6 ========
			{
				panel6.setLayout(new FormLayout(
					"[16dlu,min], [16dlu,default], 3*([16dlu,min])",
					"default"));

				//---- SizeButton_XS ----
				SizeButton_XS.setText("XS");
				SizeButton_XS.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SizeButton_XSMouseClicked(e);
					}
				});
				panel6.add(SizeButton_XS, cc.xy(1, 1));

				//---- SizeButton_S ----
				SizeButton_S.setText("S");
				SizeButton_S.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SizeButton_SMouseClicked(e);
					}
				});
				panel6.add(SizeButton_S, cc.xy(2, 1));

				//---- SizeButton_M ----
				SizeButton_M.setText("M");
				SizeButton_M.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SizeButton_MMouseClicked(e);
					}
				});
				panel6.add(SizeButton_M, cc.xy(3, 1));

				//---- SizeButton_L ----
				SizeButton_L.setText("L");
				SizeButton_L.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SizeButton_LMouseClicked(e);
					}
				});
				panel6.add(SizeButton_L, cc.xy(4, 1));

				//---- SizeButton_XL ----
				SizeButton_XL.setText("XL");
				SizeButton_XL.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						SizeButton_XLMouseClicked(e);
					}
				});
				panel6.add(SizeButton_XL, cc.xy(5, 1));
			}
			Frame_ShirtFilterContentPane.add(panel6, cc.xywh(3, 7, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));
			Frame_ShirtFilterContentPane.add(vSpacer1, cc.xy(3, 9));

			//---- Label_ColorSelection ----
			Label_ColorSelection.setText("Color:");
			Frame_ShirtFilterContentPane.add(Label_ColorSelection, cc.xy(1, 11));

			//======== splitPane1 ========
			{

				//---- Label_ColorStatus ----
				Label_ColorStatus.setText("   ");
				Label_ColorStatus.setEnabled(false);
				splitPane1.setLeftComponent(Label_ColorStatus);

				//---- ColorButton_Clear ----
				ColorButton_Clear.setText("Clear");
				ColorButton_Clear.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ColorButton_ClearMouseClicked(e);
					}
				});
				splitPane1.setRightComponent(ColorButton_Clear);
			}
			Frame_ShirtFilterContentPane.add(splitPane1, cc.xywh(3, 11, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

			//======== panel7 ========
			{
				colorPalette.setLayout(new FormLayout(
					"9*(default)",
					"2*(default)"));

				//---- Button_Black ----
				Button_Black.setText(" ");
				Button_Black.setBackground(Color.black);
				Button_Black.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_BlackMouseClicked(e);
					}
				});
				colorPalette.add(Button_Black, cc.xy(1, 1));
				
				//---- Button_Grey ----
				Button_Grey.setText(" ");
				Button_Grey.setBackground(new Color(198, 198, 198));
				Button_Grey.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_GreyMouseClicked(e);
					}
				});
				colorPalette.add(Button_Grey, cc.xy(2, 1));

				//---- Button_White ----
				Button_White.setText(" ");
				Button_White.setBackground(Color.white);
				Button_White.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_WhiteMouseClicked(e);
					}
				});
				colorPalette.add(Button_White, cc.xy(1, 2));
				
				//---- Button_Red ----
				Button_Red.setText(" ");
				Button_Red.setBackground(Color.red);
				Button_Red.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_RedMouseClicked(e);
					}
				});
				colorPalette.add(Button_Red, cc.xy(2, 2));

				//---- Button_Pink ----
				Button_Pink.setText(" ");
				Button_Pink.setBackground(new Color(255, 31, 229));
				Button_Pink.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ButtonPinkButtonClicked(e);
					}
				});
				colorPalette.add(Button_Pink, cc.xy(3, 1));
				
				//---- Button_Purple ----
				Button_Purple.setText(" ");
				Button_Purple.setBackground(new Color(94, 61, 155));
				Button_Purple.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_PurpleMouseClicked(e);
					}
				});
				colorPalette.add(Button_Purple, cc.xy(3, 2));

				//---- Button_Yellow ----
				Button_Yellow.setText(" ");
				Button_Yellow.setBackground(Color.yellow);
				Button_Yellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_YellowMouseClicked(e);
					}
				});
				colorPalette.add(Button_Yellow, cc.xy(4, 1));
				

				//---- Button_Green ----
				Button_Green.setText(" ");
				Button_Green.setBackground(new Color(54, 127, 31));
				Button_Green.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_GreenMouseClicked(e);
					}
				});
				colorPalette.add(Button_Green, cc.xy(4, 2));

				
				//---- Button Light Blue ----
				ButtonLightBlue.setText(" ");
				ButtonLightBlue.setBackground(new Color(207, 247, 255));
				ButtonLightBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ButtonLightBlue(e);
					}
				});
				colorPalette.add(ButtonLightBlue, cc.xy(5, 1));

				
				//---- Button_Blue ----
				Button_Blue.setText(" ");
				Button_Blue.setBackground(Color.blue);
				Button_Blue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_BlueMouseClicked(e);
					}
				});
				colorPalette.add(Button_Blue, cc.xy(5, 2));

				//---- Button_DarkBlue ----
				Button_DarkBlue.setText(" ");
				Button_DarkBlue.setBackground(new Color(0, 0, 132));
				Button_DarkBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkBlueMouseClicked(e);
					}
				});
				colorPalette.add(Button_DarkBlue, cc.xy(6, 1));
			
			}
			Frame_ShirtFilterContentPane.add(colorPalette, cc.xy(3, 13));
			Frame_ShirtFilterContentPane.add(vSpacer3, cc.xy(3, 15));

			//---- Label_PriceSelection ----
			Label_PriceSelection.setText("Price:");
			Frame_ShirtFilterContentPane.add(Label_PriceSelection, cc.xy(1, 17));

			//======== splitPane3 ========
			{

				//---- Label_PriceStatus ----
				Label_PriceStatus.setText("----------");
				splitPane3.setLeftComponent(Label_PriceStatus);

				//---- PriceButton_Clear ----
				PriceButton_Clear.setText("Clear");
				PriceButton_Clear.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						PriceButton_ClearMouseClicked(e);
					}
				});
				splitPane3.setRightComponent(PriceButton_Clear);
			}
			Frame_ShirtFilterContentPane.add(splitPane3, cc.xywh(3, 17, 1, 1, CellConstraints.LEFT, CellConstraints.DEFAULT));

			//======== panel8 ========
			{
				panel8.setLayout(new FormLayout(
					"default",
					"3*(default, $lgap), default"));

				//---- Button_Price25_49 ----
				bPrice25_50.setText("$25-$49");
				bPrice25_50.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice25_49(e);
					}
				});
				panel8.add(bPrice25_50, cc.xy(1, 1));

				//---- Button_Price50_75 ----
				bPrice50_75.setText("$50-$74");
				bPrice50_75.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice50_74(e);
					}
				});
				panel8.add(bPrice50_75, cc.xy(1, 3));

				//---- Button_Price75_100----
				bPrice75_100.setText("$75-$99");
				bPrice75_100.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice75_99(e);
					}
				});
				panel8.add(bPrice75_100, cc.xy(1, 5));

				//---- Button_PriceMore100 ----
				bPriceMore100.setText("More than $100");
				bPriceMore100.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice100AndUp(e);
					}
				});
				panel8.add(bPriceMore100, cc.xy(1, 7));
			}
			Frame_ShirtFilterContentPane.add(panel8, cc.xy(3, 19));
		}
		contentPane.add(Frame_ShirtFilter, cc.xywh(3, 13, 1, 5));

		//======== internalFrame1 ========
		{
			DesignB.setTitle("Design B");
			Container internalFrame1ContentPane = DesignB.getContentPane();
			internalFrame1ContentPane.setLayout(new FormLayout(
				"2*(default, $lcgap), 20dlu, $lcgap, default, $lcgap, 22dlu, 4*($lcgap, default)",
				"4*(default, $lgap), 47dlu, 2*($lgap, default), $lgap, 26dlu, 10*($lgap, default)"));

			//---- label1 ----
			label1.setText("Options");
			internalFrame1ContentPane.add(label1, cc.xy(3, 3));

			//---- label2 ----
			label2.setText("Size");
			internalFrame1ContentPane.add(label2, cc.xy(3, 5));

			//======== panel3 ========
			{
				panel3.setLayout(new FormLayout(
					"16dlu, 4*([16dlu,default])",
					"default"));

				//---- Toggle_XS ----
				Toggle_XS.setText("XS");
				panel3.add(Toggle_XS, cc.xy(1, 1));

				//---- Toggle_S ----
				Toggle_S.setText("S");
				panel3.add(Toggle_S, cc.xy(2, 1));

				//---- Toggle_M ----
				Toggle_M.setText("M");
				panel3.add(Toggle_M, cc.xy(3, 1));

				//---- Toggle_L ----
				Toggle_L.setText("L");
				panel3.add(Toggle_L, cc.xy(4, 1));

				//---- Toggle_XL ----
				Toggle_XL.setText("XL");
				panel3.add(Toggle_XL, cc.xy(5, 1));
			}
			internalFrame1ContentPane.add(panel3, cc.xy(7, 5));
			internalFrame1ContentPane.add(vSpacer4, cc.xy(7, 7));

			//---- label3 ----
			label3.setText("Color Palette");
			internalFrame1ContentPane.add(label3, cc.xy(3, 9));

			//======== panel4 ========
			{
				panel4.setLayout(new FormLayout(
					"23dlu, $lcgap, default",
					"22dlu, $lgap, default"));

				//---- colorChooser2 ----
				colorChooser2.setToolTipText("Click and hold to select a color from the rainbow palette");
				panel4.add(colorChooser2, cc.xy(1, 1));

				//---- colorChooser3 ----
				colorChooser3.setColor(new Color(225, 225, 225));
				colorChooser3.setEnabled(false);
				colorChooser3.setToolTipText("Click and hold to select color from the rainbow palette");
				panel4.add(colorChooser3, cc.xy(1, 3));

				//---- Button_AddPalette ----
				Button_AddPalette.setText("Select More Colors");
				Button_AddPalette.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_AddPaletteMouseClicked(e);
					}
				});
				panel4.add(Button_AddPalette, cc.xy(3, 3));
			}
			internalFrame1ContentPane.add(panel4, cc.xywh(7, 9, 1, 1, CellConstraints.DEFAULT, CellConstraints.BOTTOM));
			internalFrame1ContentPane.add(vSpacer5, cc.xy(7, 11));

			//---- label4 ----
			label4.setText("Price Range");
			internalFrame1ContentPane.add(label4, cc.xy(3, 15));

			//---- textField2 ----
			textField2.setText("25");
			textField2.setEditable(false);
			internalFrame1ContentPane.add(textField2, cc.xy(5, 15));

			//---- rangeSlider1 ----
			rangeSlider1.setHighValue(75);
			rangeSlider1.setLowValue(25);
			rangeSlider1.setPaintTicks(true);
			rangeSlider1.setPaintLabels(true);
			rangeSlider1.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					rangeSlider1StateChanged(e);
				}
			});
			internalFrame1ContentPane.add(rangeSlider1, cc.xy(7, 15));

			//---- textField3 ----
			textField3.setText("75");
			textField3.setEditable(false);
			internalFrame1ContentPane.add(textField3, cc.xy(9, 15));
		}
		contentPane.add(DesignB, cc.xywh(3, 15, 1, 1, CellConstraints.DEFAULT, CellConstraints.TOP));
		setSize(1475, 715);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
		setupCoverFlows(this, cc);
	}
	
	//setupCoverFlows(getContentPane(), cc);
	public void setupCoverFlows(Container container, CellConstraints cc){
		femaleCoverFlow.setPreferredSize(new Dimension(800, 300));
		femaleCoverFlow.addListener(new ShapeListener() {
			public void shapeClicked(ShapeEvent e) {
				MouseEvent me = e.getMouseEvent();
				if (!me.isConsumed() && me.getButton() == MouseEvent.BUTTON1
						&& me.getClickCount() == 1) {
					System.out.println(e.getShape());
					Picture pic = (Picture) e.getShape();
					//TODO Add some feedback to let them know they actually clicked something
				}
			}

			@Override
			public void shapeActivated(ShapeEvent e) {
			}

			@Override
			public void shapeDeactivated(ShapeEvent e) {
			}
		});
		
		femaleCoverFlow.setPreferredSize(new Dimension(800, 300));
		femaleCoverFlow.addListener(new ShapeListener() {
			public void shapeClicked(ShapeEvent e) {
				MouseEvent me = e.getMouseEvent();
				if (!me.isConsumed() && me.getButton() == MouseEvent.BUTTON1
						&& me.getClickCount() == 1) {
					System.out.println(e.getShape());
					Picture pic = (Picture) e.getShape();
					//TODO Add some feedback to let them know they actually clicked something
				}
			}

			@Override
			public void shapeActivated(ShapeEvent e) {
			}

			@Override
			public void shapeDeactivated(ShapeEvent e) {
			}
		});
		
		maleCoverFlow.setPreferredSize(new Dimension(800, 300));
		maleCoverFlow.addListener(new ShapeListener() {
			public void shapeClicked(ShapeEvent e) {
				MouseEvent me = e.getMouseEvent();
				if (!me.isConsumed() && me.getButton() == MouseEvent.BUTTON1
						&& me.getClickCount() == 1) {
					System.out.println(e.getShape());
					Picture pic = (Picture) e.getShape();
					//TODO Add some feedback to let them know they actually clicked something
				}
			}

			@Override
			public void shapeActivated(ShapeEvent e) {
			}

			@Override
			public void shapeDeactivated(ShapeEvent e) {
			}
		});
		
		isMale = true;
		femaleCoverFlow.setVisible(false);
		container.add(femaleCoverFlow, cc.xywh(5, 13, 1, 6, CellConstraints.RIGHT, CellConstraints.DEFAULT));
		container.add(maleCoverFlow, cc.xywh(5, 13, 1, 6, CellConstraints.RIGHT, CellConstraints.DEFAULT));
	}
	
	public JFlowPanel coverFlow(){
		if(isMale){
		return maleCoverFlow;	
		}		
		return femaleCoverFlow;
	}
	
	private boolean isMale;
	final JFlowPanel femaleCoverFlow = new JFlowPanel(new FemaleConfig());
	final JFlowPanel maleCoverFlow = new JFlowPanel(new MaleConfig());

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Travis Holt
	private JLabel TeamTitleLabel;
	private JLabel FilterItemLabel;
	private JSeparator separator1;
	private JPanel panel2;
	private JComboBox comboBox1;
	private JTextField textField1;
	private JButton startTiming;
	private Timer tempTime;
	private boolean beingTimed;
	private JPanel panel1;
	private JButton DockButton_Jacket;
	private JButton DockButton_CShirt;
	private JButton DockButton_TShirt;
	private JButton DockButton_TTop;
	private JButton DockButton_Dress;
	private JButton DockButton_Pants;
	private JButton DockButton_Uwear;
	private JLabel DockLabel_Jacket;
	private JLabel DockLabel_CShirt;
	private JLabel DockLabel_TShirt;
	private JLabel DockLabel_TTop;
	private JLabel DockLabel_Dress;
	private JLabel DockLabel_Pants;
	private JLabel DockLabel_UWear;
	private JSeparator separator2;
	private JInternalFrame Frame_ShirtFilter;
	private JLabel Label_Options;
	private JPanel vSpacer2;
	private JLabel Label_SizeSelection;
	private JSplitPane splitPane2;
	private JLabel Label_SizeStatus;
	private JButton SizeButton_Clear;
	private JPanel panel6;
	private JButton SizeButton_XS;
	private JButton SizeButton_S;
	private JButton SizeButton_M;
	private JButton SizeButton_L;
	private JButton SizeButton_XL;
	private JPanel vSpacer1;
	private JLabel Label_ColorSelection;
	private JSplitPane splitPane1;
	private JButton Label_ColorStatus;
	private JButton ColorButton_Clear;
	private JPanel colorPalette;
	private JButton Button_Black;
	private JButton Button_DarkBlue;
	private JButton Button_Pink;	
	private JButton Button_Grey;
	private JButton Button_Blue;
	private JButton Button_Green;
	private JButton ButtonLightBlue;
	private JButton Button_Red;
	private JButton Button_Purple;
	private JButton Button_Yellow;
	private JButton Button_White;
	private JPanel vSpacer3;
	private JLabel Label_PriceSelection;
	private JSplitPane splitPane3;
	private JLabel Label_PriceStatus;
	private JButton PriceButton_Clear;
	private JPanel panel8;
	private JButton bPrice25_50;
	private JButton bPrice50_75;
	private JButton bPrice75_100;
	private JButton bPriceMore100;
	private JInternalFrame DesignB;
	private JLabel label1;
	private JLabel label2;
	private JPanel panel3;
	private JToggleButton Toggle_XS;
	private JToggleButton Toggle_S;
	private JToggleButton Toggle_M;
	private JToggleButton Toggle_L;
	private JToggleButton Toggle_XL;
	private JPanel vSpacer4;
	private JLabel label3;
	private JPanel panel4;
	private ColorChooser colorChooser2;
	private ColorChooser colorChooser3;
	private JButton Button_AddPalette;
	private JPanel vSpacer5;
	private JLabel label4;
	private JTextField textField2;
	private RangeSlider rangeSlider1;
	private JTextField textField3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
