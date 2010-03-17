package demo;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import shape.Picture;

import main.jflow.JFlowPanel;

import com.jgoodies.*;
import com.jgoodies.forms.layout.*;
/*
 * Created by JFormDesigner on Tue Mar 16 01:24:33 PDT 2010
 */
import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;

import event.ShapeEvent;
import event.ShapeListener;



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
	}

	private void SizeButton_SMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("S");
	}

	private void SizeButton_MMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("M");
	}

	private void SizeButton_LMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("L");
	}

	private void SizeButton_XLMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("XL");
	}

	private void SizeButton_ClearMouseClicked(MouseEvent e) {
		Label_SizeStatus.setText("--");
	}

	private void Button_BlackMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 0, 0));
	}

	private void Button_DarkBlueMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 0, 132));
	}

	private void Button_DarkGreenMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 132, 0));
	}

	private void Button_DarkSkyBlueMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 132, 132));
	}

	private void Button_DarkRedMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(132, 0, 0));
	}

	private void Button_DarkPurpleMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(132, 0, 132));
	}

	private void Button_DarkYellowMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(132, 132, 0));
	}

	private void Button_DarkGreyMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(132, 132, 132));
	}

	private void Button_GreyMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(198, 198, 198));
	}

	private void Button_BlueMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0,0,255));
	}

	private void Button_GreenMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 255, 0));
	}

	private void Button_SkyBlueMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(0, 255, 255));
	}

	private void Button_RedMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 0, 0));
	}

	private void Button_PurpleMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 0, 255));
	}

	private void Button_YellowMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 255, 0));
	}

	private void Button_WhiteMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(255, 255, 255));
	}

	private void ColorButton_ClearMouseClicked(MouseEvent e) {
		Label_ColorStatus.setBackground(new Color(225, 225, 225));
	}

	private void Button_Price60_80MouseClicked(MouseEvent e) {
		Label_PriceStatus.setText("$60-$80");
		coverFlow().resetPrice();
		coverFlow().setPriceRange(60, 80);
	}

	private void Button_Price80_100MouseClicked(MouseEvent e) {
		Label_PriceStatus.setText("$80-$100");
		coverFlow().resetPrice();
		coverFlow().setPriceRange(80, 100);
	}

	private void Button_Price40_60MouseClicked(MouseEvent e) {
		Label_PriceStatus.setText("$40-$60");
		coverFlow().resetPrice();
		coverFlow().setPriceRange(40, 60);
	}

	private void Button_Price100_More(MouseEvent e) {
		Label_PriceStatus.setText("Price>$100");
		coverFlow().setPriceRange(100, 2000);
	}

	private void PriceButton_ClearMouseClicked(MouseEvent e) {
		Label_PriceStatus.setText("----------");
		coverFlow().resetPrice();
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Travis Holt
		TeamTitleLabel = new JLabel();
		FilterItemLabel = new JLabel();
		separator1 = new JSeparator();
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
		panel7 = new JPanel();
		Button_Black = new JButton();
		Button_DarkBlue = new JButton();
		Button_DarkGreen = new JButton();
		Button_DarkSkyBlue = new JButton();
		Button_DarkRed = new JButton();
		Button_DarkPurple = new JButton();
		Button_DarkYellow = new JButton();
		Button_DarkGrey = new JButton();
		Button_Grey = new JButton();
		Button_Blue = new JButton();
		Button_Green = new JButton();
		Button_SkyBlue = new JButton();
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
		Button_Price60_80 = new JButton();
		Button_Price80_100 = new JButton();
		Button_Price40_60 = new JButton();
		Button_PriceMore80 = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle("Fashion Sensible");
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"3*(default, $lcgap), default",
			"6*(default, $lgap), 233dlu, 3*($lgap, default)"));

		//---- TeamTitleLabel ----
		TeamTitleLabel.setText("Fashion Sensible");
		TeamTitleLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
		contentPane.add(TeamTitleLabel, cc.xywh(3, 3, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

		//---- FilterItemLabel ----
		FilterItemLabel.setText("Filtering Items");
		contentPane.add(FilterItemLabel, cc.xywh(3, 5, 1, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));
		contentPane.add(separator1, cc.xy(3, 7));

		//======== panel1 ========
		{

			// JFormDesigner evaluation mark
			panel1.setBorder(new javax.swing.border.CompoundBorder(
				new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
					"JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
					javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
					java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

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
		contentPane.add(panel1, cc.xy(3, 9));
		contentPane.add(separator2, cc.xy(3, 11));

		//======== Frame_ShirtFilter ========
		{
			Frame_ShirtFilter.setVisible(true);
			Frame_ShirtFilter.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
			Frame_ShirtFilter.setTitle(" ");
			Container Frame_ShirtFilterContentPane = Frame_ShirtFilter.getContentPane();
			Frame_ShirtFilterContentPane.setLayout(new FormLayout(
				"default, $lcgap, 85dlu, 9*($lcgap, default)",
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
						SizeButton_ClearMouseClicked(e);
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
				panel7.setLayout(new FormLayout(
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
				panel7.add(Button_Black, cc.xy(1, 1));

				//---- Button_DarkBlue ----
				Button_DarkBlue.setText(" ");
				Button_DarkBlue.setBackground(new Color(0, 0, 132));
				Button_DarkBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkBlueMouseClicked(e);
					}
				});
				panel7.add(Button_DarkBlue, cc.xy(2, 1));

				//---- Button_DarkGreen ----
				Button_DarkGreen.setText(" ");
				Button_DarkGreen.setBackground(new Color(0, 132, 0));
				Button_DarkGreen.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkGreenMouseClicked(e);
					}
				});
				panel7.add(Button_DarkGreen, cc.xy(3, 1));

				//---- Button_DarkSkyBlue ----
				Button_DarkSkyBlue.setText(" ");
				Button_DarkSkyBlue.setBackground(new Color(0, 132, 132));
				Button_DarkSkyBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkSkyBlueMouseClicked(e);
					}
				});
				panel7.add(Button_DarkSkyBlue, cc.xy(4, 1));

				//---- Button_DarkRed ----
				Button_DarkRed.setText(" ");
				Button_DarkRed.setBackground(new Color(132, 0, 0));
				Button_DarkRed.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkRedMouseClicked(e);
					}
				});
				panel7.add(Button_DarkRed, cc.xy(5, 1));

				//---- Button_DarkPurple ----
				Button_DarkPurple.setText(" ");
				Button_DarkPurple.setBackground(new Color(132, 0, 132));
				Button_DarkPurple.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkPurpleMouseClicked(e);
					}
				});
				panel7.add(Button_DarkPurple, cc.xy(6, 1));

				//---- Button_DarkYellow ----
				Button_DarkYellow.setText(" ");
				Button_DarkYellow.setBackground(new Color(132, 132, 0));
				Button_DarkYellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkYellowMouseClicked(e);
					}
				});
				panel7.add(Button_DarkYellow, cc.xy(7, 1));

				//---- Button_DarkGrey ----
				Button_DarkGrey.setText(" ");
				Button_DarkGrey.setBackground(new Color(132, 132, 132));
				Button_DarkGrey.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_DarkGreyMouseClicked(e);
					}
				});
				panel7.add(Button_DarkGrey, cc.xy(8, 1));

				//---- Button_Grey ----
				Button_Grey.setText(" ");
				Button_Grey.setBackground(new Color(198, 198, 198));
				Button_Grey.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_GreyMouseClicked(e);
					}
				});
				panel7.add(Button_Grey, cc.xy(1, 2));

				//---- Button_Blue ----
				Button_Blue.setText(" ");
				Button_Blue.setBackground(Color.blue);
				Button_Blue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_BlueMouseClicked(e);
					}
				});
				panel7.add(Button_Blue, cc.xy(2, 2));

				//---- Button_Green ----
				Button_Green.setText(" ");
				Button_Green.setBackground(Color.green);
				Button_Green.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_GreenMouseClicked(e);
					}
				});
				panel7.add(Button_Green, cc.xy(3, 2));

				//---- Button_SkyBlue ----
				Button_SkyBlue.setText(" ");
				Button_SkyBlue.setBackground(Color.cyan);
				Button_SkyBlue.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_SkyBlueMouseClicked(e);
					}
				});
				panel7.add(Button_SkyBlue, cc.xy(4, 2));

				//---- Button_Red ----
				Button_Red.setText(" ");
				Button_Red.setBackground(Color.red);
				Button_Red.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_RedMouseClicked(e);
					}
				});
				panel7.add(Button_Red, cc.xy(5, 2));

				//---- Button_Purple ----
				Button_Purple.setText(" ");
				Button_Purple.setBackground(Color.magenta);
				Button_Purple.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_PurpleMouseClicked(e);
					}
				});
				panel7.add(Button_Purple, cc.xy(6, 2));

				//---- Button_Yellow ----
				Button_Yellow.setText(" ");
				Button_Yellow.setBackground(Color.yellow);
				Button_Yellow.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_YellowMouseClicked(e);
					}
				});
				panel7.add(Button_Yellow, cc.xy(7, 2));

				//---- Button_White ----
				Button_White.setText(" ");
				Button_White.setBackground(Color.white);
				Button_White.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_WhiteMouseClicked(e);
					}
				});
				panel7.add(Button_White, cc.xy(8, 2));
			}
			Frame_ShirtFilterContentPane.add(panel7, cc.xy(3, 13));
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


				//---- Button_Price20_40 ----
				Button_Price80_100.setText("$80-$100");
				Button_Price80_100.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_Price80_100MouseClicked(e);
					}
				});
				
				panel8.add(Button_Price80_100, cc.xy(1, 1));

				//---- Button_Price40_60 ----
				Button_Price40_60.setText("$40-$60");
				Button_Price40_60.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_Price40_60MouseClicked(e);
					}
				});
				panel8.add(Button_Price40_60, cc.xy(1, 3));
				
				//---- Button_Price60_80 ----
				Button_Price60_80.setText("$60-$80");
				Button_Price60_80.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_Price60_80MouseClicked(e);
					}
				});
				
				panel8.add(Button_Price60_80, cc.xy(1, 5));


				//---- Button_PriceMore60 ----
				Button_PriceMore80.setText("More than $80");
				Button_PriceMore80.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						Button_Price100_More(e);
					}
				});
				panel8.add(Button_PriceMore80, cc.xy(1, 7));
			}
			Frame_ShirtFilterContentPane.add(panel8, cc.xy(3, 19));
		}
		contentPane.add(Frame_ShirtFilter, cc.xywh(3, 13, 1, 6, CellConstraints.LEFT, CellConstraints.DEFAULT));

		
		setupCoverFlows(getContentPane(), cc);		
		
		
		
		
		setSize(925, 710);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
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
		container.add(femaleCoverFlow, cc.xywh(3, 13, 1, 6, CellConstraints.CENTER, CellConstraints.DEFAULT));
	}
	
	public JFlowPanel coverFlow(){
		return femaleCoverFlow;
	}
	
	final JFlowPanel femaleCoverFlow = new JFlowPanel(new MaleConfig());
	
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Travis Holt
	private JLabel TeamTitleLabel;
	private JLabel FilterItemLabel;
	private JSeparator separator1;
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
	private JPanel panel7;
	private JButton Button_Black;
	private JButton Button_DarkBlue;
	private JButton Button_DarkGreen;
	private JButton Button_DarkSkyBlue;
	private JButton Button_DarkRed;
	private JButton Button_DarkPurple;
	private JButton Button_DarkYellow;
	private JButton Button_DarkGrey;
	private JButton Button_Grey;
	private JButton Button_Blue;
	private JButton Button_Green;
	private JButton Button_SkyBlue;
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
	private JButton Button_Price60_80;
	private JButton Button_Price80_100;
	private JButton Button_Price40_60;
	private JButton Button_PriceMore80;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
