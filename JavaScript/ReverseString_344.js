/**
 * @param {character[]} s
 * @return {void} Do not return anything, modify s in-place instead.
 */
var reverseString = function (s) {
  for (let i = 0, j = s.length - 1; i < j; i++, j--) {
    const x = s[i];
    const y = s[j];
    s[i] = y;
    s[j] = x;
  }
};

const reverseStringUtil = (s, start, end) => {
  if (start === end || start > end) {
    return;
  }
  temp = s[start];
  s[start] = s[end];
  s[end] = temp;
  reverseStringUtil(s, start + 1, end - 1);
};
