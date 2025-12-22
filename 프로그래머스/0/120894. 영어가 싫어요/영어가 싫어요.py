def solution(numbers):
    num_list = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]

    for i, word in enumerate(num_list):
        numbers = numbers.replace(word, str(i))
        
    return int(numbers)