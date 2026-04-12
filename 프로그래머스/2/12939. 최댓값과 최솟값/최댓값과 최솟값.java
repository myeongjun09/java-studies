class Solution {
    public String solution(String s) {
        String answer = "";
        String [] arr = s.split(" ");
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String a : arr) {
            int num = Integer.parseInt(a);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return min + " " + max;
    }
}