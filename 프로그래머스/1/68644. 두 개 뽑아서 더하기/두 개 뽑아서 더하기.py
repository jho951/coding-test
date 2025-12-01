def solution(numbers):
    sums_set = set()
    n = len(numbers)

    for i in range(n):
        for j in range(i + 1, n):
            sums_set.add(numbers[i] + numbers[j])
            
    return sorted(list(sums_set))