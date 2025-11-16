def solution(seoul):
    answer = 0;
    for index, element in enumerate(seoul):
        if element == "Kim":
            answer = index
    return f'김서방은 {answer}에 있다'