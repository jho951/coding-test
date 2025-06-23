// function solution(video_len, pos, op_start, op_end, commands) {
//     var compareR="" ;
//     if( SplitNumber(video_len) - SplitNumber(pos) < 10 ){
//        compareR= video_len;
//     }else if(SplitNumber(pos) - 10 < 0){
//          compareR= "00:00"
//     }
//     // 현재 위치
//     compareR = SplitNumber(op_start) <= SplitNumber(pos) && SplitNumber(pos) <= SplitNumber(op_end)? op_end : pos
//     var temp= compareR.split(":")
//     // 명령어 이동 계산
//     var commandLength = 0;
//     commands.forEach((item) => {
//       item === "next"? commandLength += 1 : commandLength -= 1;
//     });  
    
//     // 이동할 시간이 60초가 넘어가면
//     if(commandLength > 6){
//         temp[0] = Number(temp[0])+ Math.trunc(commandLength / 6)
//         commandLength %= 6
//     }
//     // 초가 60초가 넘어가면
//     if(Number(temp[1]) + commandLength * 10 >= 60){
//         temp[0] = Number(temp[0]) + Math.trunc((Number(temp[1]) + commandLength * 10) / 60)
//         temp[1] = (Number(temp[1]) + commandLength * 10) %  60
//     }else{
//         temp[1] = Number(temp[1]) + commandLength * 10
//     }
    
//    var aaa = SplitNumber(op_start) <= SplitNumber(ChangeTime(temp)) && SplitNumber(ChangeTime  (temp)) <= SplitNumber(op_end)? op_end : ChangeTime(temp)
//    console.log(aaa)
//     if(SplitNumber(aaa) >=  SplitNumber(video_len)){
//         aaa = video_len
//     }else if(SplitNumber(aaa) <= 0){
//         aaa = "00:00"
//     }
//     // 결과 값 반환
//     return aaa
// }




// // 숫자형으로 변환함수
// function SplitNumber(num){
//     num= num.split(":")
//     return Number(num[0]) * 100 + Number(num[1]);
// }

// // 시간형으로 변환
// function ChangeTime(num){
//     if(String(num[0]).length === 1){
//      num[0] = String(num[0]).padStart(2, '0');
//     }
//     if(String(num[1]).length === 1){
//      num[1] = String(num[1]).padStart(2, '0');
//     }
//     return num.join(":")
// }

function solution(video_len, pos, op_start, op_end, commands) {
    let cur_s = convertToSec(pos)
    const end_s = convertToSec(video_len)

    if(is_inside_op(cur_s, op_start, op_end)){
        cur_s = convertToSec(op_end)
    }

    commands.forEach(command=>{
        if(command === 'next'){
            cur_s = next(cur_s, end_s)
        }else{
            cur_s = prev(cur_s, end_s)
        }
        if(is_inside_op(cur_s, op_start, op_end)){
           cur_s = convertToSec(op_end)
        }
    })


    return convertToFormatString(cur_s);
}

function next(cur_sec, end_sec){
    const result = cur_sec + 10

    if(result >= end_sec){
        return end_sec
    }
    return result
}

function prev(cur_sec){
    const result = cur_sec - 10
    if(result < 0){
        return 0
    }
    return result
}

function is_inside_op(cur_sec, op_start, op_end){
    const ops = convertToSec(op_start)
    const opend = convertToSec(op_end)
    return ops<= cur_sec && cur_sec <= opend
}

function convertToSec(formatString){
    const [m,s] = formatString.split(':').map(Number)

    return 60*m+s
}

function convertToFormatString(sec){
    const m = String(Math.floor(sec / 60)).padStart(2,"0")
    const s = String(sec % 60).padStart(2,"0")

    return m + ':' + s
}

