function solution(arr1, arr2) {
    var answer = 0;
    var compareSum1 = 0;
    var compareSum2 = 0;
    arr1.map(item => compareSum1 += item)
    arr2.map(item => compareSum2 += item)
    arr1.length > arr2.length ? answer = 1 : answer = -1
    if( arr1.length === arr2.length){
        if(compareSum1 > compareSum2){
            answer = 1
        } else if( compareSum1 < compareSum2 ){
            answer = -1
        } else {
            answer=0
        }
    }
    return answer
}