class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int num = 0;
        int temp = x;
        
        while(temp > 0) {
            num += temp % 10;
            temp /= 10;
        }
        
        if(x % num ==0) {
            answer = answer;
        } else {
            answer = !answer;
        }
        return answer;
    }
}