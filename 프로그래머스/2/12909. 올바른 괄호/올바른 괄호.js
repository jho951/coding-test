function solution(s){

    var a = 0;
    var b = 1;
    if(s[0] == ')'){
        return false;   
    }
    for(let i = 1; i< s.length; i++){
        if(s[i]  == ')'){
            a++;
        }else{
            b++;
        }
        if(a > b){
            return false;
        }
    }
    if(a == b){
        return true;
    }else{
        return false;
    }
}