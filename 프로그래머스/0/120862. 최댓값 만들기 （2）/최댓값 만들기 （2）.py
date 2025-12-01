def solution(numbers):
    numbers.sort()
    compare1 = numbers[0] * numbers[1]
    compare2 = numbers[len(numbers) - 1] * numbers[len(numbers) - 2]
    return compare1 if compare1 > compare2 else compare2