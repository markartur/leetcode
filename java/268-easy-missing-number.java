/* Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array. */

class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int number: nums){
            set.add(number);
        }
        
        for(int x = 0; x<=nums.length;x++){
            if(!set.contains(x)){
                return x;
            }
        }
        
        return 0;
    }
}