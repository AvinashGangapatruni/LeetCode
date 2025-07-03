class Solution {
    public char kthCharacter(int k) {
        int word = 0;
        while(k > 1){
            k = k - nearest(k-1);
            word++;
        }
        return (char) ('a' + word);
    }
    int nearest(int num){
        int res = 1;
        while(res<<1 <= num){
            res = res<<1;
        }
        return res;
    }
}