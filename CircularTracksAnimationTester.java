import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
public class CircularTracksAnimationTester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        final Moveable shape = new CircularTracksShape(0, 0, 600);

        ShapeIcon icon = new ShapeIcon(shape,600,600);

        final JLabel label = new JLabel(icon);
        label.setBackground(Color.decode("#708C98"));
        label.setOpaque(true);

        frame.setLayout(new FlowLayout());
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
  
        final int DELAY = 50;
        Timer t = new Timer(DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                label.repaint();
                shape.translate(1,1);
            }
        });
        t.start();
    }
}