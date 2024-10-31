// function solution(n, m, section) {
//     var answer = 0;
//     for(let i = 0; i< section.length; i++){
//         let temp = section[i] + m;  
//         for(let j = i + 1 ; j< section.length; j++){
//             if(section[j] < temp){
//                 section.splice(j,1);
//             }
//         }
//     }
//     return section.length
// }


function solution(n, m, section) {
    let answer = 0;
    let currentEnd = 0; 

    for (let i = 0; i < section.length; i++) {
        if (section[i] > currentEnd) {
            answer++;
            currentEnd = section[i] + m - 1;
        }
    }

    return answer;
}