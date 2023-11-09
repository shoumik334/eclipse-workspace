package publicTransport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Abstraction,Interface
abstract class PaymentMethod {
    private String name;

    public PaymentMethod(String name) {
        this.name = name;
    }

    public abstract void pay();

    public String getName() {
        return name;
    }
}

class MobilePayment extends PaymentMethod {
    public MobilePayment(String name) {
        super(name);
    }
//Method Overriding
    @Override
    public void pay() {
        Mobile mobile = new Mobile(getName());
        mobile.showWindow();
    }
}

class CashOnDelivery extends PaymentMethod {
    public CashOnDelivery(String name) {
        super(name);
    }
  //Method Overriding
    @Override
    public void pay() {
        Cash cash = new Cash(getName());
        cash.showWindow();
        JOptionPane.showMessageDialog(null, "Your ticket would be reserved and inactive until our call center agent calls you and verifies your credentials. Tickets will become active when you pay the due amount during the delivery of the ticket at your doorstep.");
    }
}

class CardPayment extends PaymentMethod {
    private String amount;

    public CardPayment(String amount, String name) {
        super(name);
        this.amount = amount;
    }
  //Method Overriding
    @Override
    public void pay() {
        JOptionPane.showMessageDialog(null, "You will be redirected to a third-party payment gateway where you can pay with your credit or debit cards. Your payment transactions are 100% secure. On successful payment, you will get a confirmed ticket.");
        Card card = new Card(amount, getName());
        card.showWindow();
    }
}

public class Payment implements ActionListener {
    private JFrame window;
    private JButton mobile;
    private JButton cash;
    private JButton card;
    private JTextField amount;
    private double a;
    private String aString;
    private String name;

    public Payment(double fare, String name) {
        this.a = fare;
        this.aString = Double.toString(a);
        this.name = name;
    }

    public void showWindow() {
        window = new JFrame();
        mobile = new JButton("Mobile");
        cash = new JButton("Cash On Delivery");
        card = new JButton("Credit/Debit Card");
        amount = new JTextField();
        window.setTitle("Payment");
        window.setSize(500, 350);
        window.setLocation(300, 250);
        window.setLayout(new GridLayout(2, 3, 10, 20));
        window.add(new JLabel("Total Amount Payable : "));
        window.add(amount);
        amount.setEditable(false);
        amount.setText(aString + " BDT");

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
        PaymentMethod paymentMethod = null;

        if (e.getSource() == mobile) {
            paymentMethod = new MobilePayment(name);
        } else if (e.getSource() == cash) {
            paymentMethod = new CashOnDelivery(name);
        } else if (e.getSource() == card) {
            paymentMethod = new CardPayment(aString, name);
        }

        if (paymentMethod != null) {
            paymentMethod.pay();
            window.dispose();
        }
    }
}