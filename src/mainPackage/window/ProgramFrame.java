package mainPackage.window;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class ProgramFrame extends JPanel {

    public ProgramFrame(AboutProgram frame) {
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        Border loweredBorder = BorderFactory.createLoweredBevelBorder();

        ImageIcon icon = new ImageIcon("src\\Main\\Images\\Program.jpg");
        JLabel labelIcon = new JLabel(icon);
        labelIcon.setBorder(loweredBorder);

        JLabel labelName = new JLabel("СТУДЕНЧЕСКАЯ ГРУППА");
        labelName.setFont(new Font("", Font.BOLD,25));
        labelName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelOfProgram = new
                JLabel("<html><i>Программа позволяет:</i>" +
                "<br>1. Выводить информацию о студентах группы" +
                "<br>2. Добавлять нового студента в список группы," +
                "<br>   указывая его ФИО, дату рождения, форму обучения" +
                "<br>   и средний балл" +
                "<br>3. Редактировать данные студента из списка группы " +
                "<br>   по введенному его ФИО" +
                "<br>4. Удалять данные студента из списка группы " +
                "<br>   по введенному его ФИО" +
                "<br>5. Сохранять список группы</html>");
        labelOfProgram.setFont(new Font("", Font.PLAIN,20));
        labelOfProgram.setBorder(loweredBorder);
        labelOfProgram.setBackground(Color.white);

        JLabel labelVer = new JLabel("Версия ver. 1.0.0.2021");
        labelVer.setFont(new Font("", Font.PLAIN,20));
        labelVer.setHorizontalAlignment(SwingConstants.CENTER);
        labelVer.setBorder(loweredBorder);
        labelVer.setBackground(Color.white);


        JButton buttonBack = new JButton("Назад");
        buttonBack.addActionListener(e -> {
            frame.dispose();
        });
        ImageIcon iconBack = new ImageIcon("src\\main\\Package\\Back.png");
        buttonBack.setIcon(iconBack);

        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 10, 0);
        add(labelName, constraints);
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        constraints.gridwidth = 1;
        constraints.insets    = new Insets(0, 20, 0, 20);
        add(labelIcon, constraints);
        constraints.gridwidth = 3;
        constraints.insets    = new Insets(0, 0, 10, 20);
        add(labelOfProgram, constraints);
        constraints.gridy = 2;
        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 0.5;
        constraints.insets    = new Insets(0, 0, 0, 200);
        add(labelVer, constraints);
        constraints.gridy = 2;
        constraints.gridx = 3;
        constraints.weightx = 0;
        constraints.anchor    = GridBagConstraints.PAGE_END;
        constraints.insets    = new Insets(0, 0, 0, 20);
        add(buttonBack, constraints);
    }
}
