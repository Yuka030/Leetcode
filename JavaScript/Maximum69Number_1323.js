/**
 * @param {number} num
 * @return {number}
 */
var maximum69Number = function (num) {
  const number = num.toString();

  if (number.indexOf("6") === -1) {
    return num;
  }

  for (let i = 0; i < number; i++) {
    if (number.charAt(i) == "6") {
      return number.replace(number.charAt(i), "9");
    }
  }
};
