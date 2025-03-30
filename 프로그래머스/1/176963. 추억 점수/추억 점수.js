function solution(name, yearning, photo) {
    var answer = [];
    for(let i = 0; i < photo.length; i++){
        var number = 0;
        photo[i].filter((item)=>{
            name.map((list,index)=>{
                if(list === item){
                    number += yearning[index]
                }
            })
        })
        answer.push(number)
    }
    
    return answer;
}