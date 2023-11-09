package publicTransport;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Payment implements ActionListener {
	private JFrame window;
	private JButton mobile;
	private JButton cash;
	private JButton card;
	private JTextField amount;
	private double a;
	private String aString;
	private String name;
	
	
	public Payment(double fare,String name){
		this.a = fare;
		this.aString = Double.toString(a);
		this.name=name;
		
		
	}
	
	public void showWindow(){
		window = new JFrame();
		mobile = new JButton("Mobile");
		cash = new JButton("Cash On Delivary");
		card = new JButton("Credit/Debit Card");
		amount = new JTextField();
		window.setTitle("Payment");
		window.setSize(500,350);
		window.setLocation(300, 250);
		window.setLayout(new GridLayout(2,3,10,20));
		window.add(new JLabel("Total Amount Payable : "));
		window.add(amount);
		amount.setEditable(false);
		amount.setText(aString+" BDT");
		
		
		window.add(new JLabel());
		window.add(mobile);
		window.add(cash);
		window.add(card);
		mobile.addActionListener(this);
		cash.addActionListener(this);
		card.addActionListener(this);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.pack();
		window.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mobile){
			Mobile m = new Mobile(name);
			m.showWindow();
			window.dispose();
			
			
		}
		else if(e.getSource()==cash){
			Cash c = new Cash(name);
			c.showWindow();
			window.dispose();
			JOptionPane.showMessageDialog(null,"Your ticket would b reserved and inactive till our call center agent call u and verify your credentials.Tickets would become active when you pay the due amount during the delivery of ticket at your doorstep.");
			
		}
		else if(e.getSource()==card){
			window.dispose();
			JOptionPane.showMessageDialog(null, "You would be redirected to a third party payment gateway where u can pay with your credit or debit cards.Your payment transaction are 100% secure.On successful payment,you would get a confirmed ticket.");
			Card c = new Card(aString,name);
			c.showWindow();
		}
		
		
	}
	
	

}
