package mainPackage.businessLogics;

import java.util.Comparator;

public class SortMass {


    public static void sort(int[] array, Comparator<Integer> comparator) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], min) > 0) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
    public static void sortDescending(int[] array){
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int max = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    pos = j;    // pos - индекс наименьшего элемента
                    max = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = max;    // меняем местами наименьший с array[i]
        }
    }
}
