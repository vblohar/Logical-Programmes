
function twoSum(nums, target){
    let numsLenght = nums.length;
    let newArray = [];
    for (let i = 0; i < numsLenght; i++) {
        for (let j = i+1; j < array.length; j++) {
            let indexSum = nums[i] + nums[j];
           if(indexSum === target){
            newArray.push(i);
            newArray.push(j);
            return newArray;
           }
            
        }
    }
    newArray.push("Please provide correct target");
    return newArray;
}
let array = [2,36,14,25]
console.log(twoSum(array, 50));