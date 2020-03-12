import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorFrame extends JFrame {
    private JPanel Calculator;
    private JButton calculateJButton;
    private JSpinner number1JSpinner;
    private JComboBox operationJComboBox;
    private JLabel JustEqual;
    private JLabel resultJLabel;
    private JSpinner number2JSpinner;

    public CalculatorFrame(String title) {
        super(title);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Calculator);
        this.pack();

        calculateJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operation = String.valueOf(operationJComboBox.getSelectedItem());
                int number1 = (int)number1JSpinner.getValue();
                int number2 = (int)number2JSpinner.getValue();
                double result = 0;

                if (operation.equals("+"))
                    result = 
            }
        });
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFrame frame = new CalculatorFrame("Calculator");
        frame.setSize(300, 200);
        frame.setVisible(true);
    }


}
