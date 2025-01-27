// Reverse Bits

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for(int i = 0; i < 32; i++){
            result <<= 1;
            if((n&1) > 0){
                result++;
            }
            n = n >> 1;
        }
        return result;
    }
}