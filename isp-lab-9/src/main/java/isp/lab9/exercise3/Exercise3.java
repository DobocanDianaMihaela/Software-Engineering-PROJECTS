/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author mihai.hulea
 */
public class Exercise3 {
    public static void main(String[] args)throws Exception
    {
        System.out.println("It works.");
        JFrame frame = new JFrame ("Access Door");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        JLabel label = new JLabel ("type access code: ");
        JTextField textField = new JTextField(10);
        JTextField status = new JTextField(10);
        panel1.add(label);
        panel1.add(textField);
        panel1.setLayout(new FlowLayout());

        JButton b1 = new JButton("Enter code");
        panel2.add(b1);
        panel2.add(status);


        panel3.setLayout(new FlowLayout());
        panel3.add(new JLabel("Door status"));
        panel3.add(status);

        JPanel p = new JPanel();
        p.add(panel1);
        p.add(panel2);
        p.add(panel3);
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

        frame.setContentPane(p);
        frame.setVisible(true);

        ControllerInterface controller=new DoorLockController(new Door(), new ArrayList<>());
        controller.addTenant("200420", "Diana");
        controller.addTenant("20", "Tersinio");


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pin= textField.getText();
                try {
                    DoorStatus doorStatus= controller.enterPin(pin);
                    status.setText(doorStatus.toString());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    status.setText(ex.getMessage());
                }

            }
        });
    }

}