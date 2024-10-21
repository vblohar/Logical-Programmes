function countTrue(arr) {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i]) {
      count++;
    }
  }
  return count;
}

const arr = [true, false, false, true, false, true, true];
console.log(countTrue(arr));
