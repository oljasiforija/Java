// WRITE A FUNCTION THAT RETURNS WHETHER THE GIVEN ARRAY HAS A BALANCE POINT BETWEEN THE VALUES
// WHERE ONE SIDE IS EQUAL TO THE OTHER

function balancePoint(arr){
    let sum = 0;
    for(let i = 0; i<arr.length; i++){
        sum += arr[i];
    }
    let checkSum = 0;
    for(let i=0; i<arr.length; i++){
        checkSum += arr[i];
        if(checkSum == sum/2){
            return true;
        }
    }
    return false;
}
console.log(balancePoint([1,2,3,4,10])) // TRUE
// ---> 1+2+3+4 = 10     10 == 10 so balanced
console.log(balancePoint([1,2,3,2,1])) // FALSE
console.log(balancePoint([1,2,3,1,2,3,2,1])) // FALSE
console.log(balancePoint([2,2])) // TRUE

function balanceIndex(arr) {
    for(let i=0; i<arr.length; i++){
        let leftSum = 0;
        let rightSum = 0;
        for(let j=i+1; j < arr.length;j++){
            rightSum += arr[j];
        }
        for(let j = i - 1; j>= 0; j--){
            leftSum += arr[j]
        }
        if (leftSum == rightSum){
            return true;
        }
    }
    return false;
}

console.log(balanceIndex([-2,5,7,0,3]))  // TRUE
console.log(balanceIndex([9,9])) // FALSE
console.log(balanceIndex([4,2,2,6])) // TRUE
console.log(balanceIndex([9,1,9])) // TRUE
console.log(balanceIndex([1,8,1,2,3,4])) // TRUE