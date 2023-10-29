package publicTransport;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Scanner;

public class JourneyDetails implements ActionListener {

	private JFrame window = new JFrame();
	
	private JTextField bus = new JTextField();
	private JTextField From = new JTextField();
	private JTextField To = new JTextField();
	private JTextField Date = new JTextField();
	private JTextField seatNo = new JTextField();
	private JButton cancel = new JButton("CANCEL");
	private String n;
	
	public JourneyDetails(String name){
		this.n = name;
		
	}
	
	public void initWindow()
	{
		GridLayout g1 = new GridLayout(5, 0);
		window.setLayout(g1);
		cancel.addActionListener(this);

	
	}
	
	public void showWindow()
	{
        initWindow();
        String from = "";
		String to= "";
		String name="";
		String date =" ";
		
		window.setSize(300,300);
		window.setLocation(500,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		try{
			File f = new File("Bus.txt");
			Bus [] b = new Bus [20];
			
			
			int index = 0;
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
			
				b[index] = new Bus(s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),s.nextLine(),Integer.parseInt(s.nextLine()));
				//System.out.println(b[index]);
				index++;
			}
			
			for(int i = 0;i<b.length;i++){
				if(b[i]!=null && b[i].getName().equals(n)){
					from = b[i].getFrom();
					to = b[i].getTo();
					 name = b[i].getName();
					 date = b[i].getDate();
					
					
					
				}
				
				
				
			}
		}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
		window.add(bus);
		window.add(From);
		window.add(To);
		window.add(Date);
		window.add (cancel);
		cancel.addActionListener(this);
		From.setText(" Start From: "+from);
		To.setText("End to "+to);
		Date.setText("Journey date "+date);
		bus.setText("Bus name :"+name);
		
		window.setTitle("JOURNEY DETAILS");
		
		
		window.setVisible(true);
		
		
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancel)
		{
			window.dispose();
		}
		
	}
	
	
	
	
	
}
