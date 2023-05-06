import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Color;
import java.awt.SystemColor;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class PizzaFactory extends JFrame {
	
	private Image img_pizza1 = new ImageIcon(PizzaFactory.class.getResource("pizza/pizza1.png")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
	private Image img_pizza2 = new ImageIcon(PizzaFactory.class.getResource("pizza/pizza2.png")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);
	private Image img_pizza3 = new ImageIcon(PizzaFactory.class.getResource("pizza/pizza3.png")).getImage().getScaledInstance(90, 60, Image.SCALE_SMOOTH);

	private JPanel contentPane;
	private JComboBox cboFlavor;
	private JRadioButton rdoLarge;
	private JCheckBox chkExtraOlive;
	private JCheckBox chkCapsicum;
	private JCheckBox chkPaneer;
	private JCheckBox chkMushroom;
	private JCheckBox chkTomato;
	private JCheckBox chkSauses;
	private JRadioButton rdoDineIn;
	private JRadioButton rdoTakeOut;
	private JRadioButton rdoDelivery;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;
	private JButton btnBillOut;
	private JButton btnOrderAgain;
	private String[] flavor = {"Deluxe Veggie", "Cheese and Corn","Paneer Tikka","Non-Veg Supreme","Chicken Tikka","Pepper Barbecue Chicken"};
	private JLabel lblSmallPrice;
	private JLabel lblMediumPrice;
	private JLabel lblLargePrice;
	private double addOnPrice= 0.00;
	private JLabel txaOrderDetails;
	private AbstractButton rdoSmall;
	private AbstractButton rdoMedium;
	private JRadioButton rdoMedium_1;
	private JLabel lblQuantity;
	private int qty=1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JCheckBox chkChickentikka;
	private JCheckBox chkbbqch;
	private JCheckBox chkGrilledChicken;
	private JLabel lblNewLabel_1;
	private JLabel lblsides;
	private JCheckBox chkColddrink;
	private JCheckBox chkMoussecake;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaFactory frame = new PizzaFactory();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PizzaFactory() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				loadFlavors();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 669);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pizza Flavors:");
		lblNewLabel.setBounds(10, 0, 140, 25);
		contentPane.add(lblNewLabel);
		
		cboFlavor = new JComboBox();
		cboFlavor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPrice();
			}
		});
		cboFlavor.setBackground(new Color(255, 255, 255));
		cboFlavor.setBounds(10, 25, 194, 22);
		contentPane.add(cboFlavor);
		
		JLabel sad = new JLabel("Size and Price :");
		sad.setBounds(10, 47, 194, 26);
		contentPane.add(sad);
		
		JRadioButton rdoSmall = new JRadioButton("Small");
		buttonGroup.add(rdoSmall);
		rdoSmall.setBackground(new Color(216, 191, 216));
		rdoSmall.setBounds(10, 73, 109, 23);
		contentPane.add(rdoSmall);
		
		rdoMedium_1 = new JRadioButton("Medium");
		buttonGroup.add(rdoMedium_1);
		rdoMedium_1.setBackground(new Color(216, 191, 216));
		rdoMedium_1.setBounds(10, 95, 109, 23);
		contentPane.add(rdoMedium_1);
		
		rdoLarge = new JRadioButton("Large");
		buttonGroup.add(rdoLarge);
		rdoLarge.setBackground(new Color(216, 191, 216));
		rdoLarge.setBounds(10, 121, 109, 23);
		contentPane.add(rdoLarge);
		
		JLabel lblNewLabel_2 = new JLabel("Extra toppings:");
		lblNewLabel_2.setBounds(10, 151, 140, 19);
		contentPane.add(lblNewLabel_2);
		
		chkExtraOlive = new JCheckBox("Black Olive");
		buttonGroup_1.add(chkExtraOlive);
		chkExtraOlive.setBackground(new Color(216, 191, 216));
		chkExtraOlive.setBounds(10, 175, 97, 23);
		contentPane.add(chkExtraOlive);
		
		chkCapsicum = new JCheckBox("Capsicum");
		buttonGroup_1.add(chkCapsicum);
		chkCapsicum.setBackground(new Color(216, 191, 216));
		chkCapsicum.setBounds(10, 200, 97, 23);
		contentPane.add(chkCapsicum);
		
		chkPaneer = new JCheckBox("Paneer");
		buttonGroup_1.add(chkPaneer);
		chkPaneer.setBackground(new Color(216, 191, 216));
		chkPaneer.setBounds(10, 226, 97, 23);
		contentPane.add(chkPaneer);
		
		chkMushroom = new JCheckBox("Mushroom");
		buttonGroup_1.add(chkMushroom);
		chkMushroom.setBackground(new Color(216, 191, 216));
		chkMushroom.setBounds(107, 175, 97, 23);
		contentPane.add(chkMushroom);
		
		chkTomato = new JCheckBox("Tomato");
		buttonGroup_1.add(chkTomato);
		chkTomato.setBackground(new Color(216, 191, 216));
		chkTomato.setBounds(109, 201, 90, 23);
		contentPane.add(chkTomato);
		
		chkSauses = new JCheckBox("Sauses");
		buttonGroup_1.add(chkSauses);
		chkSauses.setBackground(new Color(216, 191, 216));
		chkSauses.setBounds(109, 226, 97, 23);
		contentPane.add(chkSauses);
		
		JLabel lblChoose = new JLabel("Choose :");
		lblChoose.setBounds(10, 362, 84, 19);
		contentPane.add(lblChoose);
		
		rdoDineIn = new JRadioButton("Dine In");
		buttonGroup_2.add(rdoDineIn);
		rdoDineIn.setBackground(new Color(216, 191, 216));
		rdoDineIn.setBounds(10, 383, 109, 23);
		contentPane.add(rdoDineIn);
		
		rdoTakeOut = new JRadioButton("Take Out");
		buttonGroup_2.add(rdoTakeOut);
		rdoTakeOut.setBackground(new Color(216, 191, 216));
		rdoTakeOut.setBounds(10, 409, 109, 23);
		contentPane.add(rdoTakeOut);
		
		rdoDelivery = new JRadioButton("For Delivery");
		rdoDelivery.setBackground(new Color(216, 191, 216));
		rdoDelivery.setBounds(10, 435, 109, 23);
		contentPane.add(rdoDelivery);
		
		btnBillOut = new JButton("Bill Out");
		btnBillOut.setBackground(new Color(255, 255, 255));
		btnBillOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showOrderDetails();
			}
		});
		btnBillOut.setBounds(45, 543, 115, 33);
		contentPane.add(btnBillOut);
		
		JLabel sss = new JLabel("Quantity :");
		sss.setBounds(10, 469, 84, 19);
		contentPane.add(sss);
		
		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int qty=1;
				qty--;
				lblQuantity.setText(String.valueOf(qty));
			}
			
		});
		btnNewButton_1.setBounds(25, 499, 56, 33);
		contentPane.add(btnNewButton_1);
		
		lblQuantity = new JLabel("1");
		lblQuantity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblQuantity.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantity.setBounds(75, 499, 56, 31);
		contentPane.add(lblQuantity);
		
		btnNewButton_1_1 = new JButton("+");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int qty=1;
				qty++;
				lblQuantity.setText(String.valueOf(qty));
			}
		});
		btnNewButton_1_1.setBounds(127, 500, 56, 32);
		contentPane.add(btnNewButton_1_1);
		
		
		
		btnOrderAgain = new JButton("Order Again");
		btnOrderAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				orderAgain();
			}
		});
		btnOrderAgain.setBackground(new Color(255, 255, 255));
		btnOrderAgain.setBounds(45, 586, 115, 33);
		contentPane.add(btnOrderAgain);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(img_pizza1));
		lblNewLabel_4.setBounds(277, 26, 109, 144);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setIcon(new ImageIcon(img_pizza2));
		lblNewLabel_4_1.setBounds(405, 25, 123, 141);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setIcon(new ImageIcon(img_pizza3));
		lblNewLabel_4_2.setBounds(548, 25, 112, 139);
		contentPane.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_5 = new JLabel("Order Details:");
		lblNewLabel_5.setBounds(310, 256, 130, 22);
		contentPane.add(lblNewLabel_5);
		
		JTextArea txaOrderDetails = new JTextArea();
		txaOrderDetails.setBounds(310, 276, 389, 354);
		contentPane.add(txaOrderDetails);
		
		lblSmallPrice = new JLabel("");
		lblSmallPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSmallPrice.setBounds(104, 73, 100, 14);
		contentPane.add(lblSmallPrice);
		
		lblMediumPrice = new JLabel("");
		lblMediumPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblMediumPrice.setBounds(104, 99, 100, 14);
		contentPane.add(lblMediumPrice);
		
		lblLargePrice = new JLabel("");
		lblLargePrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblLargePrice.setBounds(104, 125, 100, 14);
		contentPane.add(lblLargePrice);
		
		chkChickentikka = new JCheckBox("Chicken tikka");
		chkChickentikka.setBackground(new Color(216, 191, 216));
		chkChickentikka.setBounds(208, 175, 115, 23);
		contentPane.add(chkChickentikka);
		
		chkbbqch = new JCheckBox("Barbeque Chicken");
		chkbbqch.setBackground(new Color(216, 191, 216));
		chkbbqch.setBounds(208, 200, 140, 23);
		contentPane.add(chkbbqch);
		
		chkGrilledChicken = new JCheckBox("Grilled Chicken");
		chkGrilledChicken.setBackground(new Color(216, 191, 216));
		chkGrilledChicken.setBounds(208, 226, 130, 23);
		contentPane.add(chkGrilledChicken);
		
		lblNewLabel_1 = new JLabel("Pizza Factory");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(277, 5, 218, 42);
		contentPane.add(lblNewLabel_1);
		
		lblsides = new JLabel("Sides:");
		lblsides.setBounds(10, 281, 46, 14);
		contentPane.add(lblsides);
		
		chkColddrink = new JCheckBox("Cold Drink");
		chkColddrink.setBackground(new Color(216, 191, 216));
		chkColddrink.setBounds(10, 307, 173, 23);
		contentPane.add(chkColddrink);
		
		chkMoussecake = new JCheckBox("Mousse Cake");
		chkMoussecake.setBackground(new Color(216, 191, 216));
		chkMoussecake.setBounds(10, 332, 194, 23);
		contentPane.add(chkMoussecake);
	}
	private void loadFlavors(){
		for(String flavors: flavor) {
			cboFlavor.addItem(flavors);
		}
		
	} 
	private void showPrice() {
		if(cboFlavor.getSelectedIndex()==0)
		{
			lblSmallPrice.setText("150.00");
			lblMediumPrice.setText("200.00");
			lblLargePrice.setText("325.00");
		}
		else if(cboFlavor.getSelectedIndex()==1)
		{
			lblSmallPrice.setText("175.00");
			lblMediumPrice.setText("375.00");
			lblLargePrice.setText("475.00");
		}
		else if(cboFlavor.getSelectedIndex()==2)
		{
			lblSmallPrice.setText("160.00");
			lblMediumPrice.setText("290.00");
			lblLargePrice.setText("340.00");
		}
		else if(cboFlavor.getSelectedIndex()==3)
		{
			lblSmallPrice.setText("190.00");
			lblMediumPrice.setText("325.00");
			lblLargePrice.setText("425.00");
		}
		else if(cboFlavor.getSelectedIndex()==4)
		{
			lblSmallPrice.setText("210.00");
			lblMediumPrice.setText("370.00");
			lblLargePrice.setText("500.00");
		}
		else if(cboFlavor.getSelectedIndex()==5)
		{
			lblSmallPrice.setText("220.00");
			lblMediumPrice.setText("380.00");
			lblLargePrice.setText("525.00");
		}
	}
	private String addOnPrice() {
		String addOns="";
		
		if(chkExtraOlive.isSelected())
		{
			addOnPrice +=20.00;
			addOns = addOns + "\n\t"+ chkExtraOlive.getText()+"\t\t" + "20.00";
		}
		if(chkCapsicum.isSelected())
		{
			addOnPrice +=25.00;
			addOns = addOns + "\n\t"+ chkCapsicum.getText()+"\t\t" + "25.00";
		}
		if(chkPaneer.isSelected())
		{
			addOnPrice +=35.00;
			addOns = addOns + "\n\t"+ chkPaneer.getText()+"\t\t" + "35.00";
		}
		if(chkMushroom.isSelected())
		{
			addOnPrice +=30.00;
			addOns = addOns + "\n\t"+ chkMushroom.getText()+"\t\t" + "30.00";
		}
		if(chkTomato.isSelected())
		{
			addOnPrice +=10.00;
			addOns = addOns + "\n\t"+ chkTomato.getText()+"\t\t" + "10.00";
		}
		if(chkSauses.isSelected())
		{
			addOnPrice +=15.00;
			addOns = addOns + "\n\t"+ chkSauses.getText()+"\t\t" + "15.00";
		}
		if(chkChickentikka.isSelected())
		{
			addOnPrice +=15.00;
			addOns = addOns + "\n\t"+ chkChickentikka.getText()+"\t\t" + "35.00";
		}
		if(chkbbqch.isSelected())
		{
			addOnPrice +=15.00;
			addOns = addOns + "\n\t"+ chkbbqch.getText()+"\t\t" + "45.00";
		}
		if(chkGrilledChicken.isSelected())
		{
			addOnPrice +=15.00;
			addOns = addOns + "\n\t"+ chkGrilledChicken.getText()+"\t\t" + "15.00";
		}
		return addOns;
	}
	
	private String sidesPrice() {
		String sidesPrice="";
		
		if(chkColddrink.isSelected())
		{
			sidesPrice +=20.00;
			sidesPrice = sidesPrice + "\n\t"+ chkColddrink.getText()+"\t\t" + "55.00";
		}
		if(chkMoussecake.isSelected())
		{
			sidesPrice +=20.00;
			sidesPrice = sidesPrice + "\n\t"+ chkMoussecake.getText()+"\t\t" + "55.00";
		}
		return sidesPrice;	
		
	}
	
	private String sizeOfPizza() {
		String size ="";
		if(rdoSmall.isSelected())
			size =rdoSmall.getText();
		else
			if(rdoMedium.isSelected())
		size =rdoMedium.getText(); 
		else
			size =rdoLarge.getText(); 
		return size;
	}
	
	private double priceOfPizza() {
		double pizzaPrice=0;
		if(rdoSmall.isSelected())
			pizzaPrice= Double.parseDouble(lblSmallPrice.getText());
		else
			if(rdoMedium_1.isSelected())
				pizzaPrice= Double.parseDouble(lblMediumPrice.getText());
			else
				pizzaPrice= Double.parseDouble(lblLargePrice.getText());
				
		return pizzaPrice;
		
	}
	private String serviceMethod() {
		String service="";
		if(rdoDineIn.isSelected())
			service="DINE IN";
		else if(rdoTakeOut.isSelected())
			service="TAKE OUT";
		else
			service="FOR DELIVERY" +"\t\t"+ "50.00";
		return service;	
	}
	
	private double serviceFee() {
		double serviceFee = 0;
		if(rdoDineIn.isSelected())
			serviceFee=0.00;
		else if(rdoTakeOut.isSelected())
			serviceFee=0.00;
		else
			serviceFee= 50.00;
		return serviceFee;
	}
	
	private double subtotal() {
		double subtotle=0;
		subtotle= addOnPrice + priceOfPizza()+serviceFee();
		return subtotle;
	}
	
	private void orderAgain() {
		txaOrderDetails.setText(null);
	}
	
	private void showOrderDetails() {
		double totalPrice=0;
		int quantity = Integer.parseInt(lblQuantity.getText());
		
		totalPrice= subtotal()* quantity;
		
		txaOrderDetails.setText("\nFLAVOR: \t" + cboFlavor.getSelectedItem() +"\n\nSIZE: \t" + sizeOfPizza() + "\n\nPRICE: \t\t" 
								+ priceOfPizza() + "\n\nADD ONS \t" + addOnPrice()+ "\n\nSERVICE: \t" + serviceMethod() +
								"\n\nQUANTITY: \t\t\t"+quantity 
								+"\n\n******************************************************************************************"
								+ "\n\nTOTAL PRICE: \t\t\t"+ totalPrice);
	}
}
