def solution(n):
    n_count = bin(n).count('1')
    
    answer = n + 1
    
    # 3. 조건을 만족하는 수를 찾을 때까지 무한 반복합니다.
    while True:
        answer_count = bin(answer).count('1')
        if n_count == answer_count: 
            return answer
        
        answer += 1
# n 보다 큰 자연수
# n의 이진수의 1개수와 동일 1개수가 짝수면 11 
# 1,2 해당하는 수 중 가장 작은 수