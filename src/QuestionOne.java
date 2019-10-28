public class QuestionOne {

    // two strings are anagram checker function

    //Time Complexity: O(n)
    //Space Complexity: O(1)
    static Boolean areAnagram(String firstStr, String secondStr) {
        // If two strings have different length
        if (firstStr.length() != secondStr.length()) {
            return false;
        }

        int result = 0;
        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();

        for (int i = 0; i < firstStr.length(); i++) {
            result = result ^ (int) firstStr.charAt(i);
            result = result ^ (int) secondStr.charAt(i);
        }

        return result == 0;

    }

}
