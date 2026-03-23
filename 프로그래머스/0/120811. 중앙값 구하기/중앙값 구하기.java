import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i<array.length; i++) {
            Arrays.sort(array);
            answer = array.length / 2;
        }
        return array[answer];
    }
}