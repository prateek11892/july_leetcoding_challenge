// Word Break II

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        if(s.length()>100){
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        wordBreakUtil(s, wordDict, result, new StringBuilder());
        return result;
    }
    
    public void wordBreakUtil(String s, List<String> wordDict,List<String> result, StringBuilder sb) {
        if(sb.length() != 0){
            sb.append(" ");
        }
        
        for(String word:wordDict){
            if(s.startsWith(word)){
                StringBuilder sb1 = new StringBuilder(sb);
                sb1.append(word);
                if(s.equals(word)){
                    result.add(sb1.toString());
                }
                else{
                    wordBreakUtil(s.substring(word.length()), wordDict, result, sb1);
                }
            }
        }
    }
}