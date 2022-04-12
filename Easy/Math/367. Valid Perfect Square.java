//brute force (10 test cases passed, not-accepted, tle)
class Solution {
    public boolean isPerfectSquare(int num) {
        int i=1;
        while(i*i<num){
            if(i*i<num){
                i++;
            }
        }
        if(i*i==num){
            return true;
        }
        return false;
    }
}


//binary search (accepted, O(nlogn))
class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 1;
        int e = num;
        while(s<=e){
            long mid = s+ (e-s)/2;
            if((int)(mid*mid)==num){
                return true;
            }
            else if((int)mid*mid<num){
                s = (int)mid+1;
            }
            else{
                e = (int)mid-1;
            }
        }
        return false;
    }
}
