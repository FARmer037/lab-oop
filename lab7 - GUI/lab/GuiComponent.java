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
        JTextArea txt = new JTextArea(7, 20);
        txt.setText("Text Area");

        DefaultListModel<String> l1 = new DefaultListModel<>();
        for (int i = 1 ; i <= 10 ; i++) {
            l1.addElement("Item " + i);
        }
        JList<String> list = new JList<>(l1);

        String[] c1 = {"Yes", "No"};
        JComboBox combo = new JComboBox(c1);

        add(jbt);
        add(jchk1);
        add(jlb);
        add(jchk2);
        add(jtf);
        add(new JScrollPane(txt));
        add(new JScrollPane(list));
        add(combo);

    }

    public static void main(String[] args) {
        GuiComponent frame = new GuiComponent();
        frame.setTitle("GuiComponent");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
}