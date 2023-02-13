package advanced;

import java.util.Arrays;

public class ArraysCodelab04 {

    public static void main(String[] args) {
        int[] numbers1 = {1, 8, 1};
        int[] numbers2 = {2, 4, 6};
        System.out.println(Arrays.toString(getLargestSum(numbers1, numbers2)));
    }

    /**
     * Start with 2 int arrays, a and b, each length 3.
     * Consider the sum of the values in each array.
     * Return the array which has the largest sum.
     * In event of a tie, return a.
     * getLargestSum([1, 2, 2], [3, 4, 2]) → [3, 4, 2]
     * getLargestSum([1, 3, 4], [1, 1, 2]) → [1, 3, 4]
     * getLargestSum([1, 1, 5], [1, 2, 5]) → [1, 2, 5]
     */
    public static int[] getLargestSum(int[] firstArray, int[] secondArray) {
        int sum1 = 0;
        int sum2 = 0;

        for(int number : firstArray){
            sum1 += number;
        }
        for(int number : secondArray){
            sum2 += number;
        }

        if(sum2 > sum1){
            return secondArray;
        }
        return firstArray;
    }

}
