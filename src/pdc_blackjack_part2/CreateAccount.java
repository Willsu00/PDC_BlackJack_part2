package pdc_blackjack_part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

public class CreateAccount extends JFrame implements ActionListener {

    JButton button1 = new JButton("Create");

    JPanel panel2 = new JPanel();
    JLabel userName, passWord, nameName;
    JTextField nameField, userField, passField;

    CreateAccount() {

        button1.addActionListener(this);

        nameName = new JLabel();
        nameName.setText("Name:");
        userName = new JLabel();
        userName.setText("Username:");
        passWord = new JLabel();
        passWord.setText("Password:");

        nameField = new JTextField();
        userField = new JTextField();
        passField = new JPasswordField(15);

        panel2 = new JPanel(new GridLayout(4, 1));
        panel2.add(nameName);
        panel2.add(nameField);
        panel2.add(userName);
        panel2.add(userField);
        panel2.add(passWord);
        panel2.add(passField);
        panel2.add(button1);

        add(panel2, BorderLayout.CENTER);
        setTitle("Create Account");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 150);
        setVisible(true);
        setResizable(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String nameName = nameField.getText();
        String passWord = userField.getText();
        String userName = passField.getText();

        System.out.println(nameName + " " + passWord + " " + userName);

        if (!nameName.isEmpty() && !userName.isEmpty() && !passWord.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Account Created Successfully! Please Login to Continue!");

            try {
                Login form = new Login();
                form.pack();
                form.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        } else {
            JOptionPane.showMessageDialog(this, "Cannot create account. Please fill in all fields.");
        }
    }
}
