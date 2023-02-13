package advanced;

public class LoopsCodelabs02 {

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     * Tip: "cat" and "dog" both have length 3...
     */
    public static boolean catDog(String textToAnalyze) {
        if (textToAnalyze.isEmpty()) {
            return false;
        }

        int catCounter = 0;
        int dogCounter = 0;

        for (int i = 0; i <= textToAnalyze.length() - 3; i++) {
            String sub = textToAnalyze.substring(i, i + 3);

            if (sub.equals("cat")) {
                catCounter++;
            }
            if (sub.equals("dog")) {
                dogCounter++;
            }

        }
        return catCounter == dogCounter;
    }

}
