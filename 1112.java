import java.util.Arrays;

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n];
        int left = 0;
        for(int i=0; i<arr2.length; i++){
            for(int j=0; j<n; j++){
                if(arr2[i]== arr1[j]){
                    result[left]=arr1[j];
                    left++;
                }
            }
        }
        int[] remaining = new int[n];
        int k =0;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                remaining[k] = arr1[i];
                k++;
            }
        }
        Arrays.sort(remaining, 0, k);
        for (int i = 0; i < k; i++) {
            result[left] = remaining[i];
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};
        int[] result = new Solution().relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
}