// Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int len = s.length()-1;
        Stack<String> stack = new Stack<>();
        int j = 0;
        while(j <= len){
            while(i <= len && s.charAt(i) == ' '){
                i++;
            }
            if(i > len){
                break;
            }
            j = i;
            while(j <= len && s.charAt(j) != ' '){
                j++;
            }        
            System.out.println(s.substring(i,j));
            stack.push(s.substring(i,j));
            i = j;
        }
        StringBuilder str = new StringBuilder();
        while(stack.size()!=0){
            str.append(stack.pop()+" ");
        }
        return str.toString().trim();
    }
}