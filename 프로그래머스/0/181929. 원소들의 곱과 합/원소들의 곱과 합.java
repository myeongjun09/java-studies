class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 1;
        int total = 0;
        for(int i = 0; i<num_list.length; i++) {
            sum *= num_list[i];
            total += num_list[i];
        }
        if(sum<total*total) {
                answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}