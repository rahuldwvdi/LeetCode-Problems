class Solution {
    public int pivotIndex(int[] nums) {
        //sliding window
        int totalsum = 0;
        int leftsum = 0;
        for(int i:nums){
            totalsum += i;
        }
        for(int i=0;i<nums.length;i++){
            leftsum = leftsum + nums[i];
            if(leftsum==totalsum){
                return i;
            }
            else{
                totalsum = totalsum - nums[i];
            }
        }
        return -1;
    }
}
