/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
function checkNode(node, min, max) {
    if (!node) {
        return true
    }
    if ((min !== null && node.val <= min) || (max !== null && node.val >= max)) {

        return false
    }

    return checkNode(node.left, min, node.val) && checkNode(node.right, node.val, max)
}

var isValidBST = function (root) {
    return checkNode(root, null, null)

};