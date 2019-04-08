import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {
    public static final int WIDTH = 400;
    public static final int HIGHT = 300;

    public MyFrame() {
        setTitle("SimpleFrame");
        setSize(WIDTH, HIGHT);
    }
    public MyFrame(String title) {
        super(title);
        super.setSize(WIDTH, HIGHT);
        super.setLayout (new FlowLayout());
    }
}