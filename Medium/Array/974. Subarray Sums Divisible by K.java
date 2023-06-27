class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        /* //brute force -> solves but time complexity is very high
        int n = nums.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int a=i;a<=j;a++)   sum += nums[a];
                if(sum%k==0) count++;
            }
        }
        return count;
        */ 
    }
}
