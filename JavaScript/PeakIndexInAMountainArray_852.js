/**
 * @param {number[]} A
 * @return {number}
 */
var peakIndexInMountainArray = function (A) {
  let prevNum = A[0];
  for (let i = 1; i < A.length; i++) {
    if (A[i] < prevNum) {
      return i - 1;
    }
    prevNum = A[i];
  }

  return null;
};
