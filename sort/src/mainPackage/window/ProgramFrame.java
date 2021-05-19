package mainPackage.window;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Class for describing the About Program
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class ProgramFrame extends JPanel {
    /**
     * Method for describing the About Program
     *
     * @param frame frame
     *
     */

    public ProgramFrame(AboutProgram frame) {
        setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;

        Border loweredBorder = BorderFactory.createLoweredBevelBorder();

        JLabel labelName = new JLabel("Сортировка числовых данных методом подсчета");
        labelName.setFont(new Font("", Font.BOLD,25));
        labelName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelOfProgram = new
                JLabel("<html><i>Программа позволяет:</i>" +
                "<br>1. Создавать массив целых чисел" +
                "<br>2. Сортировать полученный массив" +
                "<br>   по возрастанию и убыванию" +
                "<br>3. Сохранять отсортированный массив  " +
                "<br>   в текстовый файл</html>");
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

        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.insets    = new Insets(0, 0, 10, 0);
        add(labelName, constraints);
        constraints.gridwidth = GridBagConstraints.RELATIVE;
        constraints.gridwidth = 1;
        constraints.insets    = new Insets(0, 20, 0, 20);
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
