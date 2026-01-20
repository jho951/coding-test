def solution(babbling):
    baby = ["aya","ye","woo","ma"];
    answer = 0
    for str1 in babbling:
        for str2 in baby:
            str1 = str1.replace(str2," ")
        if str1.strip() == "":
            answer += 1
    return answer