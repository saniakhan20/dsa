class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /*int[] a=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        a[i]=nums1[i];
        for(int i=0;i<nums2.length;i++)
        a[i+nums1.length]=nums2[i];
        Arrays.sort(a);
        if(a.length%2!=0) {double s=a[a.length/2]; return s;}
        else 
        {double s=(a[a.length/2]+a[(a.length/2)-1])/2.0;
        return s;}*/
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1); // ensure A is smaller
        }
        
        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        
        while (low <= high) {
            int partitionA = (low + high) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;
            
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : nums1[partitionA];
            
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : nums2[partitionB];
            
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) 
                if ((m + n) % 2 == 0) 
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                 else 
                    return Math.max(maxLeftA, maxLeftB);
                
            else if (maxLeftA > minRightB) 
                high = partitionA - 1;
            else 
                low = partitionA + 1; 
        }
        throw new IllegalArgumentException("Input arrays are not sorted");
    }
}