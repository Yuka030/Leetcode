/**
 * @param {number} x
 * @param {number} y
 * @return {number}
 */
var hammingDistance = function (x, y) {
  let binaryX = x.toString(2);
  let binaryY = y.toString(2);
  let length =
    binaryX.length > binaryY.length ? binaryX.length : binaryY.length;
  let sum = 0;

  let convertedX = binaryX.padStart(length, "0");
  let convertedY = binaryY.padStart(length, "0");

  for (let i = 0; i < length; i++) {
    if (convertedX.charAt(i) !== convertedY.charAt(i)) {
      sum++;
    }
  }

  return sum;
};
