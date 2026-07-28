class Solution {
    public int maxProduct(int[] nums) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= firstLargest){
                secondLargest = firstLargest;
                firstLargest = nums[i];
            }
            else if(nums[i] > secondLargest && nums[i] != firstLargest){
                secondLargest = nums[i];
            }
        }
        return (firstLargest - 1) * (secondLargest - 1);
    }
}