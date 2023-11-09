package publicTransport;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class FirstWindow implements ActionListener {

    private JFrame window = new JFrame();
    private JButton signIn = new JButton("Sign In");
    private JButton createNewProfile = new JButton("Create a new profile");
    private JButton cancel = new JButton("Cancel");

    public void initWindow() {
        
        JLayeredPane layeredPane = new JLayeredPane();

        
        ImageIcon imageIcon = new ImageIcon("logo.jpg"); 
        JLabel imageLabel = new JLabel(imageIcon);

        
        imageLabel.setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());

        
        layeredPane.add(imageLabel, JLayeredPane.DEFAULT_LAYER);

        
        signIn.setBounds(50, 100, 100, 30);
        createNewProfile.setBounds(50, 150, 150, 30);
        cancel.setBounds(50, 200, 100, 30);

        
        layeredPane.add(signIn, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(createNewProfile, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(cancel, JLayeredPane.PALETTE_LAYER);

       
        window.add(layeredPane);

        
        signIn.addActionListener(this);
        createNewProfile.addActionListener(this);
        cancel.addActionListener(this);
    }

    public void showWindow() {
        initWindow();

        window.setSize(500, 500);
        window.setLocation(500, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signIn) {
            SignIn LC = new SignIn();
            LC.showWindow();
            window.dispose();
        } else if (e.getSource() == createNewProfile) {
            Registration RC = new Registration();
            RC.showWindow();
            window.dispose();
        } else if (e.getSource() == cancel) {
            System.exit(0);
        }
    }
}
