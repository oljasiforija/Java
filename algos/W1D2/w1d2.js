// Binary Search

// Given a sorted array and a value, return whether
//  the array contains that value. Do not sequentially 
//  iterate the array. Instead 'divide and conquer'. 
//  Taking advantage of the fact that array is sorted. 


function binarySearch(arr, value){
    while(arr[Math.floor(arr.length/2)] != value){
        if(arr[Math.floor(arr.length/2)] < value){
            arr = arr.slice(Math.floor(arr.length/2)+1);
            console.log(arr);
        }
        else if(arr[Math.floor(arr.length/2)] > value){
            arr = arr.slice(0,Math.floor(arr.length/2));
            console.log(arr);
        }
        else if(arr.length <= 1){
            return false;
        }
    }
    return true;
}

function binarySearchRecursive(arr, target){
    var mid = Math.floor(arr.length/2);

    if (arr[mid] === target) {
        return true;
    }
    else if(arr.length === 1){
        return false;
    }

    if (arr[mid] < target){
        let newArr = arr.slice(mid + 1, arr.length + 1);
        return binarySearchRecursive(newArr, target);
    }
    else if (arr[mid] > target){
        let newArr2 = arr.slice(0, mid);
        return binarySearchRecursive(newArr2, target);
    } 

}

console.log(binarySearch([1,2,3,4,5,6,7,8,9,10], 9));
// ---> 1 2 3 4 5  |  6 7 8 9 10
// ---> 6 7  |  8 9 10
// ---> 8  [9]  10  (found)
 
console.log(binarySearchRecursive([1,2,3,4,5,6,7,8,9,10,12,13], 10))    //true
console.log(binarySearchRecursive([0, 2, 4, 6, 8, 10, 12, 14, 16], 9 ))    //false
console.log(binarySearchRecursive([0, 2, 4, 6, 8, 10, 12, 14, 16], 16 ))    //true
console.log(binarySearchRecursive([0, 2, 4, 6, 8, 12, 14, 16], 8 ))    //true
console.log(binarySearchRecursive([8], 8 ))   //true