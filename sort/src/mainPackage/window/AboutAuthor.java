package mainPackage.window;

import javax.swing.*;

/**
 * Class for working with frame About Author
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class AboutAuthor extends JFrame {

    /**frame for 'about author'*/
    private final AuthorFrame authorFrame;

    /**
     *
     * description window about author
     *
     * @param title title
     */
    public AboutAuthor(String title) {
        setUndecorated(true);
        authorFrame = new AuthorFrame(this);
        add(authorFrame);
        setSize(400,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
