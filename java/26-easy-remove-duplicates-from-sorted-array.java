class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;
        int tail = 0;
        for (int num: nums) {
            if (num != nums[tail])
                nums[++tail] = num;
        }
        return tail+1;
    }
}