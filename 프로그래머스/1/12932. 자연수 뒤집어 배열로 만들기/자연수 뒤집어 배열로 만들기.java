class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String [] st = sb.toString().split("");
        int [] answer = new int[st.length];

        for(int i = 0; i<st.length; i++) {
            answer[i] = Integer.parseInt(st[i]);
        }
        return answer;
    }
}