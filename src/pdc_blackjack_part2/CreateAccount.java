package pdc_blackjack_part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

public class CreateAccount extends JFrame implements ActionListener {

    JButton button1 = new JButton("Create");

    JPanel panel2 = new JPanel();
    JLabel userName, passWord, nameName;
    JTextField textField1, textField2, textField3;

    CreateAccount() {

        nameName = new JLabel();
        nameName.setText("Name:");
        userName = new JLabel();
        userName.setText("Username:");
        passWord = new JLabel();
        passWord.setText("Password:");

        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JPasswordField(15);

        panel2 = new JPanel(new GridLayout(4, 1));
        panel2.add(nameName);
        panel2.add(textField1);
        panel2.add(userName);
        panel2.add(textField2);
        panel2.add(passWord);
        panel2.add(textField3);
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
        String nameName = textField1.getText();
        String passWord = textField3.getText();
        String passValue = textField2.getText();

        if (button1 == e.getSource() && nameName != null && passWord != null && passValue != null) {

            JOptionPane.showMessageDialog(this, "Account Created Successfully! Please Login to Continue!");

            try {
                Login form = new Login();
                form.pack();
                form.setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cannot create account. Please fill in all fields.");
        }
    }
}
