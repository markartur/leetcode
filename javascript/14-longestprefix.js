var longestCommonPrefix = function (strs) {
    var result = ''
    var firstWord = strs[0]
    var char = ''
    var nextString = ''
    var nextChar = ''
    if (strs.length == 0) {
        return result
    }
    for (var x = 0; x < firstWord.length; x++) {
        char = firstWord.charAt(x)

        for (var y = 1; y < strs.length; y++) {
            nextString = strs[y]

            if (nextString.charAt(x) != char) {
                return result
            }
        }
        result += char
    }
    return result
}