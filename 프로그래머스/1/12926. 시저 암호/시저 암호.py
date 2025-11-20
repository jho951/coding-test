def solution(s, n):
    result = []
    for char in s:
        if char == ' ':
            result.append(' ')
            continue
            
        if 'a' <= char <= 'z':
            start = ord('a')
        else:
            start = ord('A')
            
        shifted_index = ord(char) - start
        new_index = (shifted_index + n) % 26
        new_char_code = start + new_index
        
        result.append(chr(new_char_code))
            
    return "".join(result)