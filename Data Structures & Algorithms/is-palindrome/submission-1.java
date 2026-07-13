class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char [] v1 = s.toCharArray();
        char[] reversed = new StringBuilder(new String(v1)).reverse().toString().toCharArray();
        if (Arrays.equals(v1, reversed)) return true;
    return false;
    }
   
}
