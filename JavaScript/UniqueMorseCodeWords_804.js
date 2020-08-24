const code = [
  ".-",
  "-...",
  "-.-.",
  "-..",
  ".",
  "..-.",
  "--.",
  "....",
  "..",
  ".---",
  "-.-",
  ".-..",
  "--",
  "-.",
  "---",
  ".--.",
  "--.-",
  ".-.",
  "...",
  "-",
  "..-",
  "...-",
  ".--",
  "-..-",
  "-.--",
  "--..",
];

const getIndex = (char) => char.charCodeAt(0) - "a".charCodeAt(0);

var uniqueMorseRepresentations = function (words) {
  let codedArr = words.map(function (word) {
    let wordArr = word.split("");
    wordArr = wordArr.map((char) => code[getIndex(char)]).join("");
    return wordArr;
  });

  let morseSet = codedArr.reduce((set, cur) => set.add(cur), new Set());

  return morseSet.size;
};
