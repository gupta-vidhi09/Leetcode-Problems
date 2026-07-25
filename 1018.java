import java.util.*;

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
       List<Boolean> ans = new ArrayList<>();
       int reminder = 0;
       for(int bit : nums){
        reminder = (reminder*2 + bit) % 5;
        ans.add(reminder==0);
       } 
       return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter bits (0/1) separated by spaces:");
        String line = in.nextLine().trim();
        if (line.isEmpty()) {
            System.out.println("[]");
            in.close();
            return;
        }
        String[] parts = line.split("\\s+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        Solution sol = new Solution();
        List<Boolean> res = sol.prefixesDivBy5(nums);
        System.out.println(res);
        in.close();
    }
}