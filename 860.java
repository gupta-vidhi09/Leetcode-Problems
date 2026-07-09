class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }
            else if(bill == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
            }
            else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] test1 = {5,5,5,10,20};
        int[] test2 = {5,5,10,10,20};
        System.out.println(sol.lemonadeChange(test1)); // expected: true
        System.out.println(sol.lemonadeChange(test2)); // expected: false
    }
}