class Solution {
    public String countAndSay(int n) {
        return countAndSayRec("1",n-1);
    }

    public String countAndSayRec(String input, int n){
        if(n == 0){
            return input;
        }
        String res = "";
        char cur = input.charAt(0);
        int count = 1;
        for(int i =1;i<input.length();i++){
            if(input.charAt(i) != cur ){
                res = res + count + cur;
                count = 1;
                cur = input.charAt(i);
            } else {
                count++;
            }
        }
        res = res + count + cur;


        return countAndSayRec(res, n-1);
    }
}