class Solution {
    public int solution(String binomial) {

        String [] new_binomial = binomial.split(" ");
        int a = Integer.parseInt(new_binomial[0]);
        String ch = new_binomial[1];
        int b = Integer.parseInt(new_binomial[2]);

        switch(ch) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            default : return 0;
        }
    }
}