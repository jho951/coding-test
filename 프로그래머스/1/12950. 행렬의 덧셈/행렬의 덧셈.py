def solution(arr1, arr2):
    answer = []
    for a, b in zip(arr1, arr2):
        row_result = []
        for c, d in zip(a, b):
            row_result.append(c + d)
        answer.append(row_result)
    return answer