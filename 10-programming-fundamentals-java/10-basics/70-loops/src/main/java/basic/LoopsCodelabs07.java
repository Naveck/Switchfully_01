package basic;

/**
 * Return a String containing x times (numberOfTimes) the provided String (textToRepeat)
 * numberOfTimes should be a positive number, if not, return text "Impossible text repeat"
 * textRepeatWhile(2, "M") → "MM"
 * textRepeatWhile(5, "Pew") → "PewPewPewPewPew"
 * textRepeatWhile(0, "Hello") → ""
 * textRepeatWhile(-1, "Non") → "Impossible text repeat"
 * In total, you'll have to implement this for 3 different methods,
 * each time using a different loop mechanism.
 */
public class LoopsCodelabs07 {

    /**
     * For this method, only use the WHILE-LOOP
     */
    public static String textRepeatWhile(int numberOfTimes, String textToRepeat) {
        if (numberOfTimes < 0) {
            return "Impossible text repeat";
        }
        int count = 0;
        String result = "";
        while (count < numberOfTimes) {
            result += textToRepeat;
            count++;
        }
        return result;
    }

    /**
     * For this method, only use the DO-WHILE-LOOP
     */
    public static String textRepeatDoWhile(int numberOfTimes, String textToRepeat) {
        if (numberOfTimes < 0) {
            return "Impossible text repeat";
        }
        if (numberOfTimes == 0) {
            return "";
        }
        int count = 0;
        String result = "";
        do {
            result += textToRepeat;
            count++;
        } while (count < numberOfTimes);
        return result;
    }

    /**
     * For this method, only use the FOR-LOOP
     */
    public static String textRepeatFor(int numberOfTimes, String textToRepeat) {
        if (numberOfTimes < 0) {
            return "Impossible text repeat";
        }
        String result = "";
        for (int i = 0; i < numberOfTimes; i++) {
            result += textToRepeat;
        }
        return result;
    }

}