class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int iceamericano = 5500;
        int value = 0;
        int value2 = 0;
        
        value = money / iceamericano;
        value2 = money % iceamericano;
        
        answer[0] = value;
        answer[1] = value2;
        return answer;
    }
}