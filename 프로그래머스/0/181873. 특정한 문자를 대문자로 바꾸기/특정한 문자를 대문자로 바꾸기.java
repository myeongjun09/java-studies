class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            if(String.valueOf(ch).equals(alp)) {
                answer += Character.toUpperCase(ch);
            } else {
                answer += ch;
            }
        }
        
        return answer;
    }
}