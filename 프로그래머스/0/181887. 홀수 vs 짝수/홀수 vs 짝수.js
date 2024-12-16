function solution(num_list) {
    var odd=0;
    var even=0;
    var answer = 0;
    num_list.map((item,index)=>{
        if(index%2===0){
          odd += item 
        }else{
          even += item
        }
    }
)
    return Math.max(odd, even)
}