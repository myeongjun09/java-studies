class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] array = rsp.toCharArray();
        for(int i = 0; i< array.length; i ++){
            if(array[i] == '0'){
                array[i] = '5';
            } else if(array[i] == '2'){
                array[i] = '0';    
            } else if(array[i] == '5'){
                array[i] = '2';    
            }
        }

        for(int i = 0 ; i < array.length; i++){
            answer += array[i];
        }
        return answer;
    }
}