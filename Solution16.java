class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        if(n == -1){
            return 1.0/x;
        }
        double value = myPow(x,n/2);
        value *= value;
        if(n%2 == 0){
            return value;
        }
        else if(n > 0){
            return value*x;
        }
        else{
            return value/x;
        }
    }
}