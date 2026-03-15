class Solution {
    public int solution(int a, int b) {
        int num = 2 * a * b;
        String str = a + "" + b;
        int answer = 0;

        if(num > (Integer.parseInt(str))) {
            answer = num;
            return answer;
        } else {
            answer = Integer.parseInt(str);
            return answer;
        }
    }
}