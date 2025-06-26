class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int [strlist.length];
        int value = 0;
        for(int i = 0; i<strlist.length; i++) {
            for(int j = 0; j<strlist[i].length(); j++) {
                value = j+1;
            }
            answer[i] = value;
        }
        return answer;
    }
}