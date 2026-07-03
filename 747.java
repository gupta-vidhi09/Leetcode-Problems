class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int secondmax = -1;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secondmax = max;
                max = nums[i];
                index = i;
            } else if(nums[i]>secondmax){
                secondmax=nums[i];
            }
        }
        return max >= 2 * secondmax ? index : -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 0, 3};
        int[] nums3 = {1, 2, 3, 4};

        System.out.println("Test 1: " + solution.dominantIndex(nums1));
        System.out.println("Test 2: " + solution.dominantIndex(nums2));
        System.out.println("Test 3: " + solution.dominantIndex(nums3));
    }
}