import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
            if(num==0){
                list.add(0);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] arr1 = {1, 0, 2, 3, 0, 4, 5, 0};
        solution.duplicateZeros(arr1);
        System.out.println("Test case 1: " + Arrays.toString(arr1));
        
        int[] arr2 = {1, 2, 3};
        solution.duplicateZeros(arr2);
        System.out.println("Test case 2: " + Arrays.toString(arr2));
       
        int[] arr3 = {0, 0, 1};
        solution.duplicateZeros(arr3);
        System.out.println("Test case 3: " + Arrays.toString(arr3));
    }
}