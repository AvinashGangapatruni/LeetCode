class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                ans.append(Character.toLowerCase(c));
            }
        }
        String firstStr = ans.toString();
        String secondStr = ans.reverse().toString();
        return firstStr.equals(secondStr);
    }
}