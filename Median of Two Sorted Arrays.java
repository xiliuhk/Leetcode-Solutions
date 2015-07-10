
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length; 
        int n = nums2.length; 
        if ((m+n)%2 != 0){
            return (double) findKth(nums1, nums2, (m + n)/2, 0, m-1, 0, n-1);
        }else{
            return (findKth(nums1, nums2, (m + n)/2, 0, m-1, 0, n-1)
                    + findKth(nums1, nums2, (m + n)/2 -1, 0, m-1, 0, n-1))*0.5; 
        }
    }
    
    public int findKth(int nums1[], int nums2[], int k, int s1, int e1, int s2, int e2){
        int len1 = e1 - s1 + 1;
        int len2 = e2 - s2 + 1;
        if (len1 == 0){
            return nums2[s2 + k];
        }
        if (len2 == 0){
            return nums1[s1 + k];
        }
        
        if (k == 0){
            return Math.min(nums1[s1], nums2[s2]);
        }
        
        int mid1 = len1 * k / (len1 + len2); 
        int mid2 = k - mid1 - 1; 
        
        mid1 = s1 + mid1; 
        mid2 = s2 + mid2; 
        
        if (nums1[mid1] > nums2[mid2]){
            k = k - (mid2- s2 + 1);
            e1 = mid1; 
            s2 = mid2 + 1; 
        }else{
            k = k - (mid1- s1 + 1);
            e2 = mid2; 
            s1 = mid1 + 1;
        }
        
        return findKth(nums1, nums2, k, s1, e1, s2, e2);
    }
}