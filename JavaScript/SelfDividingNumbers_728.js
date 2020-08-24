/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function (left, right) {
  let newArray = [];
  for (let i = left; i <= right; i++) {
    if (i < 10) {
      newArray.push(i);
      continue;
    }
    if (selfDeviding(i)) {
      newArray.push(i);
    }
  }
  return newArray;
};

var selfDeviding = function (num) {
  let numArray = [...num.toString()];
  for (i of numArray) {
    if (parseInt(i) === 0 || num % parseInt(i) !== 0) {
      return false;
    }
  }
  return true;
};
