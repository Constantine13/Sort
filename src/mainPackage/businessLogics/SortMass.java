package mainPackage.businessLogics;

import java.util.Comparator;

public class SortMass {


    public static void sort(int[] array, Comparator<Integer> comparator) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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
        int[] buckets = new int[max - min + 1];
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
    public static void sortDescending(int[] array, Comparator<Integer> comparator){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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
        int[] buckets = new int[max - min + 1];
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
