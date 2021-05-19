package mainPackage.window;

//import jdk.nashorn.internal.scripts.JO;
import mainPackage.businessLogics.SortMass;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Class for describing the main application window
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class MyFrame extends JFrame {

    /**array*/
    private static int[] array;
    /**sorted array*/
    private static int[] sortedArray;
    /**ascending comparator*/
    private Comparator<Integer> comparatorAscending;
    /**descending comparator*/
    private Comparator<Integer> comparatorDescending;

    /**text field*/
    private JTextField field;
    /**list of random numbers*/
    private JList<Integer> randomNum;
    /**button group*/
    private ButtonGroup rangeGroup;
    /**radiobutton for minimum point*/
    private JRadioButton min;
    /**radiobutton for average point*/
    private JRadioButton average;
    /**radiobutton for maximum point*/
    private JRadioButton max;
    /**list of sorted numbers*/
    private JList<Integer> sortNum;
    /**button group*/
    private ButtonGroup typeGroup;
    /**radiobutton for ascending sorting*/
    private JRadioButton ascending;
    /**radiobutton for descending sorting*/
    private JRadioButton descending;
    /**timer*/
    private JTextField timerField;

    /**
     * description of the main program window
     *
     * @param title title
     */

    public MyFrame(String title) {
        super(title);
        comparatorAscending = Comparator.reverseOrder();
        comparatorDescending = Integer::compare;
        setLayout(new GridLayout(1, 3));
        setSize(700, 500);
        add(randomNum());
        add(controlPanel());
        add(sortNum());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setJMenuBar(new MainMenu());

        setVisible(true);
    }

    //description of the field for displaying the non-sorted array
    private JComponent randomNum() {
        randomNum = new JList<>();
        JScrollPane scrollPane = new JScrollPane(randomNum, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        return scrollPane;
    }

    private JComponent controlPanel() {
        field = new JTextField();
//        JButton fillButton = new JButton("Заполнить массив");
        rangeGroup = new ButtonGroup();
        min = new JRadioButton("1000");
        average = new JRadioButton("10000");
        max = new JRadioButton("100000");
        rangeGroup.add(min);
        rangeGroup.add(average);
        rangeGroup.add(max);
//        JButton clearButton = new JButton("Очистить");
        typeGroup = new ButtonGroup();
        ascending = new JRadioButton("По возрастанию", true);
        descending = new JRadioButton("По убыванию", false);
        typeGroup.add(ascending);
        typeGroup.add(descending);
//        JButton sortButton = new JButton("Сортировать");
        timerField = new JTextField();
        timerField.setEnabled(false);
        timerField.setDisabledTextColor(Color.BLACK);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(11, 1));
        panel.add(field);
        panel.add(createFillButton());
        panel.add(min);
        panel.add(average);
        panel.add(max);
        panel.add(createClearButton());
        panel.add(ascending);
        panel.add(descending);
        panel.add(createSortButton());
        panel.add(createSaveButton());
        panel.add(timerField);
        return panel;
    }

    //description of the field for displaying the sorted array
    private JComponent sortNum() {
        sortNum = new JList<>();
        JScrollPane scrollPane
                = new JScrollPane(sortNum, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//        DefaultListModel<Integer> l = new DefaultListModel<>();
        return scrollPane;
    }

    //description of the operation of the clear button
    private JButton createClearButton() {
        JButton clearButton = new JButton("Очистить");
        clearButton.addActionListener(e -> {
            randomNum.setModel(new DefaultListModel<>());
        });
        return clearButton;
    }

    //description of the operation of the fill button
    private JButton createFillButton(){
        JButton fillButton = new JButton("Заполнить массив");
        fillButton.addActionListener(e -> {
            try{

                int size = Integer.parseInt(field.getText());

                array = new int[size];

                int range = 0;
                if(min.isSelected()) {
                    range = Integer.parseInt(min.getText());
                }else if(average.isSelected()){
                    range = Integer.parseInt(average.getText());
                }else
                    range = Integer.parseInt(max.getText());
                if(size > 100000)
                {
                    JOptionPane.showMessageDialog(this ,"Введите число в пределе от 0 до 100000");
                    return;
                }
                if(size == 0)
                {
                    JOptionPane.showMessageDialog(this, "Поле не должно быть пустым");
                    return;
                }
                for(int i = 0; i < array.length; i++){
                    array[i] = (int) (Math.random() * range);
                }
                DefaultListModel<Integer> model = new DefaultListModel<>();
                for(int n: array){
                    model.add(model.size(), n);
                }


                randomNum.setModel(model);

            }
             catch (NumberFormatException exception){
                JOptionPane.showMessageDialog(this,"Неверный формат данных");
             }



        });
        return fillButton;
    }

    //description of the operation of the sort button
    private JButton createSortButton(){
        JButton sortButton = new JButton("Сортировать");
        sortButton.addActionListener(e -> {
            sortedArray = Arrays.copyOf(array, array.length);
            long timer = System.currentTimeMillis();
            if(ascending.isSelected()){
            SortMass.sort(sortedArray, comparatorAscending);
            }else SortMass.sortDescending(sortedArray, comparatorDescending);
            long resultTimer = System.currentTimeMillis() - timer;  //установка таймера
            DefaultListModel<Integer> sortModel = new DefaultListModel<>();
            for (int n : sortedArray){
                sortModel.add(sortModel.size(),n);

            }
            timerField.setText("Time: " + (resultTimer / 1000.0) + " sec");
            sortNum.setModel(sortModel);
        });
        return sortButton;
    }

    //description of the operation of the save button
    private JButton createSaveButton(){
        JButton saveButton = new JButton("Сохранить");
        saveButton.addActionListener(e -> {

            try(FileWriter writer = new FileWriter("sort.txt", false)) {
                writer.write(Arrays.toString(getSortedArray()));
            }
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        });
        return saveButton;
    }


    /**
     * method to return array
     *
     * @return array
     */
    public static int[] getArray() {
        return array;
    }

    /**
     * method to return sorted array
     *
     * @return sortedArray
     */
    public static int[] getSortedArray() {
        return sortedArray;
    }
}


