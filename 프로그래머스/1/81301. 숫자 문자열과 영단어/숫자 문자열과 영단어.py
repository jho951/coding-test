def solution(s):

    compare_num = {
        "zero": "0",
        "one": "1",
        "two": "2",
        "three": "3",
        "four": "4",
        "five": "5",
        "six": "6",
        "seven": "7",
        "eight": "8",
        "nine": "9"
    }

    # 딕셔너리의 키(단어)를 순회하며 문자열 s 내의 단어를 숫자로 치환
    for word, digit in compare_num.items():
        s = s.replace(word, digit)

    # 최종 문자열을 정수로 변환하여 반환
    return int(s)