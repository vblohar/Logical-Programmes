function countTrue(arr) {
  let count = arr.filter((r) => r == true).length;

  return count;
}
arr = [true, true, false, true];
console.log(countTrue(arr));
