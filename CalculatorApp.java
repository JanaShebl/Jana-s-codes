import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    private JTextField num1;
    private JTextField num2;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;

    public CalculatorApp() {
        // Create the frame
        JFrame frame = new JFrame("Simple Girly Calculator 💖");
        frame.setSize(395, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(255,240,250));

        Font mfont=new Font("Comic Sans MS", Font.BOLD, 16);
        // Create components
        num1 = new JTextField();
        num1.setBounds(50, 20, 200, 30);
        num1.setFont(mfont);
        frame.add(num1);

        num2 = new JTextField();
        num2.setBounds(50, 60, 200, 30);
        num2.setFont(mfont);
        frame.add(num2);


        addButton = new JButton("Add");
        addButton.setBounds(10, 100, 70, 30);
        addButton.setBackground(new Color(204, 153, 255));
        addButton.setForeground(Color.WHITE);
        addButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        addButton.setFont(mfont);
        frame.add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.setBounds(90, 100, 90, 30);
        subtractButton.setBackground(new Color(204, 153, 255));
        subtractButton.setForeground(Color.WHITE);
        subtractButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        subtractButton.setFont(mfont);
        frame.add(subtractButton);


        multiplyButton = new JButton("Multiply");
        multiplyButton.setBounds(190, 100, 90, 30);
        multiplyButton.setBackground(new Color(204, 153, 255));
        multiplyButton.setForeground(Color.WHITE);
        multiplyButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        multiplyButton.setFont(mfont);
        frame.add(multiplyButton);


        divideButton = new JButton("Divide");
        divideButton.setBounds(290, 100, 80, 30);
        divideButton.setBackground(new Color(204, 153, 255));
        divideButton.setForeground(Color.WHITE);
        divideButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
        divideButton.setFont(mfont);
        frame.add(divideButton);

        resultLabel = new JLabel("Result : ");
        resultLabel.setBounds(50, 140, 200, 30);
        resultLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        resultLabel.setForeground(new Color(204, 0, 102));
        frame.add(resultLabel);

        // Set frame visibility
        frame.setVisible(true);


        // Add action listeners
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation('/');
            }
        });


    }

    private void performOperation(char operator) {
        try {
            double fnum = Double.parseDouble(num1.getText());
            double snum = Double.parseDouble(num2.getText());
            double result = 0.0;

            switch (operator) {
                case '+':
                    result = fnum + snum;
                    break;
                case '-':
                    result = fnum - snum;
                    break;
                case '*':
                    result = fnum * snum;
                    break;
                case '/':
                    if (snum != 0) {
                        result = fnum / snum;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero يا حجة انتي", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers متخنقوناش معاكوا", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}
