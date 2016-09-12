import javax.swing.*;
import java.awt.*;

/**
 * Created by ScorpionOrange on 2016/09/09.
 */
public class RadioButtonFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            JFrame frame = new RadioButtonFrame();
            frame.setTitle("RadioButtonFrame Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
