/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function (n) {
  let nums = [...n.toString()];
  let p = 1;
  let s = 0;

  for (i of nums) {
    p *= parseInt(i);
    s += parseInt(i);
  }

  console.log(p);
  console.log(s);

  return p - s;
};
