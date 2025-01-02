// function solution(id_pw, db) {
//     const isLogin = db.some((i) => i[0] === id_pw[0] && i[1] === id_pw[1]);
//     const isIdWrong =  db.some((i) => i[0] !== id_pw[0]);
//     const isPwdWrong =  db.some((i) => i[1] !== id_pw[1]); 
// }

function solution(id_pw, db) {
    let result = 'fail';
    db.forEach((i) => {
        if (i[0] === id_pw[0]) {
            if(i[1] === id_pw[1]){
                result = 'login';
            }else{
                result = 'wrong pw'; 
            }}
    });
    return result;
}