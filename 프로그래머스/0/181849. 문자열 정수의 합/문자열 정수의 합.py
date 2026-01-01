def solution(num_str):
    answer = 0
    for num in [int(i) for i in num_str]:
        answer += num
    return answer