class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
         List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        findCombination(nums,0,ans, new ArrayList<>());
        return ans;
    }
    
    public void findCombination(int[] nums, int idx,List<List<Integer>> ans, ArrayList<Integer> ds ){
       
        // if(idx>=nums.length){
            ans.add(new ArrayList<>(ds));
            // return;
        // }
        
        for(int i=idx;i<nums.length;i++){
            if(i>idx&&nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            findCombination(nums,i+1,ans,ds);
            ds.remove(ds.size()-1);
            // findCombination(nums,i+1,ans, ds);
        }
    }
}