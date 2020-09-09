/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
let twoSum = function (nums, target) {
    let numberIndex = {};
    let result = [];

    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        let complement = target - num;

        if (numberIndex[complement] !== undefined) {
            result[0] = numberIndex[complement];
            result[1] = i;

            return result;
        }

        numberIndex[num] = i;
    }

    return result;
};