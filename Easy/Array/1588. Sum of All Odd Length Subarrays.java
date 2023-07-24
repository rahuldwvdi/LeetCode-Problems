class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        //brute force
        int sum =0;
        for(int i=0;i<arr.length;i++)//for outer indexing, start
        {
            for(int j=i;j<arr.length;j++)//end
            {
                for(int k=i;k<=j;k++){
                    if((j-i+1)%2!=0){
                        sum += arr[k];
                    }
                }
            }

        }
        return sum;   
    }
}
