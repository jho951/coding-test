function solution(date1, date2) {
    var answer = 0;
    const Date1 = new Date(date1[0], date1[1] - 1, date1[2]);
    const Date2 = new Date(date2[0], date2[1] - 1, date2[2]); 
    return  Date1 < Date2 ? 1 : 0
}