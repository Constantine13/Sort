package mainPackage.window;

import javax.swing.*;
import java.awt.*;

/**
 * Class for description start window
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class SplashFrame extends JPanel {

    //  private volatile boolean isStartButtonClicked = false;

    /**
     * main program frame
     */
    private MyFrame frame;
    /**
     * splash window
     */
    private Splash splash;

    /**
     * adding information
     *
     * @param frame frame
     * @param splash splash
     */

    public SplashFrame(MyFrame frame, Splash splash) {
        this.frame = frame;
        this.splash = splash;

        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        JLabel labelBNTU = new JLabel("Белорусский национальный технический университет");
        labelBNTU.setFont(new Font("", Font.BOLD,20));
        labelBNTU.setForeground(Color.WHITE);
        labelBNTU.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelFITR = new JLabel("Факультет информационных технологий и робототехники");
        labelFITR.setFont(new Font("", Font.BOLD,20));
        labelFITR.setForeground(Color.WHITE);
        labelFITR.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelKafedra = new JLabel("Кафедра программного обеспечения" +
                " информационных систем и технологий");
        labelKafedra.setFont(new Font("", Font.BOLD,20));
        labelKafedra.setForeground(Color.WHITE);
        labelKafedra.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelName = new JLabel("Курсовая работа");
        labelName.setFont(new Font("", Font.BOLD,30));
        labelName.setForeground(Color.WHITE);
        labelName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelDiscipline = new JLabel("по дисциплине «Программирование на Jаvа»");
        labelDiscipline.setFont(new Font("", Font.BOLD,25));
        labelDiscipline.setForeground(Color.WHITE);
        labelDiscipline.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelStudGroup = new JLabel("Сортировка числовых данных методом подсчета");
        labelStudGroup.setFont(new Font("", Font.BOLD,20));
        labelStudGroup.setForeground(Color.WHITE);
        labelStudGroup.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelAuthor = new JLabel("<html>Выполнил: Студент группы 10702418" +
                "<br>Саракваша Константин Сергеевич<br><br><br>" +
                "Преподаватель: доцент " +
                "<br>Сидорик Валерий Владимирович</html>");
        labelAuthor.setFont(new Font("", Font.BOLD,20));
        labelAuthor.setForeground(Color.WHITE);
        labelAuthor.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelNow = new JLabel("Минск 2021");
        labelNow.setFont(new Font("", Font.BOLD,20));
        labelNow.setForeground(Color.WHITE);
        labelNow.setHorizontalAlignment(SwingConstants.CENTER);

        JButton startButton = initializeStartButton();
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(new Color(10,100,150));
        startButton.setSize(30,100);

        JButton exitButton = initializeExitButton();
        exitButton.setForeground(Color.WHITE);
        exitButton.setBackground(new Color(10,100,150));
        exitButton.setSize(30,100);

        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 15, 0);
        add(labelBNTU, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 0, 0);
        add(labelFITR, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 60, 0);
        add(labelKafedra, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 10, 0);
        add(labelName, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 15, 0);
        add(labelDiscipline, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 30, 0);
        add(labelStudGroup, constraints);

        constraints.gridwidth = 1;
        constraints.gridheight = 2;
        constraints.weightx = 1;
        constraints.insets    = new Insets(0, 60, 30, 0);

        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.gridheight = 1;
        constraints.gridy = 6;
        constraints.gridx = 1;
        constraints.weightx = 1;
        constraints.insets    = new Insets(0, 0, 30, 0);
        add(labelAuthor, constraints);
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 10, 0);
        constraints.gridy = 9;
        constraints.gridx = 0;
        add(labelNow, constraints);

        constraints.gridy = 10;
        constraints.gridx = 0;
        constraints.gridwidth = 1;
        constraints.anchor    = GridBagConstraints.PAGE_START;
        constraints.insets    = new Insets(0, 50, 10, 150);
        add(startButton, constraints);
        constraints.gridy = 10;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.anchor    = GridBagConstraints.PAGE_END;
        constraints.insets    = new Insets(0, 300, 10, 50);
        add(exitButton, constraints);
    }

    //adding a button to go to the main window
    private JButton initializeStartButton() {
        JButton startButton = new JButton("Далее");
        startButton.addActionListener(e -> {
            splash.dispose();
            frame.setVisible(true);
        });
        return startButton;
    }

    //adding a button to exit the program
    private JButton initializeExitButton() {
        JButton exitButton = new JButton("Выход");
        exitButton.addActionListener(e -> {
            System.exit(0);
        });
        return exitButton;
    }
}
