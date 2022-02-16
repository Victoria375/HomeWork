package EighthHW;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EighthHW extends JFrame {

    public int value;

    public EighthHW(int initialValue) {
        value = initialValue;

        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 300, 120);

        Font font = new Font("Arial", Font.BOLD, 32);

        JTextField counterValueView = new JTextField(String.valueOf(value));
        JButton increaseButton = new JButton("+");
        JButton decreaseButton = new JButton("-");

        counterValueView.setFont(font);
        increaseButton.setFont(font);
        decreaseButton.setFont(font);

        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);

        add(counterValueView, BorderLayout.CENTER);
        add(increaseButton, BorderLayout.EAST);
        add(decreaseButton, BorderLayout.WEST);

        counterValueView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = Integer.parseInt(counterValueView.getText());
            }
        });

        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new EighthHW(0);
    }
}


