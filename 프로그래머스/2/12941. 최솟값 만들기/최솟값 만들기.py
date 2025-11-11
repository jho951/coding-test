def solution(A,B):
    answer = 0
    A.sort()
    B.sort(reverse = True)
    for num_a, num_b in zip(A, B):
        answer += (num_a * num_b)
    return answer