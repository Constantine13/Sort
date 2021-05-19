package mainPackage.window;

import javax.swing.*;
import java.awt.*;

/**
 * Class for working with the start window form
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class Splash extends JFrame {

    /**splash frame*/
    private final SplashFrame panel;

    /**main program frame*/
    private MyFrame frame;

    /**
     * basic parameters of the start window
     *
     * @param frame frame
     */

    public Splash(MyFrame frame) {
        this.frame = frame;
        setUndecorated(true);
        panel = new SplashFrame(this.frame, this);
        panel.setBackground(new Color(10,100,150));
        add(panel);
        setSize(950,650);
        final int delayMilliseconds =5000;
        Timer timer = new Timer(delayMilliseconds, e -> dispose());
        timer.start();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
