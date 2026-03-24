class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        int width = box[0];
        int depth = box[1];
        int height = box[2];
        
        int x = width / n;
        int y = depth / n;
        int z = height / n;
        
        
        return x * y * z;
    }
}