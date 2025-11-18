def solution(slice, n):
    if int(n / slice) == n /slice:
        return n / slice
    else:
        return n // slice + 1