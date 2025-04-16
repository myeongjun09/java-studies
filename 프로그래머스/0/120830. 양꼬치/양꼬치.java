class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int a = n * 12000;
        int b = k * 2000;
        int pay = (n / 10) * 2000;
        return a + b - pay;


    }
}