
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//created sice 10/20/2026 by Nathan Liu
public class todoList_app {

    public static void main(String[] args) {
        JLabel label01 = new JLabel();
        JFrame frame = new JFrame();
        label01.setHorizontalAlignment(SwingConstants.TRAILING);

        //frame elements
        label01.setText("text");
        frame.add(label01);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);

    }
}
