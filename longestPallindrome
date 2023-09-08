class Solution {
    public String longestPalindrome(String s) {
        
        String largestPalindrome = String.valueOf(s.charAt(0));
        
        if (s.equals(new StringBuilder().append(s).reverse().toString())) {
            return s;
        }
        for (int i=0; i< s.length(); i++) {
            for (int j=i+1; j< s.length(); j++) {
                String str1 = s.substring(i,j+1);
                StringBuilder strb = new StringBuilder();
                strb.append(str1);
                String str2 = strb.reverse().toString();
                if (str1.equals(str2)) {
                    if (str1.length() > largestPalindrome.length()) {
                        largestPalindrome = str1;
                    }
                }
            }
        }
        return largestPalindrome;
    }
}
