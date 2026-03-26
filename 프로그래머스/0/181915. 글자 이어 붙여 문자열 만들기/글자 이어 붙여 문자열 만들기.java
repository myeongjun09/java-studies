import java.util.Arrays;
class Solution {
    public StringBuilder solution(String my_string, int[] index_list) {
        StringBuilder answer = new StringBuilder();
        char [] ch = my_string.toCharArray();
        int index = 0;
        for(int i = 0; i<index_list.length; i++) {
            answer.append(my_string.charAt(index_list[i]));
        }
        return answer;
    }
}