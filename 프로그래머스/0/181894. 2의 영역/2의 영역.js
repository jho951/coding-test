function solution(arr) {
    var first2 = arr.indexOf(2);
    var last2 = arr.lastIndexOf(2);
    return first2 === -1? [-1] : arr.slice(first2, last2 + 1);
}