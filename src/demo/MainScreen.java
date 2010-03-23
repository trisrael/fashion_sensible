package demo;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.TimerTask;

import javax.swing.*;
import javax.swing.event.*;
import javax.xml.bind.annotation.XmlList;

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
	private JButton ColorPalette_Clear;
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
		coverFlow().resetAll(false);
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
		coverFlow().resetAll(false);
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

	private void Button_BlackMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 0, 0));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("black", false);

	}

	private void ButtonPinkButtonClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 31, 229));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("pink", false);
	}

	private void Button_GreyMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(198, 198, 198));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("grey", false);
	}

	private void Button_BlueMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0,0,255));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("blue", false);
	}

	private void Button_GreenMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(54, 127, 31));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("green", false);
	}

	private void ButtonLightBlue(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(111, 247, 255));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("light blue", false);
	}

	private void Button_RedMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 0, 0));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("red", true);
	}

	private void Button_PurpleMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(94, 61, 155));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("purple", true);
	}

	private void Button_YellowMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 255, 0));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("yellow", true);
	}

	private void Button_WhiteMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 255, 255));
		coverFlow().resetColors(false);
		coverFlow().addFilterColor("white", true);
	}

	private void ColorButton_ClearMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(225, 225, 225));
		coverFlow().resetColors(true);
	}

	private void setPrice51_75(MouseEvent e) {
		Label_PriceStatus.setText("$51-$75");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(51,75, true);
	}

	private void setPrice76_100(MouseEvent e) {
		Label_PriceStatus.setText("$76-$100");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(76, 100, true);
	}

	private void setPrice101_125(MouseEvent e) {
		Label_PriceStatus.setText("$101-$125");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(101,125, true);
	}
	
	private void setPrice26_50(MouseEvent e) {
		Label_PriceStatus.setText("$26-$50");
		coverFlow().resetPrice(false);
		coverFlow().setPriceRange(26,50, true);
	}

	private void PriceButton_ClearMouseClicked(MouseEvent e) {
		Label_PriceStatus.setText("----------");
		coverFlow().resetPrice(true);
	}


	private void rangeSlider1StateChanged(ChangeEvent e) {
		int min = rangeSlider1.getLowValue();
		int max = rangeSlider1.getHighValue();
		rangeMinLabel.setText( Integer.toString(min));
		rangeMaxLabel.setText( Integer.toString(max));
		coverFlow().setPriceRange(min, max, false);
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
		watch = new StopWatch();
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
		ColorPalette_Clear = new JButton();
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
		Button_Pink = new JButton();
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
		bPrice26_50 = new JButton();
		bPrice51_75 = new JButton();
		bPrice76_100 = new JButton();
		bprice101_125 = new JButton();
		DesignB = new JInternalFrame();
		label1 = new JLabel();
		label2 = new JLabel();
		sizeButtonPanel = new JPanel();
		Toggle_XS = new JToggleButton();
		Toggle_S = new JToggleButton();
		Toggle_M = new JToggleButton();
		Toggle_L = new JToggleButton();
		Toggle_XL = new JToggleButton();
		vSpacer4 = new JPanel(null);
		colorLabelPalette = new JLabel();
		panel4 = new JPanel();
		primaryColorChooser = new ColorChooser();
		vSpacer5 = new JPanel(null);
		priceRangeLabel = new JLabel();
		rangeMinLabel = new JTextField();
		rangeSlider1 = new RangeSlider();
		rangeMaxLabel = new JTextField();
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
				public void mouseReleased(MouseEvent e) {}
				public void mousePressed(MouseEvent e){}
				public void mouseExited(MouseEvent e){}
				public void mouseEntered(MouseEvent e){}
				public void mouseClicked(MouseEvent e)
				{
					if(!beingTimed){
						resetDesigns(false);
						tasksRun++;
						beingTimed = true;
						watch.start();
						System.out.println("***Task #" + tasksRun);
						startTiming.setText("Stop");
						startTiming.setBackground(Color.red);
					}else{
						beingTimed = false;
						watch.stop();
						resetDesigns(true);
						System.out.println("Time Taken: " + watch.getElapsedTimeSecs() + " seconds");
						System.out.println("***End of Task #" + tasksRun + "\n");
						startTiming.setBackground(Color.green);
						startTiming.setText("Start");}}
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
				colorPalette.add(Button_Red, cc.xy(2, 1));

				//---- Button_Pink ----
				Button_Pink.setText(" ");
				Button_Pink.setBackground(new Color(255, 31, 229));
				Button_Pink.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ButtonPinkButtonClicked(e);
					}
				});
				colorPalette.add(Button_Pink, cc.xy(2, 2));
				
				//---- Button_Purple ----
				Button_Purple.setText(" ");
				Button_Purple.setBackground(new Color(94, 61, 155));
				Button_Purple.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_PurpleMouseClicked(e);
					}
				});
				colorPalette.add(Button_Purple, cc.xy(3, 1));

				//---- Button_Yellow ----
				Button_Yellow.setText(" ");
				Button_Yellow.setBackground(Color.yellow);
				Button_Yellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_YellowMouseClicked(e);
					}
				});
				colorPalette.add(Button_Yellow, cc.xy(3, 2));
				

				//---- Button_Green ----
				Button_Green.setText(" ");
				Button_Green.setBackground(new Color(54, 127, 31));
				Button_Green.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_GreenMouseClicked(e);
					}
				});
				colorPalette.add(Button_Green, cc.xy(4, 1));

				
				//---- Button Light Blue ----
				ButtonLightBlue.setText(" ");
				ButtonLightBlue.setBackground(new Color(111, 247, 255));
				ButtonLightBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						ButtonLightBlue(e);
					}
				});
				colorPalette.add(ButtonLightBlue, cc.xy(4, 2));

				
				//---- Button_Blue ----
				Button_Blue.setText(" ");
				Button_Blue.setBackground(Color.blue);
				Button_Blue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_BlueMouseClicked(e);
					}
				});
				colorPalette.add(Button_Blue, cc.xy(5, 1));
			
			}
			Frame_ShirtFilterContentPane.add(colorPalette, cc.xy(3, 13));
			Frame_ShirtFilterContentPane.add(vSpacer3, cc.xy(3, 15));

			//---- Label_PriceSelection ----
			Label_PriceSelection.setText("Price:");
			Frame_ShirtFilterContentPane.add(Label_PriceSelection, cc.xy(1, 17));

			//======== splitPane3 ========
			{

				//---- Label_PriceStatus ----
				
				Label_PriceStatus.setText("------------");
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
				bPrice26_50.setText("$26-$50");
				bPrice26_50.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice26_50(e);
					}
				});
				panel8.add(bPrice26_50, cc.xy(1, 1));

				//---- Button_Price51_75 ----
				bPrice51_75.setText("$51-$75");
				bPrice51_75.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice51_75(e);
					}
				});
				panel8.add(bPrice51_75, cc.xy(1, 3));

				//---- Button_Price 76-100----
				bPrice76_100.setText("$76-$100");
				bPrice76_100.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice76_100(e);
					}
				});
				panel8.add(bPrice76_100, cc.xy(1, 5));

				//---- Button_PriceMore100 ----
				bprice101_125.setText("$101-$125");
				bprice101_125.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						setPrice101_125(e);
					}
				});
				panel8.add(bprice101_125, cc.xy(1, 7));
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

			//======== Size Toggle Panel ========
			{
				sizeButtonPanel.setLayout(new FormLayout(
					"16dlu, 4*([16dlu,default])",
					"default"));

				//---- Toggle_XS ----
				Toggle_XS.setText("XS");
				Toggle_XS.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseExited(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {}
					public void mouseClicked(MouseEvent e) {
						if(Toggle_XS.getSelectedObjects() != null){
							coverFlow().addFilterSize("XS");
						}else{
							coverFlow().removeFilterSize("XS");}}});
				sizeButtonPanel.add(Toggle_XS, cc.xy(1, 1));

				//---- Toggle_S ----
				Toggle_S.setText("S");
				Toggle_S.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseExited(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {}
					public void mouseClicked(MouseEvent e) {
						if(Toggle_S.getSelectedObjects() != null){
							coverFlow().addFilterSize("S");
						}else{
							coverFlow().removeFilterSize("S");}}});
				sizeButtonPanel.add(Toggle_S, cc.xy(2, 1));

				//---- Toggle_M ----
				Toggle_M.setText("M");
				Toggle_M.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseExited(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {}
					public void mouseClicked(MouseEvent e) {
						if(Toggle_M.getSelectedObjects() != null){
							coverFlow().addFilterSize("M");
						}else{
							coverFlow().removeFilterSize("M");}}});
				sizeButtonPanel.add(Toggle_M, cc.xy(3, 1));

				//---- Toggle_L ----
				Toggle_L.setText("L");
				Toggle_L.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseExited(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {}
					public void mouseClicked(MouseEvent e) {
						if(Toggle_L.getSelectedObjects() != null){
							coverFlow().addFilterSize("L");
						}else{
							coverFlow().removeFilterSize("L");}}});
				sizeButtonPanel.add(Toggle_L, cc.xy(4, 1));

				//---- Toggle_XL ----
				Toggle_XL.setText("XL");
				Toggle_XL.addMouseListener(new MouseListener() {
					public void mouseReleased(MouseEvent e) {}
					public void mousePressed(MouseEvent e) {}
					public void mouseExited(MouseEvent e) {}
					public void mouseEntered(MouseEvent e) {}
					public void mouseClicked(MouseEvent e) {
						if(Toggle_XL.getSelectedObjects() != null){
							coverFlow().addFilterSize("XL");
						}else{
							coverFlow().removeFilterSize("XL");}}});
				sizeButtonPanel.add(Toggle_XL, cc.xy(5, 1));
			}
			internalFrame1ContentPane.add(sizeButtonPanel, cc.xy(7, 5));
			internalFrame1ContentPane.add(vSpacer4, cc.xy(7, 7));

			//---- Color Label Palette ----
			colorLabelPalette.setText("Color Palette");
			internalFrame1ContentPane.add(colorLabelPalette, cc.xy(3, 9));

			//======== panel4 ========
			{
				panel4.setLayout(new FormLayout(
					"23dlu, $lcgap, default",
					"22dlu, $lgap, default"));

				//---- Color Chooser #1 ----
				primaryColorChooser.setToolTipText("Click and hold to select a color from the rainbow palette");
				primaryColorChooser.setColor(Color.gray);
				primaryColorChooser.addPropertyChangeListener(new PropertyChangeListener() {
					public void propertyChange(PropertyChangeEvent evt) {
						
						try {
							Color color = (Color) evt.getNewValue();
							coverFlow().resetColors(false);
							coverFlow().addFilterColor(colorToString(color), false);
						} catch (Exception e) {
						}
					}
				});
				primaryColorChooser.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
					coverFlow().incrementRouteCounter();
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				panel4.add(primaryColorChooser, cc.xy(1, 1));
				ColorPalette_Clear.setText("Clear");
				ColorPalette_Clear.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {
					primaryColorChooser.setColor(Color.gray);
					coverFlow().resetColors(true);
					}
				});
				panel4.add(ColorPalette_Clear, cc.xy(3, 1));

			}
			internalFrame1ContentPane.add(panel4, cc.xywh(7, 9, 1, 1, CellConstraints.DEFAULT, CellConstraints.BOTTOM));
			internalFrame1ContentPane.add(vSpacer5, cc.xy(7, 11));

			//---- label4 ----
			priceRangeLabel.setText("Price Range");
			internalFrame1ContentPane.add(priceRangeLabel, cc.xy(3, 15));

			//---- textField2 ----
			rangeMinLabel.setText("25");
			rangeMinLabel.setEditable(false);
			internalFrame1ContentPane.add(rangeMinLabel, cc.xy(5, 15));

			//---- rangeSlider1 ----
			rangeSlider1.setMaximum(125);
			rangeSlider1.setMinimum(25);
			rangeSlider1.setHighValue(125);
			rangeSlider1.setLowValue(25);
			rangeSlider1.setPaintTicks(true);
			rangeSlider1.setPaintLabels(true);
			rangeSlider1.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					rangeSlider1StateChanged(e);
				}
			});
			rangeSlider1.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					coverFlow().incrementRouteCounter();
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			internalFrame1ContentPane.add(rangeSlider1, cc.xy(7, 15));

			//---- RangeMaxLabel ----
			rangeMaxLabel.setText("125");
			rangeMaxLabel.setEditable(false);
			internalFrame1ContentPane.add(rangeMaxLabel, cc.xy(9, 15));
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
					//TODO Add some feedback to let them know they actually clicked something
					Picture pic = (Picture) e.getShape();
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
					Picture pic = (Picture) e.getShape();
					if(pic.isSelected()){
						pic.unselect();
					}else{
						pic.select();
						System.out.println(e.getShape());
					}
					coverFlow().updateShapes();
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
	
	private void resetDesigns(boolean printRoute) {
	if(DesignB.isVisible()){
		Toggle_XS.setSelected(false);
		Toggle_S.setSelected(false);
		Toggle_M.setSelected(false);
		Toggle_L.setSelected(false);
		Toggle_XL.setSelected(false);
		primaryColorChooser.setColor(Color.gray);
		rangeSlider1.setHighValue(125);
		rangeSlider1.setLowValue(25);
	}else if(Frame_ShirtFilter.isVisible()){
		SizeButton_L.setSelected(false);
		SizeButton_M.setSelected(false);
		SizeButton_S.setSelected(false);
		SizeButton_XS.setSelected(false);
		SizeButton_XL.setSelected(false);
		Label_PriceStatus.setText("------------");
		Label_SizeStatus.setText("---");
		Label_ColorStatus.setBackground(new Color(225, 225, 225));
	}
	coverFlow().resetAll(printRoute);
	}

	private String colorToString(Color color) {
		if(color.getRed() >= 50 && color.getRed() <= 190  && color.getGreen() >= 0 && 
				color.getGreen() <= 66 && color.getBlue() <= 255 && color.getBlue() >= 35){
			return "purple";
		}
		else if ((color.getRed() >= 82 && color.getRed() <= 255  && color.getGreen() >= 0 && 
				color.getGreen() <= 36 && color.getBlue() <= 64 && color.getBlue() >= 10) || 
				(color.getRed() >= 112 && color.getRed() <= 255  && color.getGreen() >= 20 && 
						color.getGreen() <= 55 && color.getBlue() <= 20 && color.getBlue() >= 0))  {
			return "red";
		}
		else if ((color.getRed() >= 0 && color.getRed() <= 51  && color.getGreen() >= 0 && 
				color.getGreen() <= 105 && color.getBlue() <= 255 && color.getBlue() >= 52) || 
				(color.getGreen() >= 105 && color.getGreen() <= 150 && color.getBlue() >= 106 &&  color.getBlue() <= 180
						&& color.getRed() == 0)) {
			return "blue";
		}else if (color.getRed() >= 0 && color.getRed() <= 190  && color.getGreen() >= 120 && 
				color.getGreen() <= 255 && color.getBlue() <= 255 && color.getBlue() >= 155) {
			return "light blue";
		}
		else if (color.getRed() >= 0 && color.getRed() <= 190  && color.getGreen() >= 120 && 
				color.getGreen() <= 255 && color.getBlue() <= 255 && color.getBlue() >= 155) {
			return "light blue";
		}
		else if (color.getRed() >= 0 && color.getRed() <= 190  && color.getGreen() >= 120 && 
				color.getGreen() <= 255 && color.getBlue() <= 255 && color.getBlue() >= 155) {
			return "green";
		}
		else if (color.getRed() >= 194 && color.getRed() <= 255  && color.getGreen() >= 0 && 
				color.getGreen() <= 220 && color.getBlue() <= 255 && color.getBlue() >= 65) {
			return "pink";
		}
		else if (color.getRed() >= 165 && color.getRed() <= 255 && color.getGreen() >= 165 && 
				color.getGreen() <= 255 && color.getBlue() <= 190 && color.getBlue() >= 0) {
			return "yellow";
		}
		else if (color.getRed() <= 50 && color.getGreen() <= 50 && color.getBlue() <= 50) {
			return "black";
		}
		else if (color.getRed() >= 230 && color.getGreen() >= 230 && color.getBlue() >= 230) {
			return "white";
		}
		else if (color.getRed() >= 0 && color.getRed() < 158 && color.getGreen() > 50 && color.getBlue() >= 0) {
			return "green";
		}
		else{
			return null;
		}
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
	private StopWatch watch;
	private int tasksRun = 0;
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
	private JButton Button_Pink;	
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
	private JButton bPrice26_50;
	private JButton bPrice51_75;
	private JButton bPrice76_100;
	private JButton bprice101_125;
	private JInternalFrame DesignB;
	private JLabel label1;
	private JLabel label2;
	private JPanel sizeButtonPanel;
	private JToggleButton Toggle_XS;
	private JToggleButton Toggle_S;
	private JToggleButton Toggle_M;
	private JToggleButton Toggle_L;
	private JToggleButton Toggle_XL;
	private JPanel vSpacer4;
	private JLabel colorLabelPalette;
	private JPanel panel4;
	private ColorChooser primaryColorChooser;
	private JPanel vSpacer5;
	private JLabel priceRangeLabel;
	private JTextField rangeMinLabel;
	private RangeSlider rangeSlider1;
	private JTextField rangeMaxLabel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
