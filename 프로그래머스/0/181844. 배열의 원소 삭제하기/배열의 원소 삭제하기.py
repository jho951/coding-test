def solution(arr, delete_list):
    answer = []
    for num1 in arr:
        if not num1 in delete_list:
            answer.append(num1)
    return answer