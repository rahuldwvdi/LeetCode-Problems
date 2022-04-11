class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i:nums){
            currsum += i;
            maxsum = Math.max(currsum, maxsum);
            if(currsum<0){  //if currsum goes below zero then it cannot contribute to maxsum var
                currsum = 0;
            }
        }
        return maxsum;
    }
}
