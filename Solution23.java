// Single Number III

class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xor = 0;
        for(int i = 0;i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        
        int a = 1;
        for(int i = 1; i < 32; i++){
            if((xor & a) == a)
                break;
            a <<= 1;
        }
        
        int first = 0;
        int second = 0;
        
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & a) == a)
                first ^= nums[i];
            else
                second ^= nums[i];
        }
        return new int[]{first, second};
    }
}