def solution(a, b, n):
    
    total_new_cola = 0
    current_empty_bottles = n

    while current_empty_bottles >= a:
        
        new_cola_received = (current_empty_bottles // a) * b
        
        remaining_empty_bottles = current_empty_bottles % a
        
        total_new_cola += new_cola_received
        
        current_empty_bottles = remaining_empty_bottles + new_cola_received
        
    return total_new_cola