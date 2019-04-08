import javax.swing.*;
import java.awt.*;

public class SwingCalculator extends JFrame {
    public SwingCalculator() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,4));
        p1.add(new JButton("7"));
        p1.add(new JButton("8"));
        p1.add(new JButton("9"));
        p1.add(new JButton("+"));
        p1.add(new JButton("4"));
        p1.add(new JButton("5"));
        p1.add(new JButton("6"));
        p1.add(new JButton("-"));
        p1.add(new JButton("1"));
        p1.add(new JButton("2"));
        p1.add(new JButton("3"));
        p1.add(new JButton("*"));
        p1.add(new JButton("C"));
        p1.add(new JButton("0"));
        p1.add(new JButton("="));
        p1.add(new JButton("/"));

        JPanel p2 = new JPanel(new BorderLayout());

        JTextField text = new JTextField();
        text.setHorizontalAlignment ( SwingConstants.RIGHT );

        p2.add(text, BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        add(p2, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        SwingCalculator frame = new SwingCalculator();
        frame.setTitle("SwingCalculator");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}