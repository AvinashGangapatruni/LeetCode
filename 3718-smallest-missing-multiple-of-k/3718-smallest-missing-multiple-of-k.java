class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int mul = k;
        while(true){
            if(!set.contains(mul)){
                return mul;
            }
            mul += k;
        }
    }
}