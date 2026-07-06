class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int left = 1;
        int right = x / 2;

        while(left <= right){
            int mid = left + (right - left) / 2;
            long square = (long) mid*mid;

            if(square == x){
                return mid;
            } else if(square < x){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return right;
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] tests = {0, 1, 2, 3, 4, 8, 9, 16, 2147395599};
        for (int t : tests) {
            System.out.println("mySqrt(" + t + ") = " + sol.mySqrt(t));
        }
    }
}