//binary-search

class Solution {
    public int search(int[] nums, int target) {
        int res = bsearch(nums, target, 0, nums.length-1);
        return res;
    }
    public int bsearch(int[] nums, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(target==nums[mid]){
            return mid;
        }
        if(nums[start]<=nums[mid]){ //array is sorted from start to mid
            if(target<=nums[mid] && target>=nums[start]){
                return bsearch(nums, target, start, mid-1);
            }
            else{
                return bsearch(nums, target, mid+1, end);
            }
        }
        if(target>=nums[mid] && target<=nums[end]){ //if element lies in second half
            return bsearch(nums, target, start+1, end);
        }
        return bsearch(nums, target, start, end-1);
    }
    
}
