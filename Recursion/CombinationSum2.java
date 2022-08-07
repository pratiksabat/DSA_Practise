class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates,target,0,ans, new ArrayList<>());
        return ans;
    }
    
    public void findCombination(int[] candidates, int target, int idx,List<List<Integer>> ans, ArrayList<Integer> ds ){
        
        // if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            return;
            }
            // return;
        // }   
        
        for(int i=idx;i<candidates.length;i++){
            if(i>idx&& candidates[i]==candidates[i-1]) continue;
            if(candidates[idx]>target) break;
            
            ds.add(candidates[i]);
            findCombination(candidates,target-candidates[i],i+1,ans, ds);
            ds.remove(ds.size()-1);
        }
    }
}