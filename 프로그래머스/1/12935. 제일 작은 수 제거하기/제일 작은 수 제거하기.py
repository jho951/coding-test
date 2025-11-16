def solution(arr):
    if len(arr) == 1:
        return [-1]
    deleting = arr.index(min(arr))
    arr.pop(deleting)
    return arr