public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        String newStr = s.toLowerCase().replaceAll("[^a-z0-9]","");
        return isPalindromeUtil(newStr, 0, newStr.length() - 1);
    }

    static boolean isPalindromeUtil(String s, int start, int end){
        if(start == end || start > end){
            return true;
        }

        if(s.charAt(start) == s.charAt(end)){
            return isPalindromeUtil(s, start + 1, end - 1);
        }
        return false;
    }
}
