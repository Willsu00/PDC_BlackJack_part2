/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pdc_blackjack_part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

/**
 *
 * @author willi
 */
public class Login extends JFrame implements ActionListener {

    JButton button1, button2;
    JPanel panel1;
    JLabel userName, passWord, nameName;
    final JTextField textField1, textField2, textField3;

    Login() {

        nameName = new JLabel();
        nameName.setText("Name:");
        userName = new JLabel();
        userName.setText("Username:");
        passWord = new JLabel();
        passWord.setText("Password:");

        textField3 = new JTextField();
        textField1 = new JTextField();
        textField2 = new JPasswordField(15);

        button1 = new JButton("Submit");
        button1.addActionListener(this);

        button2 = new JButton("Create Account");
        button2.addActionListener(this);

        panel1 = new JPanel(new GridLayout(4, 1));
        panel1.add(nameName);
        panel1.add(textField3);
        panel1.add(userName);
        panel1.add(textField1);
        panel1.add(passWord);
        panel1.add(textField2);
        panel1.add(button1);
        panel1.add(button2);

        add(panel1, BorderLayout.CENTER);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nameValue = textField3.getText();
        String userValue = textField1.getText();
        String passValue = textField2.getText();

        if (nameValue.equals("name") && userValue.equals("test") && passValue.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful");

            BlackjackWindow window = new BlackjackWindow();
            window.setVisible(true);

        }
        if (button2 == e.getSource()) {
            CreateAccount account = new CreateAccount();
            account.setVisible(true);

        }
        if (nameValue != "name" && userValue != "test" && passValue != "1234") {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }

    }
}
