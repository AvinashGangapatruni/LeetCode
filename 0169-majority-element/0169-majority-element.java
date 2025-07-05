class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums)
        {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int n = nums.length;
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            if(entry.getValue() > n / 2)
            {
                return entry.getKey();
            }
        }
        return -1;
    }
}