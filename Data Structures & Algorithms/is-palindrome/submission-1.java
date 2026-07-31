class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            char charI = s.charAt(i);
            char charJ = s.charAt(j);
            
            if (!AlphabetOrNum(charI)) i++;
            else if (!AlphabetOrNum(charJ)) j--;
             
            else {
                if (Character.toLowerCase(charI) != Character.toLowerCase(charJ)) return false;
                i++; j--;
            }
        }
        return true;
    }
    
    // Your helper method works perfectly! 
    public boolean AlphabetOrNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9' );
    }
}