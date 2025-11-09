def solution(s):
    numbers = [int(num_str) for num_str in s.split()]
    
    min_value = min(numbers)
    max_value = max(numbers)
    
    answer = f"{min_value} {max_value}"
    
    return answer