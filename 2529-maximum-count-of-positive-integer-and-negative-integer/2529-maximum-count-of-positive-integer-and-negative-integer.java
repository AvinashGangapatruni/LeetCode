class Solution {
    public int maximumCount(int[] nums) {
        int positivecount = 0;
        int negativecount = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0){
            continue;
            }
            else if(nums[i] > 0){
            positivecount++;
            }
            else{
            negativecount++;
            }
        }
        if(positivecount > negativecount){
            return positivecount;
            }
            else{
            return negativecount;
            }
    }
}