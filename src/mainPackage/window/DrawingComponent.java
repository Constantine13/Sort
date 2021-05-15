package mainPackage.window;

import javax.swing.*;
import java.awt.*;

public class DrawingComponent extends JPanel {
    private final JFrame frame;

    public DrawingComponent(JFrame frame){
        super();
        this.frame = frame;
        setBackground(Color.LIGHT_GRAY );
    }
}
