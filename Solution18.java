// Course Schedule II

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            int[] requested = prerequisites[i];
            if(!graph.containsKey(requested[1])){ //keeping parent as key and child as value
                graph.put(requested[1], new ArrayList<>());
            }
            graph.get(requested[1]).add(requested[0]);
            indegree[requested[0]]++;
        }
        
        Queue<Integer> topoQueue = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                topoQueue.add(i);
            }
        }
        
        if(topoQueue.size() == 0){
            return new int[0];
        }
        int[] result = new int[numCourses];
        while(topoQueue.size() != 0){
            int val = topoQueue.poll();
            result[count] = val;
            count++;
            if(graph.get(val) == null){
                continue;
            }
            for(Integer next: graph.get(val)){
                indegree[next]--;
                if(indegree[next] == 0){
                    topoQueue.add(next);
                }
            }            
        }
        if(count == numCourses){
            return result;
        }
        return new int[0];
    }
}