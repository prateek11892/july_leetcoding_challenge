// Subsets

class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList();    
        list.add(new ArrayList<Integer>());
        
        for(int num:nums){
            List<List<Integer>> newInner = new ArrayList();
            for(List<Integer> curr: list){
                newInner.add(new ArrayList<Integer>(curr){{add(num);}});
            }
            for(List<Integer> innerList: newInner){
                list.add(innerList);
            }
        }
        return list;
    }
}