function solution(st) {
    var answer = [];
    for(let i = 0; i<st.length; i++){
        answer.push(st.substring(i,st.length));
    };
    return answer.sort();
}