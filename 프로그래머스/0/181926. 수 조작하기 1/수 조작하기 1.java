class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char [] charArr = control.toCharArray();
        for(int i = 0; i<charArr.length; i++) {
            switch (charArr[i]) {
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }
}