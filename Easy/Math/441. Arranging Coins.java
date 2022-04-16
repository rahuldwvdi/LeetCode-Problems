//naive-approach
class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return n;
        long sum = 0;
        int count =0;
        for(int i=1;i<n;i++){
            sum = sum + i;
            if(sum<=n){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
