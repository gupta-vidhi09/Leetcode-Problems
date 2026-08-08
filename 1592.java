class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for(char ch : text.toCharArray()){
            if(ch ==  ' '){
                spaces++;
            }
        }
        String[] words = text.trim().split("\\s+");
        if(words.length == 1){
            StringBuilder ans = new StringBuilder(words[0]);
            while(spaces-- >0){
                ans.append(" ");
            }
            return ans.toString();
        }
        int between = spaces/(words.length - 1);
        int end = spaces%(words.length - 1);
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            ans.append(words[i]);

            if(i != words.length - 1){
                for(int j = 0; j< between; j++){
                    ans.append(" ");
                }
            }
        }
        while(end-- >0){
            ans.append(" ");
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String text = in.hasNextLine() ? in.nextLine() : "";
        System.out.println(new Solution().reorderSpaces(text));
        in.close();
    }
}