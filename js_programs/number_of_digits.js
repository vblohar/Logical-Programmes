function numberOfDigits(num) {
  let n = Math.abs(num);

  var count = 0;
  if (n >= 0) {
    count++;
  }
  while (n / 10 >= 1) {
    n /= 10;
    count++;
  }
  return count;
}
console.log(numberOfDigits(26625632));
