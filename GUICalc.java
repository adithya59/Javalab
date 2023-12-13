/*Java program that works as a simple calculator. Arrange Buttons for digits and
the + - * % operations properly. Add a text field to display the result. Handle any possible
exceptions like divide by zero. Use Java Swing.*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class GUICalc extends JFrame implements ActionListener {
    JButton numberButtons[] = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;
    int operand1, operand2;
    char operator;
    JTextField resultField;

    GUICalc() {
        JFrame frame = new JFrame("Calculator");
        this.setTitle("Calculator by Adithya");
        setLayout(new BorderLayout());
        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new GridLayout(4, 3));
        
        int i=7;
        while (i>=0) {
        	numberButtons[i] = new JButton(String.valueOf(i));
            numberPanel.add(numberButtons[i]);
            numberButtons[i].addActionListener(this);
            if(i==9) {
            	i=3;
            }
            else if(i==6) {
            	i=0;
            }
            else if(i==3) {
            	i=-1;
            }
            else if(i==0) {
            	break;
            }
            i++;
        }
        
        multiplyButton = new JButton("*");
        numberPanel.add(multiplyButton);
        multiplyButton.addActionListener(this);
        divideButton = new JButton("/");
        numberPanel.add(divideButton);
        divideButton.addActionListener(this);
        
        JPanel operatorPanel = new JPanel();
        operatorPanel.setLayout(new GridLayout(4, 1));

        clearButton = new JButton("C");
        operatorPanel.add(clearButton);
        clearButton.addActionListener(this);
        addButton = new JButton("+");
        operatorPanel.add(addButton);
        addButton.addActionListener(this);
        subtractButton = new JButton("-");
        operatorPanel.add(subtractButton);
        subtractButton.addActionListener(this);
        equalsButton = new JButton("=");
        operatorPanel.add(equalsButton);
        equalsButton.addActionListener(this);

        resultField = new JTextField(10);
        resultField.setPreferredSize(new Dimension(200, 50));

        add(numberPanel, BorderLayout.CENTER);
        add(operatorPanel, BorderLayout.EAST);
        add(resultField, BorderLayout.NORTH);

        setVisible(true);
        setSize(350, 400);
    }

    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        if (clickedButton == clearButton) {
            operand1 = operand2 = 0;
            resultField.setText("");
        } else if (clickedButton == equalsButton) {
            operand2 = Integer.parseInt(resultField.getText());
            evaluate();
            resultField.setText(String.valueOf(operand1));
            operand1 = 0; // Reset operand1 for future calculations
        } else {
            boolean isOperator = false;
            if (clickedButton == addButton) {
                operator = '+';
                isOperator = true;
            }
            if (clickedButton == subtractButton) {
                operator = '-';
                isOperator = true;
            }
            if (clickedButton == multiplyButton) {
                operator = '*';
                isOperator = true;
            }
            if (clickedButton == divideButton) {
                operator = '/';
                isOperator = true;
            }

            if (!isOperator) {
                for (int i = 0; i < 10; i++) {
                    if (clickedButton == numberButtons[i]) {
                        String currentText = resultField.getText();
                        currentText += i;
                        resultField.setText(currentText);
                    }
                }
            } else {
                operand1 = Integer.parseInt(resultField.getText());
                resultField.setText("");
            }
        }
    }

    void evaluate() {
        switch (operator) {
            case '+':
                operand1 += operand2;
                break;
            case '-':
                operand1 -= operand2;
                break;
            case '*':
                operand1 *= operand2;
                break;
            case '/':
                if (operand2 == 0) {
                	resultField.setText("Error: Divide by zero");
                }
                else {
                	operand1 /= operand2;
                }
                break;
        }
    }

    public static void main(String[] args) {
        new GUICalc();
    }
}