// Task Scheduler

class Solution {
    public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0){
            return 0;
        }
        int m = tasks.length;
        int[] count = new int[26];
        
        for(char c: tasks){
            count[c - 'A'] ++;
        }
        
        Arrays.sort(count);
        
        int max = count[25] - 1;
        int idleSpaces = max * n;
        
        for(int i = 24; i >= 0; i--){
            idleSpaces -= Math.min(max, count[i]);
        }
        
        idleSpaces = Math.max(0, idleSpaces);
        return tasks.length + idleSpaces;
    }
}