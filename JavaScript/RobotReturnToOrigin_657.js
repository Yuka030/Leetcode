/**
 * @param {string} moves
 * @return {boolean}
 */
var judgeCircle = function (moves) {
  return (
    moves
      .split("")
      .reduce(
        (array, cur) => [
          array[0] + (cur === "U") - (cur === "D"),
          array[1] + (cur === "R") - (cur === "L"),
        ],
        [0, 0]
      )
      .join("") === "00"
  );
};
