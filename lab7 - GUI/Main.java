import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Microsoft Word");
        
        JButton jbt1 = new JButton("OK");
        JButton jbt2 = new JButton("Save");
        JButton jbt3 = new JButton("Cancle");
        frame.add(jbt1);
        frame.add(jbt2);
        frame.add(jbt3);

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}