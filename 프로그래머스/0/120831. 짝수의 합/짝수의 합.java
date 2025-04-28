class Solution {
    public int solution(int n) {
        
        int zzak = 0;
        for (int i=2; i<=n; i++) {
            if (i%2==0)
                zzak+=i;          
        }
        return zzak;
    }
}