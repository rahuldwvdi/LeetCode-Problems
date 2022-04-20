class Solution {
    //binary search
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = first(nums,target);
        res[1] = last(nums, target);
        return res;
    }
    public int first(int[] nums, int target){
        int index = -1;
        int s= 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                index = mid;
                e = mid-1;
            }
            else if(target<nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return index;
    }
    public int last(int[] nums, int target){
        int index = -1;
        int s= 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]==target){
                index = mid;
                s = mid+1;
            }
            else if(target<nums[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        return index;
    }
}
