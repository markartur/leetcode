class Solution {
    public int removeElement(int[] nums, int val) {
        int tail = 0;
        for (int num : nums) {
            if (num != val) {
                nums[tail] = num;
                tail++;
            }
        }
        return tail;
    }
}