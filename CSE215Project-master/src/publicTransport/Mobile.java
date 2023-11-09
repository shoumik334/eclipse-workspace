package publicTransport;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Mobile implements ActionListener {
	private JFrame frame;
	private JComboBox bkash;
	private JTextArea msg;
	private JButton confirm;
	private String name;
	
	public Mobile(String name){
		this.name = name;
	}
	
	public void showWindow(){
		
		frame = new JFrame();
		String[] option = {"bkash","mycash"};
		bkash = new JComboBox(option);
		msg = new JTextArea();
		String w = bkash.getSelectedItem().toString();
		msg.setText("Your tickets would be reserved and"+"\n" +"inactive for 60minutes from the time"+"\n" +"of booking.Pay through mobile to our"+"\n" +"Merchant Account No:01782345621"+"\n" +"and confirm your transaction ID"+"\n" +"within 60 minute to get the "+"\n" +"confirmed ticket.");
		confirm = new JButton("Confirm Reservation");
		frame.setLayout(null);
		frame.setTitle("Mobile Payment");
		frame.setSize(700,700);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(bkash);
		bkash.setBounds(150, 100,400 , 50);
		frame.add(msg);
		msg.setBounds(250, 200, 200, 202);
		frame.add(confirm);
		confirm.setBounds(150,550, 400, 50);
		confirm.addActionListener(this);
		
		
		frame.setVisible(true);
	
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String line = bkash.getSelectedItem().toString();
		if(e.getSource()==confirm){
        	 Transaction t = new Transaction(name);
			t.showWindow(line);
			frame.dispose();
			JOptionPane.showMessageDialog(null,"Mr. X,your ticket is reserved.Reservation confirmation SMS has been sent to 018222222.Pay for your ticket with "+line+" to our Merchant Account No:01782345621 and confirm your transaction ID below within 60 minutes."+"\n"+"TOTAL AMOUNT: ");
		
		
			
		}
		
		
		// TODO Auto-generated method stub
		
	}
	

	

}
