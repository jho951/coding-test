function solution(people, limit) {
    var answer = 0;
    people.sort((a,b)=> a - b)        
    var i = 0;                         
    var j = people.length - 1;         
    while (i <= j) {
        if (people[i] + people[j] <= limit) {
            i++;                       
            j--;
        } else {
            j--;                       
        }
            answer++;                      
        }
    return answer;
}