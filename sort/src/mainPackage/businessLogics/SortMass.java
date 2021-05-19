package mainPackage.businessLogics;

import java.util.Comparator;

/**
 * Class for sorting array
 *
 * @author Константин
 * @version 1.0.0.2021
 */

public class SortMass {
    /**
     *
     * @param array array
     * @param comparator comparator
     *
     */
    /*
    method for sorting in ascending order
     */
    public static void sort(int[] array, Comparator<Integer> comparator) {
        int min = Integer.MAX_VALUE; //минимальное значение массива
        int max = Integer.MIN_VALUE; //максимальное значение массива
        for (int element : array)
        {
            if (element < min)
            {
                min = element;
            }
            if (element > max)
            {
                max = element;
            }
        }
        int[] buckets = new int[max - min + 1]; //вспомогательный массив
        for (int element : array)
        {
            buckets[element - min]++;
        }
        int arrayIndex = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int j = buckets[i]; j > 0; j--)
            {
                array[arrayIndex++] = i + min;
            }
        }
    }

    /**
     * method for sorting in descending order
     *
     * @param array array
     * @param comparator comporator
     */
    public static void sortDescending(int[] array, Comparator<Integer> comparator){

        int min = Integer.MAX_VALUE; //минимальный элемент массива
        int max = Integer.MIN_VALUE; //максимальный элемент массива
        for (int element : array)
        {
            if (element < min)
            {
                min = element;
            }
            if (element > max)
            {
                max = element;
            }
        }
        int[] buckets = new int[max - min + 1]; //вспомогательный массив
        for (int element : array)
        {
            buckets[element - min]++;
        }
        int arrayIndex = 0;
        for (int i = 0; i < buckets.length; i++)
        {
            for (int j = buckets[i]; j > 0; j--)
            {
                array[arrayIndex++] = i + min;
            }
        }

        for (int i = 0; i < buckets.length / 2; i++) {
          int temp = array[i];
          array[i] = array[buckets.length - 1 - i];
          array[buckets.length - 1 - i] = temp;
        }
    }
}
