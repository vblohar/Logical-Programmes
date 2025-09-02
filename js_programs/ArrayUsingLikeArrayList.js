// Define Array or Arraylist means JS does not have ArrayList concept.
let list = [];

// Add elements
list.push("Apple");
list.push("Orange");
list.push("Banana");

//access element using index number from array.
console.log(list[1]);
let list1 = list.at(0);
console.log(list1);

// Update element
list[2] = "Grapes";


// print in console area.
// console.log(list);

//delete element
list.splice(1, 1);
// leaves empty slot, not recommended 
// delete list[0];
console.log(list);
list.push("Flower");
console.log(list);

//delete last element
list.pop();
console.log(list);

//delete first element
list.shift();
console.log(list);

//add element at beginning
list.unshift("Flower");
console.log(list);

