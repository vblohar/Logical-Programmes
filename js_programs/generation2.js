function generation(x, y) {
  const person = {
    "-3": { m: "great grandson", f: "great grandduaghter" },
    "-2": { m: "grandson", f: "grandduaghter" },
    "-1": { m: "son", f: "duaghter" },
    0: { m: "me!", f: "me!" },
    1: { m: "father", f: "mother" },
    2: { m: "grandfather", f: "grandmother" },
    3: { m: "great grandfather", f: "great grandmother" },
  };

  return person[x][y];
}
console.log(generation(0, "m"));
console.log(generation(-1, "m"));
console.log(generation(-2, "f"));
console.log(generation(-3, "m"));
console.log(generation(1, "f"));
console.log(generation(2, "m"));
