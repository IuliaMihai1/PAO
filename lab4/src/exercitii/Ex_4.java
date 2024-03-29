package exercitii;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to remove the duplicate elements of a given array and
 * return the new length of the array.
 */
public class Ex_4 {

    public static void main(String[] args) {
        int[] a = {10, 7, 10, 5, 3, 4, 6, 5};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        System.out.println(set.size());
        int[] b = new int[set.size()];
        int i = 0;
        for (Integer elem : set) {
            b[i] = elem;
            i++;
        }
        System.out.println(Arrays.toString(b));
    }
}
