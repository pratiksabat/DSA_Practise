class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(candidates,0,target,ans, new ArrayList<>());
        return ans;
    }
    
    public void findCombination(int[] candidates,int idx, int target,List<List<Integer>> ans, ArrayList<Integer> list){
        
        if(idx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        if(candidates[idx]<=target){
            list.add(candidates[idx]);
            findCombination(candidates,idx,target-candidates[idx],ans, list);
            list.remove(list.size()-1);
        }
        findCombination(candidates,idx+1,target,ans, list);
    }
}