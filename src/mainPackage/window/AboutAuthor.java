package mainPackage.window;

import javax.swing.*;

public class AboutAuthor extends JFrame {

    private final AuthorFrame authorFrame;

    public AboutAuthor(String title) {
        setUndecorated(true);
        authorFrame = new AuthorFrame(this);
        add(authorFrame);
        setSize(400,640);
        setLocationRelativeTo(null);
        setVisible(true);
    }

//    public AboutAuthor(String title){
  //      super(title);
    //    setSize(500,700);
      //  setLocationRelativeTo(null);
//    }

}
