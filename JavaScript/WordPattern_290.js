/**
 * @param {string} pattern
 * @param {string} str
 * @return {boolean}
 */
const wordPattern = (pattern, str) => {
  const pArray = pattern.split("");
  const sArray = str.split(" ");

  const map = new Map();

  if (pArray.length !== sArray.length || pattern === "" || str === "") {
    return false;
  }

  for (let i = 0; i < pArray.length; i++) {
    if (map.has(pArray[i])) {
      if (map.get(pArray[i]) != sArray[i]) {
        return false;
      }
    } else {
      if (findInMap(map, sArray[i])) {
        return false;
      }
      map.set(pArray[i], sArray[i]);
    }
  }

  return true;
};

const findInMap = (map, value) => {
  for (let v of map.values()) {
    if (v === value) {
      return true;
    }
  }
  return false;
};
