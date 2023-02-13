package basic;

public class LoopsCodelabs06 {

    /**
     * Create a merge function that merges two arrays into one.
     * The merge function must mix the elements like a zipper
     * E.G. merge({1,2,3}{1,2,3}) -> {1,1,2,2,3,3}
     * <p>
     * If both arrays are of a different length return an empty array
     */
    public static int[] merge(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return new int[0];
        }

        int[] result = new int[array1.length * 2];

        for (int i = 0; i < result.length; i += 2) {
            result[i] = array1[i / 2];
            result[i + 1] = array2[i / 2];
        }
        return result;
    }
}
