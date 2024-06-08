package pdc_blackjack_part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

public class CreateAccount extends JFrame implements ActionListener {

    JButton button1 = new JButton("Create Account");

    JPanel panel1 = new JPanel();
    JLabel userName, passWord, nameName;
    JTextField textField1, textField2, textField3;

    CreateAccount() {

        setTitle("Create Account");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameName = new JLabel();
        nameName.setText("Name:");
        userName = new JLabel();
        userName.setText("Username:");
        passWord = new JLabel();
        passWord.setText("Password:");

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JPasswordField(15);

        panel1 = new JPanel(new GridLayout(4, 1));
        panel1.add(nameName);
        panel1.add(textField1);
        panel1.add(userName);
        panel1.add(textField2);
        panel1.add(passWord);
        panel1.add(textField3);
        panel1.add(button1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
