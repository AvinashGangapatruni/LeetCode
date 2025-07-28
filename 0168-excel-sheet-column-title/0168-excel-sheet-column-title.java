class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            int rem = columnNumber % 26;
            s.insert(0, (char)(rem + 'A'));
            columnNumber /= 26;
        }
        return s.toString();
    }
}