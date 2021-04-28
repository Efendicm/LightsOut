import javax.swing.*;

public class LightsoutFrame {
    public static void main(String[] args) {
        LightsOut frame = new LightsOut("Lights Out V1");
        frame.setSize(250,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
