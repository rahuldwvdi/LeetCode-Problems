class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        /* 
        //brute force -> 38/73 test case passed, TC O(n3)
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int a=i;a<=j;a++)   sum += nums[a];
                if(sum%k==0) count++;
            }
        }
        return count;
        //prefix sum approach -> 69/73 test case passed, TC O(n2)
        for(int i=0;i<n;i++){
            int presum = 0;
            for(int j=i;j<n;j++){
                presum += nums[j];
                if(presum%k==0) count++;
            }
        }
        return count;
        */
        */ 
    }
}
