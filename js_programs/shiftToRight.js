function shiftToRight(x, y) {
  let count = Math.floor(x / Math.pow(2, y));
  return count;
}
console.log(shiftToRight(4666, 6));
