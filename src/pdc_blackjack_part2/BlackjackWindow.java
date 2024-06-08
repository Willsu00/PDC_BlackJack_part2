package pdc_blackjack_part2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.io.IOException;
// import java.lang.Exception;

class BlackjackWindow extends JFrame implements ActionListener {

    JButton button = new JButton("Deal");
    JButton button2 = new JButton("Hit");
    JButton button3 = new JButton("Stand");
    JButton button4 = new JButton("Quit");

    JPanel panel = new JPanel();

    BlackjackWindow() {

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setTitle("Welcome to Blackjack");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // gamePanel.getTextArea().setEditable(false);

        panel.add(button);
        button.setLayout(getLayout());
        panel.add(button2);
        button2.setLayout(getLayout());
        panel.add(button3);
        button3.setLayout(getLayout());
        panel.add(button4);

        add(panel, BorderLayout.CENTER);
        setSize(500, 500);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
