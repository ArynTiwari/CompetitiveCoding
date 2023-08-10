function findSubstringsWithSameSumAndLength(s, pattern) {
    const n = s.length;
    const m = pattern.length;
    const targetSum = pattern.split('').reduce((acc, char) => acc + char.charCodeAt(0), 0);

    const result = [];

    for (let i = 0; i <= n - m; i++) {
        const subString = s.substring(i, i + m);
        const subStringSum = subString.split('').reduce((acc, char) => acc + char.charCodeAt(0), 0);
        
        if (subStringSum === targetSum) {
            result.push({ substring: subString, index: i });
        }
    }

    return result;
}

const S = "bacdaabaa";
const P = "aab";

const substrings = findSubstringsWithSameSumAndLength(S, P);
substrings.forEach(item => console.log(`Substring: ${item.substring}, Starting Index: ${item.index}`));
