// Prison Cells After N Days

class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        Set<String> hashSet = new HashSet<>();
        int count = 0;
        boolean cyclePresent = false;
        for(int i = 0; i < N; i++){
            int[] next = findNext(cells);
            String cellString = stringify(next);
            if(hashSet.contains(cellString)){
                cyclePresent = true;
                break;
            }
            else{
                hashSet.add(cellString);
                count++;
            }
            cells = next;
        }
        if(!cyclePresent){
            return cells;
        }
        else{
            int val = N % count;
            for(int i = 0; i <val; i++){
                cells = findNext(cells);
            }
            return cells;
        }
        
    }
    
    public String stringify(int[] next){
        return Arrays.toString(next);
    }
    
    public int[] findNext(int[] cells){
        int[] values = new int[cells.length];
        for(int i = 1; i < cells.length - 1; i++){
            values[i] = (cells[i-1] == cells[i+1])? 1 :0 ;
        }
        return values;
    }
}