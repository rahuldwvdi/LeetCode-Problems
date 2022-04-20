class Solution {
    public boolean check(int[] nums) {
     int check=0;

        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]>nums[i+1])
               check++;

            if(check>1) return false;
        }

        return !(check==1 && nums[0]<nums[nums.length-1]);
    }
}
