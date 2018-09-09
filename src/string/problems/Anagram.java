package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        char[] chars = a.toCharArray();
        for (char ch : chars) {
            int index = b.indexOf(ch);
            if (index != -1) {
                b = b.substring(0, index) + b.substring(index + 1, b.length());
            } else {
                return false;
            }
        }
        return b.isEmpty();
    }


    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


        System.out.println(isAnagram("cat","tac"));


    }
}
