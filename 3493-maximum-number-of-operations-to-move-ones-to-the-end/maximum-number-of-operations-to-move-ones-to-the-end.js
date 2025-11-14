/**
 * @param {string} s
 * @return {number}
 */
var maxOperations = function (s) {
    let n = s.length;
    let countseen = 0;
    let i = 0;
    let result = 0;
    while (i < n) {
        if (s[i] == '0') {
            result += countseen;
            while (i < n && s[i] == '0') {
                i++;
            }
        } else {
            countseen++;
            i++;
        }
    }

    return result;
};