package publicTransport;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cash implements ActionListener{
	private JFrame frame;
	private JTextField city;
	private JTextField area;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField address1;
	private JTextField address2;
	private JTextField postal;
	private JTextField contact;
	private JButton confirm;
	private String name;
	JButton con = new JButton("Continue");
	
	public Cash(String n){
		this.name = n;
	}
	
	
	public void showWindow(){
		frame = new JFrame();
		confirm = new JButton(" Confirm Reservation ");
		frame.setTitle("Cash ON Delivary");
		frame.setSize(800, 600);
		frame.setLocation(400,100);
		frame.setLayout(new GridLayout(19,1,7,7));
		city = new JTextField();
		area =  new JTextField();
		firstName =  new JTextField();
		lastName =  new JTextField();
		address1 =  new JTextField();
		address2 =  new JTextField();
		postal =  new JTextField();
		contact =  new JTextField();
		frame.add(new JLabel("City"));
		frame.add(city);
		frame.add(new JLabel("Area"));
		frame.add(area);
		frame.add(new JLabel("First Name"));
		frame.add(firstName);
		frame.add(new JLabel("Last Name"));
		frame.add(lastName);
		frame.add(new JLabel("Address Line 1"));
		frame.add(address1);
		frame.add(new JLabel("Address Line 2"));
		frame.add(address2);
		frame.add(new JLabel("Postal Code"));
		frame.add(postal);
		frame.add(new JLabel("Alternative Contact No"));
		frame.add(contact);
		frame.add(new JLabel("    "));
		frame.add(confirm);
		frame.add(new JLabel("    "));
		confirm.addActionListener(this);
		//frame.add(con);
		//con.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cityT = city.getText();
		String areaT = area.getText();
		String firstNameT = firstName.getText();
		String lastNameT = lastName.getText();
		String ad1T = address1.getText();
		String ad2T = address2.getText();
		String postalT =  postal.getText();
		String contactT = contact.getText();
		
		if(e.getSource()==confirm){
			JOptionPane.showMessageDialog(null, "Your ticket would b delivered at"+"\n"+firstNameT+" "+lastNameT+"\n"+ad1T+"\n"+areaT+"\n"+cityT+"\n"+postalT+"\n"+contactT);
			JourneyDetails c = new JourneyDetails(name);
			frame.dispose();
			c.showWindow();
		}
		
	}

}
