package publicTransport;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction implements ActionListener {
	private JFrame frame;
	private JTextField id;
	private JButton confirm;
	private String name;
	
	public  Transaction(String name){
		this.name = name;
	}
	public void showWindow(String l){
		frame = new JFrame();
		id = new JTextField();
		confirm = new JButton("CONFIRM");
		frame.setSize(300, 250);
		frame.setLocation(400, 400);
		frame.setLayout(new GridLayout(6,1,5,5));
		frame.add(new JLabel(" Our Merchant Account no: 01782345621 "));
		frame.add(new JLabel(" Please enter your "+l+" Transaction ID"));
		frame.add(id);
		frame.add(new JLabel());
		frame.add(confirm);
		confirm.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==confirm){
			LastWindow l = new LastWindow(name);
			l.showWindow();
			frame.dispose();
			
		}
		// TODO Auto-generated method stub
		
	}
	

}
