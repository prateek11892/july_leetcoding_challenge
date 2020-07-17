// Top K Frequent Elements

class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int i:nums){
            counter.put(i, counter.getOrDefault(i,0) + 1);
        }
        
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> counter.get(n1) - counter.get(n2));
        
        for(int i : counter.keySet()){
            heap.add(i);
            if(heap.size() > k){
                heap.poll();
            }
        }
        int[] result = new int[k];
        for(int i = k-1; i >= 0; i--){
            result[i] = heap.poll();
        }
        return result;
    }
}