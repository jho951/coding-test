function solution(sizes) {
    var s=[]
    var e=[]
    var temp=[]
    for(let i=0; i< sizes.length; i++){
        temp.push(sizes[i].sort((a,b)=>b-a))
        s.push(temp[i][0])
        e.push(temp[i][1])
    }
    return Math.max(...s) *Math.max(...e)
}