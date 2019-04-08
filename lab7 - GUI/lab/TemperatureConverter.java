import javax.swing.*;
import java.awt.GridLayout;

public class TemperatureConverter extends JFrame {
    public TemperatureConverter() {
        setLayout(new GridLayout(2, 2, 5, 5));

        add(new JLabel("Celsius:"));
        add(new JTextField(10));
        add(new JLabel("Fahrenheit"));
        add(new JTextField(10));
    }


    public static void main(String[] args) {
        TemperatureConverter frame = new TemperatureConverter();
        frame.setTitle("TemperatureConverter");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 100);
        frame.setVisible(true);
    }
}