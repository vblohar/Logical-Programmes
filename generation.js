function generation(x, y) {
  if (x == 0) {
    return "Me!";
  }

  if (x == 1) {
    if (y == "m") {
      return "Son";
    } else return "Daughter";
  }

  if (x === 2) {
    return y === "m" ? "grandson" : "granddaughter";
  }

  if (x === 3) {
    return y === "m" ? "great grandson" : "great granddaughter";
  }

  if (x === -1) {
    return y === "m" ? "father" : "mother";
  }

  if (x === -2) {
    return y === "m" ? "grandfather" : "grandmother";
  }

  if (x === -3) {
    return y === "m" ? "great grandfather" : "great grandmother";
  } else return "Enter a valid number";
}

console.log(generation(-1, "f"));
console.log(generation(0, "f"));
console.log(generation(1, "f"));
console.log(generation(2, "f"));
console.log(generation(-3, "f"));
console.log(generation(-2, "f"));
console.log(generation(3, "f"));
console.log(generation(6, "f"));
