package Strings;

public class ReverseWords {

    public static String reverseWords(String s) {

        String[] splitArr = s.split(" ");

        StringBuilder builder = new StringBuilder();
        for (String word: splitArr) {
            builder.append(new StringBuilder(word).reverse()).append(" ");
        }
        return builder.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        System.out.println(reverseWords(s));
    }
}
