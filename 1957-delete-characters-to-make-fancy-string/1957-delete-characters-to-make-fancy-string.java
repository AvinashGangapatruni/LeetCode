class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        int fancyCount = 1;
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                fancyCount++;
            }
            else{
                fancyCount = 1;
            }
            if(fancyCount > 2){
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}