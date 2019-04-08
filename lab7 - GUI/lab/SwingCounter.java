import javax.swing.*;
import java.awt.FlowLayout;

public class SwingCounter extends JFrame {
    public SwingCounter() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        add(new JLabel("Counter"));
        add(new JTextField(10));
        add(new JButton("Count"));
    }

    public static void main(String[] args) {
        SwingCounter frame = new SwingCounter();
        frame.setTitle("ShowFlowLayout");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}