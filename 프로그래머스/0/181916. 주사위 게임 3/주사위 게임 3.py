def solution(a, b, c, d):
    nums = [a, b, c, d]
    counts = {x: nums.count(x) for x in set(nums)}
    unique_nums = sorted(counts.keys(), key=lambda x: counts[x], reverse=True)
    
    # 1. 4개의 숫자가 모두 같을 때
    if len(counts) == 1:
        return 1111 * a
    
    # 2. 3개의 숫자가 같을 때
    if len(counts) == 2 and counts[unique_nums[0]] == 3:
        p, q = unique_nums[0], unique_nums[1]
        return (10 * p + q) ** 2
    
    # 3. 2개씩 두 쌍이 같을 때 (2+2)
    if len(counts) == 2 and counts[unique_nums[0]] == 2:
        p, q = unique_nums[0], unique_nums[1]
        return (p + q) * abs(p - q)
    
    # 4. 2개만 같고 나머지 두 숫자는 각각 다를 때 (2+1+1)
    if len(counts) == 3:
        # 2개인 숫자를 제외한 나머지 두 숫자의 곱
        p = unique_nums[0] # 빈도수가 2인 숫자
        others = [x for x in nums if x != p]
        return others[0] * others[1]
    
    # 5. 4개의 숫자가 모두 다를 때
    return min(nums)