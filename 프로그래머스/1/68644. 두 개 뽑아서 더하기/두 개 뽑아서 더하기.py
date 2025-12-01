def solution(numbers):
    sums_set = set()
    n = len(numbers)

    for i in range(n):
        for j in range(i + 1, n):
            current_sum = numbers[i] + numbers[j]
            sums_set.add(current_sum)
    answer = sorted(list(sums_set))
    return answer