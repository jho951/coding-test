def solution(binomial):
    compare = binomial.split(" ")
    if compare[1] == "+":
        return int(compare[0]) + int(compare[2])
    elif compare[1] == "-":
        return int(compare[0]) - int(compare[2])
    else:
        return int(compare[0]) * int(compare[2])
