class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxneg = Integer.MIN_VALUE;
        int maxval = 0;
        for(int num : nums){
            if(num < 0){
                maxneg = Math.max(maxneg,num);
            }
            else if(set.contains(num)){
                continue;
            }
            else{
                maxval += num;
                set.add(num);
            }
        }
        return set.isEmpty() ? maxneg : maxval;
    }
}