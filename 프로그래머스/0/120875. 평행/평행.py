def solution(dots):
    # 점들을 변수에 할당 (가독성을 위해)
    a, b, c, d = dots
    
    # 3가지 경우의 수 체크
    # (a-b, c-d), (a-c, b-d), (a-d, b-c)
    if (a[1]-b[1])*(c[0]-d[0]) == (c[1]-d[1])*(a[0]-b[0]): return 1
    if (a[1]-c[1])*(b[0]-d[0]) == (b[1]-d[1])*(a[0]-c[0]): return 1
    if (a[1]-d[1])*(b[0]-c[0]) == (b[1]-c[1])*(a[0]-d[0]): return 1
    
    return 0