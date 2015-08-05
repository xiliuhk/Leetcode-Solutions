public class Solution {
    public int largestRectangleArea(int[] height) {
        int maxRect = 0; 
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 0; i <= height.length; i++){
            while (!stk.isEmpty() && (i == height.length || height[i] < height[stk.peek()])){
                maxRect = Math.max(maxRect, height[stk.pop()]*(stk.isEmpty()?i:(i-stk.peek()-1))); 
            }
            stk.push(i); 
        }
        return maxRect; 
    }
}