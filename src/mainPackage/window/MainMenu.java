package mainPackage.window;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainMenu extends JMenuBar {
    private JMenu save;


    public MainMenu() {
        super();
        add(help());
//        add(save());
//        add(createSaveButton());
    }

    private JMenu help(){
        JMenu help = new JMenu("Меню");
        JMenuItem author = new JMenuItem("об авторе");
        help.add(author);
        JMenuItem program = new JMenuItem("О программе");
        help.add(program);
        return help;
    }
    private JMenu save(){
         save = new JMenu("Сохранить файл");
        return save;
    }

//    private JMenu createSaveButton(){
//        JMenu saveButton = new JMenu("Save file");
//        saveButton.addActionListener(e -> {
//
//            try(FileWriter writer = new FileWriter("sortMass.txt", false)) {
//                writer.write("Hello world");
//            }
//            catch (IOException ex){
//                System.out.println(ex.getMessage());
//            }
//        });
//        return saveButton;
//    }

}
