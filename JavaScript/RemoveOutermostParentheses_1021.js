/**
 * @param {string} S
 * @return {string}
 */
var removeOuterParentheses = function (S) {
  let curIndex = 0;
  let balance = 0;
  let newStr = "";

  for (let i = 0; i < S.length; i++) {
    if (S[i] === "(") {
      balance++;
      if (balance === 1) {
        curIndex = i;
      }
    } else if (S[i] === ")") {
      balance--;
    }

    if (balance === 0) {
      newStr += S.slice(curIndex + 1, i);
      curIndex = 0;
    }
  }

  return newStr;
};
