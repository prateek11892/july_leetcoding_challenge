// Add Binary

class Solution {
    public String addBinary(String a, String b) {
        int max = 0;
        String x = "";
        if(a.length() > b.length()){
            x = String.format("%0"+(a.length() - b.length())+"d",0);
            b = x + b;
        }
        else if(a.length() < b.length()){
            x = String.format("%0"+(b.length() - a.length())+"d",0);
            a = x + a;
        }
        int carry = 0;
        int d = 0;
        StringBuilder str = new StringBuilder("");
        for(int i = a.length() - 1; i >= 0; i--){
            int m  = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry;
            d = m % 2;
            carry = m / 2;
            str.insert(0,String.valueOf(d));
        }
        if(carry > 0){
            str.insert(0,String.valueOf(carry));
        }
        return str.toString();
    }
}