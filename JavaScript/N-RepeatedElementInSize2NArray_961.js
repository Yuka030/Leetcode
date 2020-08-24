/**
 * @param {number[]} A
 * @return {number}
 */
var repeatedNTimes = function (A) {
  return A.find((cur, index, array) => array.indexOf(cur) !== index);
};
