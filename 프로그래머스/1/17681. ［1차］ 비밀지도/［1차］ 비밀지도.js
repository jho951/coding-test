function solution(n, arr1, arr2) {
    var result= [];

    for(let i = 0; i< arr1.length; i++){
        result.push(addStringsWithLeadingZeros(makeBinaryScale(arr1[i], n),makeBinaryScale(arr2[i], n)))
        for(let j = 0; j< result[i].length; j++){
            if(result[i][j] === '0'){
                result[i] = result[i].replace(result[i][j], ' ')
            }else{
                result[i] = result[i].replace(result[i][j], '#') 
            }
        }
    }
    return result
}

// 이진법 변경 함수
 function makeBinaryScale(num, n){
    var result = ""
    for(let i = 0; i < n; i++){
        if(num % 2 === 1){
         result+='1'
        }else{
         result+='0'
        }
        num = parseInt(num / 2)
    }
    return [...result].reverse().join("")
}

// 더하기 
function addStringsWithLeadingZeros(str1, str2) {
    let sum = Number(str1) + Number(str2);
    
    let sumStr = sum.toString();

    while (sumStr.length < str2.length) {
        sumStr = "0" + sumStr;
    }

    return sumStr;
}