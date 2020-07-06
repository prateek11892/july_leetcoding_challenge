// Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        int[] output = new int[digits.length + 1];
        output[0] = 0;
        for(int i = 0; i < digits.length ; i++){
            output[i+1] = digits[i];
        }
        output[output.length - 1] = output[output.length - 1] + 1;
        int k = output[output.length - 1] % 10;
        int carry = output[output.length - 1] / 10;
        output[output.length - 1] = k;
        if(carry == 0){
            return Arrays.copyOfRange(output, 1, output.length);
        }
        for(int i = output.length - 2; i >= 0 ; i--){
            if(carry > 0){
                output[i] = output[i] + carry;
                k = output[i] % 10;
                carry = output[i] / 10;
                output[i] = k;
            }
            else 
                break;
        }
        if(output[0] == 0){
            return Arrays.copyOfRange(output, 1, output.length);
        }
        else{
            return output;
        }
    }
}
