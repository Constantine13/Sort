package mainPackage.window;

import javax.swing.*;

/**
 * Class for working with the About Program
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class AboutProgram extends JFrame {

    /**frame for 'about program'*/
    private final ProgramFrame programFrame;

    /**
     * description of the About Program window
     *
     * @param title title
     */
    public AboutProgram(String title) {
        setUndecorated(true);
        programFrame = new ProgramFrame(this);
        //  programFramePanel.setBackground(Color.white);
        add(programFrame);
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
