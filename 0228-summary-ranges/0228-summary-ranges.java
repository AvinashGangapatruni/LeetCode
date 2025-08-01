class Solution {
    public List<String> summaryRanges(int[] nums) {
       List<String> result = new ArrayList<>();
       int i = 0, n = nums.length;
       while(i < n){
        int start = nums[i];
        while(i+1 < n && nums[i+1] == nums[i]+1){
            i++;
        }
        if(start == nums[i]){
            result.add(String.valueOf(start));
        }
        else{
            result.add(start + "->" + nums[i]);
        }
        i++;
       } 
       return result;
    }
}