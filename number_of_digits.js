function numberOfDigits(num) {
  let a = num;
  if (num < 0) {
    a = -num;
  }

  var count = 0;
  if (a >= 0) {
    count++;
  }

  while (a / 10 >= 1) {
    a /= 10;

    count++;
  }
  return count;
}
console.log(numberOfDigits(0));
