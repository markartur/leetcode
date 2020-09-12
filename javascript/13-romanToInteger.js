var romanToInt = function (s) {
    let converter = {}
    converter['I'] = 1
    converter['V'] = 5
    converter['X'] = 10
    converter['L'] = 50
    converter['C'] = 100
    converter['D'] = 500
    converter['M'] = 1000

    let result = 0

    for (var i = 0; i < s.length; i++) {
        current = converter[s.charAt(i)];
        let next
        if (i + 1 < s.length) {
            next = converter[s.charAt(i + 1)]
        } else {
            next = 0
        }

        if (current >= next) {
            result += current
        } else {
            result -= current
        }

    }
    return result
}