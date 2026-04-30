class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        for (int i = 1; answer <= n; i++) {
            answer *= i;
            count++;
        }
        return count-1;
    }
}