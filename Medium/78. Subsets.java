//bit manipulation
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerset = new ArrayList<>();
        int len = (int)Math.pow(2,nums.length);
        
        for(int i=0;i<len;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                if((i & (1<<j)) !=0 ){
                    temp.add(nums[j]);   
                }
            }
            powerset.add(temp);
        }
        return powerset;
    }
}

//iterative
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList());
        
        for(int num : nums){
            int n = res.size();
            for(int i=0;i<n;i++){
                List<Integer> temp = new ArrayList<>(res.get(i));
                temp.add(num);
                res.add(temp);
            }  
        }
        return res;
    }
}
