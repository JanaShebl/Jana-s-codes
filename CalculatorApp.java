import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    private JTextField num1Field;
    private JTextField num2Field;
    private JButton addButton;
    private JButton subtractButton;
    private JButton multiplyButton;
    private JButton divideButton;
    private JLabel resultLabel;

    public CalculatorApp() {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(395, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create components
        num1Field = new JTextField();
        num1Field.setBounds(50, 20, 200, 30);
        frame.add(num1Field);

        num2Field = new JTextField();
        num2Field.setBounds(50, 60, 200, 30);
        frame.add(num2Field);


        addButton = new JButton("Add");
        addButton.setBounds(10, 100, 70, 30);
        frame.add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.setBounds(90, 100, 90, 30);
        frame.add(subtractButton);


        multiplyButton = new JButton("Multiply");
        multiplyButton.setBounds(190, 100, 90, 30);
        frame.add(multiplyButton);


        divideButton = new JButton("Divide");
        divideButton.setBounds(290, 100, 80, 30);
        frame.add(divideButton);

        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(50, 140, 200, 30);
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
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0.0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new CalculatorApp();
    }
}