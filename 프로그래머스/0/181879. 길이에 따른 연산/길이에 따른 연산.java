class Solution {
    public int solution(int[] num_list) {
        int answer = 0, mul = 1, len = num_list.length;
        if(len >= 11) {
            for(int i = 0; i<num_list.length; i++) {
                answer+=num_list[i];
            }
        } else {
            for(int i = 0; i<num_list.length; i++) {
                mul *= num_list[i];
            }
            answer = mul;
        }
        
        return answer;
    }
}