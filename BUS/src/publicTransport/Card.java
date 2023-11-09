package publicTransport;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Card implements ActionListener {
	private JFrame frame;
	private JComboBox combo;
	private JTextField cardNo;
	private JTextField cardName;
	private JTextField date;
	private JButton pay;
	private String s;
	private String name;
	
	
	public Card(String aString,String name) {
		this.s = aString;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pay){
			frame.dispose();
			TransactionOfCard t= new TransactionOfCard(s,name);
			t.showWindow();
		}
		
	} 
	public void showWindow(){
		frame = new JFrame();
		String[] op = {"DBBL Nexus","Master Card(Via BRAC gateway)","Visa(Via Dutch-Bangla-gateway)"};
		combo = new JComboBox(op);
		cardNo = new JTextField();
		cardName = new JTextField();
		date = new JTextField();
		pay = new JButton("Pay Now");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,400);
		frame.setLocation(300,250);
		frame.setLayout(new GridLayout(9,1,7,10));
		frame.add(new JLabel());
		frame.add(new JLabel());
		frame.add(combo);
		frame.add(new JLabel());
		frame.add(new JLabel("Card Number"));
		frame.add(cardNo);
		frame.add(new JLabel("Card Holder's Name"));
		frame.add(cardName);
		frame.add(new JLabel("Expire Date"));
		frame.add(date);
		frame.add(new JLabel());
		frame.add(pay);
		pay.addActionListener(this);
		frame.setVisible(true);
	}
	
	
	

}
