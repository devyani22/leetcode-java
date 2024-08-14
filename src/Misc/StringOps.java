package Misc;

import java.util.HashSet;

public class StringOps {

    public static boolean containsDuplicate( int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num: nums) {
            if (seen.contains(num)) {
                System.out.println(seen);
                return true;
            }
            seen.add(num);
        }
    return false;
    }

    public static String reverseString(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i=str.length()-1; i>=0;i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }


    public static void main(String[] args) {
        String str = "abracadabra";

        System.out.println(reverseString(str));
    }
}
