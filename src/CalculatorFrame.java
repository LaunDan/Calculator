import javax.swing.*;

public class CalculatorFrame extends JFrame{
    private JPanel Calculator;
    private JButton calculateJButton;
    private JSpinner number1JSpinner;
    private JComboBox operationJComboBox;
    private JLabel JustEqual;
    private JLabel resultJLabel;
    private JSpinner number2JSpinner;

    public CalculatorFrame(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Calculator);
        this.pack();
    }

    public static void main(String[] args){
        JFrame frame = new CalculatorFrame("Calculator");
        frame.setVisible(true);
    }
}
