package mainPackage.window;

import javax.swing.*;

public class AboutProgram extends JFrame {

    private final ProgramFrame programFrame;

    public AboutProgram(String title) {
        setUndecorated(true);
        programFrame = new ProgramFrame(this);
        //  programFramePanel.setBackground(Color.white);
        add(programFrame);
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

   // public AboutProgram(String title){
     //   super(title);
       // setSize(500,700);
       // setLocationRelativeTo(null);
    //}

}
