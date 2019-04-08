import javax.swing.*;
import java.awt.*;

public class GuiComponent extends JFrame {
    public GuiComponent() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        JButton jbt = new JButton("Button");
        JCheckBox jchk1 = new JCheckBox();
        JLabel jlb = new JLabel("Label");
        JCheckBox jchk2 = new JCheckBox();
        jchk2.setBackground(Color.RED);
        JTextField jtf = new JTextField("Text Field");

        add(jbt);
        add(jchk1);
        add(jlb);
        add(jchk2);
        add(jtf);

    }

    public static void main(String[] args) {
        GuiComponent frame = new GuiComponent();
        frame.setTitle("ShowFlowLayout");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }
}