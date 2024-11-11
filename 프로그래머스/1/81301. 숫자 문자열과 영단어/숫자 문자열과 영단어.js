function solution(s) {
    compareNum.map((i)=>
      s= s.replaceAll(i.english,i.number));
    return parseInt(s);
}

const compareNum= [
    {number:0,english:'zero'},
    {number:1,english:'one'},
    {number:2,english:'two'},
    {number:3,english:'three'},
    {number:4,english:'four'},
    {number:5,english:'five'},
    {number:6,english:'six'},
    {number:7,english:'seven'},
    {number:8,english:'eight'},
    {number:9,english:'nine'}
]