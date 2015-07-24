public class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, ret = 0; 
        
        while (left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax){
                ret += leftMax - height[left];
                left++;
            }else{
                ret += rightMax - height[right];
                right--; 
            }
        }
        return ret; 
    }
}