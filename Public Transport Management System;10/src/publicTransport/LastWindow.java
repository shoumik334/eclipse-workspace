package publicTransport;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LastWindow implements ActionListener {
	private JFrame frame ;
	private JButton print;
	private JButton sms;
	private JButton display;
	private String name;
	
	public LastWindow(String name){
		this.name = name;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==print){
			frame.dispose();
		
		}

		else if(e.getSource()==sms){
			frame.dispose();
		}
		else if(e.getSource()==display){
			frame.dispose();
			JourneyDetails s = new JourneyDetails(name);
			s.showWindow();
		}
		
	}
	public void showWindow(){
		frame = new JFrame();
		print = new JButton("Print your ticket");
		sms = new JButton("Email/SmS your ticket");
		display = new JButton("Journey Details");
		frame.setTitle("ConFirmed");
		frame.setLayout(new GridLayout(4,1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 350);
		frame.setLocation(250,100);
		frame.add(new JLabel("Your ticket has been Confirmed"));
		frame.add(print);
		frame.add(sms);
		frame.add(display);
		print.addActionListener(this);
		sms.addActionListener(this);
		display.addActionListener(this);
		frame.setVisible(true);
		
		
		
	}
	

}
