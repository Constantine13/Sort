package mainPackage;

import mainPackage.window.MyFrame;
import mainPackage.window.Splash;


/**
 * The main class for running the program
 *
 * @author Константин
 * @version 1.0.0.2021
 */
public class main {
    /**
     *
     * @param args args
     */
    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Сортировка");
        Splash splash = new Splash(frame);
    }
}



