class Solution {
    public int solution(String message) {
        int answer = 0;
        int [] arr = new int [message.length()];
        for(int i = 0; i<arr.length; i++) {
            answer++;
        }
        return answer * 2;
    }
}