class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = "";
        String str2 = "";
        str += Integer.toString(a)+b;
        str2 += Integer.toString(b)+a;
        
        if(Integer.parseInt(str) > Integer.parseInt(str2) || Integer.parseInt(str) == Integer.parseInt(str2)) {
            answer = Integer.parseInt(str);
        } else {
            answer = Integer.parseInt(str2);
        }
        return answer;
    }
}