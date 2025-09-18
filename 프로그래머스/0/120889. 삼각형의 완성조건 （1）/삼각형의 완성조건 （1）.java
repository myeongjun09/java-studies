class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int maxIndex = 0;
        int sumOfOtherTwo = 0;
        for(int i = 0; i<sides.length; i++) {
            if (sides[i] > max) {
                max = sides[i];
                maxIndex = i; 
            }      
        }
        for(int i = 0; i<sides.length; i++) {
            if(i != maxIndex) {
                sumOfOtherTwo += sides[i];
            }
        }
        if(sumOfOtherTwo > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}