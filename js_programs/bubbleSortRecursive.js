function bubbleSort(arr, n = arr.length){
    if(n ===1 ) return arr;

    for (let i = 0; i < n-1; i++) {
        if(arr[i] > arr[i+1]){
            [arr[i], arr[i+1]] = [arr[i+1], arr[i]]
        }
        
    }

   return bubbleSort(arr, n-1);
}

const nums = [1,25,12,4,3,6,87,52]
console.log("Original: " + nums);
console.log("Sorted Array: ", bubbleSort(nums));

