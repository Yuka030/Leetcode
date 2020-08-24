/**
 * @param {number[][]} bookings
 * @param {number} n
 * @return {number[]}
 */
var corpFlightBookings = function (bookings, n) {
  let result = new Array(n).fill(0);

  for (elem of bookings) {
    result[elem[0] - 1] += elem[2];
    result[elem[1]] -= elem[2];
  }

  console.log(result);

  if (result.length > n) {
    result.splice(-1);
  }

  console.log(result);

  for (let i = 1; i <= result.length - 1; i++) {
    x = result[i] + result[i - 1];
    result[i] = x;
  }

  return result;
};
