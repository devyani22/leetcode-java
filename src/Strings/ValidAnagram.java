package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s == null || t == null || s.length()!=t.length()) {
            return false;
        }
        int[] charCount = new int[26]; // Assuming the strings contain only lowercase letters

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagramSort(String s, String t) {

        if (s == null || t == null || s.length()!=t.length()) {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        Arrays.sort(sChars);
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }


    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();

        String s = "anagram";
        String t = "nagaram";
        System.out.println(validAnagram.isAnagram(s,t));
    }
}
