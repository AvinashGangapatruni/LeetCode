class Solution {
    public int findComplement(int num) {
        int complement = 0;
        int tempNum = num;
        int bitValue = 1;

        while (tempNum > 0) {
            int currentBit = tempNum % 2;
            if (currentBit == 0) 
            {
                complement += bitValue;
            }
            tempNum /= 2;
            bitValue *= 2;
        }

        return complement;
    }
}
