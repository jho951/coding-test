def solution(sizes):
    max_long_side = 0
    max_short_side = 0

    for w, h in sizes:
        long_side = max(w, h)
        short_side = min(w, h)

        if long_side > max_long_side:
            max_long_side = long_side

        if short_side > max_short_side:
            max_short_side = short_side

    return max_long_side * max_short_side