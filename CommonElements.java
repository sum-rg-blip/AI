package chapter7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




    public class CommonElements {
        public static class CommonElementsFinder {

            public static List<Integer> findCommonElements(int[] array1, int[] array2) {
                Set<Integer> set1 = new HashSet<>();
                Set<Integer> set2 = new HashSet<>();

                // Add elements of array1 to set1
                for (int num : array1) {
                    set1.add(num);
                }

                // Add elements of array2 to set2
                for (int num : array2) {
                    set2.add(num);
                }

                // Find common elements
                set1.retainAll(set2);

                return new ArrayList<>(set1);
            }
            public static void main(String[] args) {
                int[] array1 = {3, 6, 5};
                int[] array2 = {6, 3, 4};
                List<Integer> commonElements = findCommonElements(array1, array2);
                System.out.println(commonElements); // Output: [2, 3]
            }
        }


    }


