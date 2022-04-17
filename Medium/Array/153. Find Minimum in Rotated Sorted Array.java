//binary search
class Solution {
    public int findMin(int[] nums) {
        int prev = 0;
        int next = 0;
        int len = nums.length;
        int s=0;
        int e=nums.length-1;
        
        if(nums[0]<nums[len-1]) return nums[0];
        
        while(s<=e){
            int mid = s+(e-s)/2;
            
            prev = (mid-1+len)%len;   //underflow index
            next = (mid+1)%len; //overflow index
            
            if((nums[mid]<=nums[prev]) && (nums[mid]<=nums[next])) return nums[mid];    //mid is smallest
            
            if(nums[mid]<=nums[len-1]){ //right part is sorted, thus search in left part(unsorted)
                e = mid-1;
            }
            else if(nums[mid]>=nums[0]){    //left part is sorted, thus search in right part(unsorted)
                s = mid+1;
            }
        }
        return -1;  //stupid array
    }
}
