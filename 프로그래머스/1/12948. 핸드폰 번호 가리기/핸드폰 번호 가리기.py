def solution(phone_number):
    replaceStr = len(phone_number) - 4
    length = "*"* len(phone_number[:replaceStr])
    return length + phone_number[replaceStr:]