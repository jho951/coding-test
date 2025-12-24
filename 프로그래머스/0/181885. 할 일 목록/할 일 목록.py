def solution(todo_list, finished):
    answer = []
    for num1, num2 in zip(todo_list, finished):
        if num2 == False:
            answer.append(num1)
    return answer