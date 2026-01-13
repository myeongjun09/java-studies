import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] temp = new int[arr.length];
        
        int index = 0;
        temp[index++] = arr[0];
        
        for(int i= 1; i<arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[index++] = arr[i];
            }
        }
        
        int[] answer = new int[index];
        for (int i = 0; i < index; i++) {
            answer[i] = temp[i];
        }
        return answer;
    }
}