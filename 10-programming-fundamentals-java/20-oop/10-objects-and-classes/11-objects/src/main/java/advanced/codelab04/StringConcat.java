package advanced.codelab04;

import java.util.StringJoiner;

public class StringConcat {

    public static void main(String[] args) {
        String[] lorem = {"Lorem", "ipsum", "dolor", "sit", "amet"};
        System.out.println(joinLorem(lorem));
        System.out.println(buildLorem(lorem));
    }

    /**
     * Implement the joinLorem method to make the test succeed.
     * Hints: Look up information on StringJoiner, then create an object and use it.
     */
    static String joinLorem(String[] wordsToJoin) {
        if (wordsToJoin.length == 0) {
            return null;
        }
        StringJoiner joiner = new StringJoiner(" ", "", ".");
        for (String word : wordsToJoin) {
            joiner.add(word);
        }
        return String.valueOf(joiner);
    }

    /**
     * Implement the buildLorem method to make the test succeed.
     * Hints: Look up information on StringBuilder, then create an object and use it.
     */
    static String buildLorem(String[] wordsToBuild) {
        return null;
    }

}
