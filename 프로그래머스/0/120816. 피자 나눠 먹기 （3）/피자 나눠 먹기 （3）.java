class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        while(n>0) {
            answer += 1;
            n = n-slice;
        }
        return answer;
        // 10n이 7slice로 자른 피자 한 조각을 먹을려면 result = 2
    }
}