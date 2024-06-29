
//Name: Sumaya Axmed Xasan
//ID: C1220880

package chapter7;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,4,5,5};
        System.out.println(Arrays.toString(removeDuplicates(num)));

    }
    public static int[] removeDuplicates(int[] arr) {
        // Create a new array to store unique elements
        int[] result = new int[arr.length];

        // Keep track of the number of unique elements
        int uniqueCount = 0;

        // Iterate through the input array
        for (int num : arr) {
            // Check if the current element is already in the result array
            boolean isDuplicate = false;
            for (int i = 0; i < uniqueCount; i++) {
                if (result[i] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            // If the element is unique, add it to the result array
            if (!isDuplicate) {
                result[uniqueCount++] = num;
            }
        }

        // Create a new array with the correct size and copy the unique elements
        int[] finalResult = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }
        }
