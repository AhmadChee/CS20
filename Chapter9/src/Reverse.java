import javax.swing.*;
import java.awt.*;

public class Reverse {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Countdown");//frames name is "Countdown"
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = i;
        }
        JTextArea reverseListArea = new JTextArea();
        reverseListArea.setEditable(false);

        for (int i = arr.length - 1; i >= 0; --i) {
            reverseListArea.append("  " + arr[i] + "\n");
        }
        
        frame.add(reverseListArea);

        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}
