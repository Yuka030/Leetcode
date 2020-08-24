/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {
   return S.split('').filter(char => J.indexOf(char) !== -1).length;
};