/**
 * @param {number[]} arr
 * @return {boolean}
 */
var uniqueOccurrences = function (arr) {
  let map = new Map();

  for (let num of arr) {
    if (map.has(num)) {
      map.set(num, map.get(num) + 1);
    } else {
      map.set(num, 1);
    }
  }

  let set = new Set();
  for (let val of map.values()) {
    if (set.has(val)) return false;

    set.add(val);
  }

  return true;
};
