function findMissingNumber(nums, n = nums.length) {
    let missingNumber = 0;
    nums.sort();
    for (let i = 1; i < n; i++) {
        if (nums[i - 1] !== i) {
            missingNumber = i;
            return missingNumber;
        }
    }
}

const numbers = [1, 6, 3, 5, 2, 7, 8]
console.log("Missing number is: ", findMissingNumber(numbers));
