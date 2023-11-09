package publicTransport;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class JourneyDetails implements ActionListener {

    private JFrame window = new JFrame();
    private JButton cancel = new JButton("CANCEL");
    private String n;

    public JourneyDetails(String name) {
        this.n = name;
    }

    public void initWindow() {
        GridLayout g1 = new GridLayout(5, 0);
        window.setLayout(g1);
        cancel.addActionListener(this);
    }

    public void showWindow() {
        initWindow();
        String from = "";
        String to = "";
        String name = "";
        String date = "";
        String departureTime = "";
        String arrivalTime = "";

        window.setSize(500, 500);
        window.setLocation(500, 200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            File f = new File("Bus.txt");
            Bus[] b = new Bus[20];

            int index = 0;
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                b[index] = new Bus(s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), s.nextLine(), Integer.parseInt(s.nextLine()));
                index++;
            }

            for (int i = 0; i < b.length; i++) {
                if (b[i] != null && b[i].getName().equals(n)) {
                    from = b[i].getFrom();
                    to = b[i].getTo();
                    name = b[i].getName();
                    date = b[i].getDate();
                    departureTime = b[i].getDeparture_Time();
                    arrivalTime = b[i].getArrival_Time();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        window.add(new JLabel("Bus name: " + name));
        window.add(new JLabel("Start From: " + from));
        window.add(new JLabel("End to: " + to));
        window.add(new JLabel("Journey date: " + date));
        window.add(new JLabel("Departure Time: " + departureTime));
        window.add(new JLabel("Arrival Time: " + arrivalTime));
        window.add(cancel);

        window.setTitle("JOURNEY DETAILS");
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cancel) {
            window.dispose();
        }
    }
}
