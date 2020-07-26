// Add Digits

class Solution {
    public int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        int sum = 0;
        int digits = (int)Math.floor(Math.log10(num)+1);
        if(digits == 1){
            return num;
        }
        while(digits != 1){
            sum = 0;
            int n = num;
            while(n != 0){
                int rem = n % 10;
                sum+=rem;
                n = n / 10;
            }
            digits = (int)Math.floor(Math.log10(sum)+1);
            num = sum;
        }
        return sum;
    }
}