// Ugly Number II

class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = 1; i < n; i++){
            res[i] = Math.min(Math.min(res[a]*2, res[b]*3), res[c]*5);
            if(res[a]*2 == res[i])
                a++;
            if(res[b]*3 == res[i])
                b++;
            if(res[c]*5 == res[i])
                c++;
        }
        return res[n-1];
    }
}