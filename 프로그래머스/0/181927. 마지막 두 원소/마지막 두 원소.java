class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int [] answer = new int[n+1];
        
        for(int i = 0; i<n; i++) {
            answer[i] = num_list[i];
        }
        
        int num = num_list[n - 1];
        int num1 = num_list[n - 2];
        
        if(num > num1) {
            answer[n] = num - num1;
        } else {
            answer[n] = num * 2;
        }
        return answer;
    }
}