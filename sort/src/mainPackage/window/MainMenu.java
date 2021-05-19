package mainPackage.window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for describing the operation of the context menu
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class MainMenu extends JMenuBar {

    /**
     * adding the main method
     */

    public MainMenu() {
        super();
        add(help());
    }

    //method for describing the context menu
    private JMenu help(){
        JMenu help = new JMenu("Меню");
        JMenuItem author = new JMenuItem("Об авторе");
        help.add(author);
        author.addActionListener(e -> { new AboutAuthor("Об авторе").setVisible(true);});
        JMenuItem program = new JMenuItem("О программе");
        help.add(program);
        program.addActionListener(e -> { new AboutProgram("О программе").setVisible(true);});
        JMenuItem exit = new JMenuItem("Выход");
        exit.addActionListener(new exitApp());
        help.add(exit);
        return help;
    }

    //description of the exit from the program
    static class exitApp implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }
}
