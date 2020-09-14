var longestPalindrome = function (s) {
    if (s.length === 0) return ''
    let max_left = 0
    let max_size = 1
    for (let i = 0; i < s.length - 1; i++) {
        let left = i
        let right = i
        // expand right if there are two identical letters
        while (left >= 0 && right < s.length - 1 && s[left] === s[right + 1])
            right += 1;

        // expand window until it stops matching
        while (left >= 0 && right < s.length && s[left] === s[right]) {
            if (right + 1 - left > max_size) {
                max_left = left
                max_size = right + 1 - left
            }
            left -= 1;
            right += 1;
        }
    }

    return s.substring(max_left, max_left + max_size);

}