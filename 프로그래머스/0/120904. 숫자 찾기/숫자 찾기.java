class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int index = -1;
        int length = 0;
        while(num>0) {
            if(num%10==k) {
                index = length;
            }
            num /= 10;
            length++;
        }
         return answer = index==-1?index:length - index;
    }
}