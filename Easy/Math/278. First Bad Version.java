//binary search
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans =0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(isBadVersion(mid)){ //if true
                ans = mid;
                e = mid-1;  //there might be bad versions before mid
            }
            else{
                s = mid+1;  //there will be bad versions ahead
            }
        }
        return ans;
    }
}
