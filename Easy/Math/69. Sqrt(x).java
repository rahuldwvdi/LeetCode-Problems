//binary search
class Solution {
    public int mySqrt(int x) {
        double s=1;
        double e=x;
        if(x<2) return x;
        while(s<e){
            double mid = s+ (int)Math.floor((e-s)/2);
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                e = mid;
            }
            else if(mid*mid<x){
                s = mid+1;
            }
        }
        return (int)e-1;
    }
        
}
