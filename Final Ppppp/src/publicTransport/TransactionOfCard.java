package publicTransport;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TransactionOfCard implements ActionListener {
	private JFrame frame;
	private JTextField amount;
	private JTextField referenceNo;
	private JButton cont;
	private String s;
	private String name;

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==cont){
			frame.dispose();
			LastWindow w = new LastWindow(name);
			w.showWindow();
		}
		
		
	}
	public TransactionOfCard(String s,String name){
		this.s = s;
		this.name = name;
		
	}
	public void showWindow(){
		frame = new JFrame();
		amount = new JTextField();
		referenceNo = new JTextField();
		cont = new JButton("  Continue  ");
		frame.setTitle("Transaction Details");
		frame.setSize(400, 200);
		frame.setLocation(500,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(8,2,7,5));
		frame.add(new JLabel("Total Transaction Amount :"));
		frame.add(amount);
		amount.setEditable(false);
		amount.setText(s);
		frame.add(new JLabel("Transaction Reference Number :"));
		frame.add(referenceNo);
		for(int i = 0;i<1;i++){
			if(i==0)
		referenceNo.setText("a343fefQh9");
			else
				referenceNo.setText("LM5jd83uh");
				
		}
		
		frame.add(new JLabel());
		frame.add(new JLabel());
		frame.add(new JLabel());
		frame.add(cont);
		cont.addActionListener(this);
		frame.setVisible(true);
		
		
				
		
		
		
	}
	

}
