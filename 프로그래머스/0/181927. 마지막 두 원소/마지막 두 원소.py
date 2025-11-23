def solution(num_list):
    last = num_list[len(num_list) - 1]
    compare= num_list[len(num_list) - 2]
    if last > compare:
        num_list.append(last - compare)
    else:
        num_list.append(last * 2)
    return num_list