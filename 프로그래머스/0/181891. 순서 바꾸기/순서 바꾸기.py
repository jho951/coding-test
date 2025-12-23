def solution(num_list, n):
    answer = num_list[n:]
    for s in range(n):
        answer.append(num_list[s])
    return answer