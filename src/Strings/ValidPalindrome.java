package Strings;

public class ValidPalindrome {
    public static boolean isPalindrome(String str) {

        String fixed_string = "";
        for (char c: str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                fixed_string += c;
            }
        }
        fixed_string = fixed_string.toLowerCase();

        // set 2 pointers
        int start_ptr = 0;
        int end_ptr = fixed_string.length()-1;

        while (start_ptr<=end_ptr) {
            if (fixed_string.charAt(start_ptr) != fixed_string.charAt(end_ptr)) {
                return false;
            }
            start_ptr+=1;
            end_ptr-=1;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}
