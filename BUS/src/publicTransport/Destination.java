package publicTransport;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class Destination implements ActionListener {
	JFrame window = new JFrame();

    String[] frm = {"From", "Dhaka", "Rajshahi", "Khulna", "Syleht", "Chittagong", "Barishal", "Rangpur"};
	 JComboBox from= new JComboBox(frm);
	 
	 String[] t={"To", "Dhaka", "Rajshahi", "Khulna", "Sylhet", "Chittagong", "Barishal", "Rangpur"};
	 JComboBox to= new JComboBox(t);
	 
	 String[] dt={"Available Dates", "19-08-2015"};
	 JComboBox date=new JComboBox(dt);
	 
	 String[] trans={"Select Bus", "Shymoli", "Tisha", "Hanif"};
	 JComboBox transport=new JComboBox(trans);
	 
	 JButton con=new JButton("Confirm");
	 JButton can=new JButton("Cancel");
	 JButton find = new JButton("find");
	 
	 public Destination(){
		 
		 
	 }
	
	
	public void initWindow(){
		
		GridLayout gl = new GridLayout(6,2,5,5);
		window.setLayout(gl);
		
		window.add(from);
		window.add(to);
		window.add(date);
		window.add(transport);
		window.add(find);
		window.add(con);
		window.add(can);
		find.addActionListener(this);
		can.addActionListener(this);
		
		con.addActionListener(this);
		
		
	}
		
	
	public void showWindow(){
		
		initWindow();
		
		window.setTitle("Destinations");
		window.setSize(500, 250);
		window.setLocation(500,150);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
				
	}
	
	Info ic=new Info();
	
	public Destination(Info info){
		ic=info;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if (e.getSource() == con)
		{
			String fare="0 BDT";
			String name = transport.getSelectedItem().toString();
			
			
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
					if(b[i]!=null && b[i].getName().equals(name)){
						fare = ( b[i].getFare());
						
						
					}
					
					
				}

				/*Seat seat=new Seat(fare);
				seat.showWindow();
				window.dispose();*/
				
			}
				catch(Exception ex){
					System.out.println(ex.getMessage());
				}
			
			
		

			Seat s=new Seat(fare,name);
			s.showWindow();
			window.dispose();
		}
		
		else if(e.getSource()==can){
			
			System.exit(0);
		}
		else if(e.getSource()==find){
			//System.out.println("Hee");
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
			
			transport = new JComboBox();
			
			for(int i = 0; i < b.length; i++){
				if(b[i] != null){
					transport.addItem(b[i].getName());
					//System.out.println(b[i].getName());
				}
			}
			
			
			//window.getContentPane().revalidate();
			//window.repaint();
			// modification will come here
			}
			catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			
		}
	}
}
