package mainPackage.window;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Class for description frame About Author
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class AuthorFrame extends JPanel {

    /**
     * @param frame frame
     */
    public AuthorFrame(AboutAuthor frame) {
        setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        Border loweredBorder = BorderFactory.createLoweredBevelBorder();

        // Default natural height, maximum width
        constraints.fill = GridBagConstraints.VERTICAL;
        constraints.weightx = 1.0;
        constraints.gridx   = 0  ;  //the zero cell of the table horizontally

        ImageIcon icon = new ImageIcon("src\\Main\\Images\\Author.jpg");
        JLabel labelIcon = new JLabel(icon);
        labelIcon.setBorder(loweredBorder);

        JLabel labelAuthor = new JLabel("Автор");
        labelAuthor.setFont(new Font("", Font.BOLD,20));
        labelAuthor.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelGroup = new JLabel("студент группы 10702418");
        labelGroup.setFont(new Font("", Font.BOLD,20));
        labelGroup.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelFullName = new JLabel("Саракваша Константин Сергеевич");
        labelFullName.setFont(new Font("", Font.BOLD,20));
        labelFullName.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel labelGmail = new JLabel("sarakvashakonst@gmail.com");
        labelGmail.setFont(new Font("", Font.BOLD,20));
        labelGmail.setHorizontalAlignment(SwingConstants.CENTER);

        JButton buttonBack = new JButton("Назад");
        buttonBack.addActionListener(e -> {
            frame.dispose();
        });

        constraints.gridy = 0;
        constraints.insets = new Insets(0, 0, 10, 0);
        add(labelIcon, constraints);
        constraints.gridy = 1;
        constraints.insets    = new Insets(0, 0, 0, 0);
        add(labelAuthor, constraints);
        constraints.gridy = 3;
        add(labelGroup, constraints);
        constraints.gridy = 4;
        add(labelFullName, constraints);
        constraints.gridy = 5;
        constraints.insets = new Insets(0, 0, 10, 0);
        add(labelGmail, constraints);
        constraints.gridy = 6;
        add(buttonBack, constraints);
    }
}
