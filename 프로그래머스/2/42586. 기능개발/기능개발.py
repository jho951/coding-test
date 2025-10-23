def solution(progresses, speeds):
    # 각 작업의 완료까지 걸리는 '일수' 계산
    # (100 - p) 를 s로 올림 나눗셈: ceil((100 - p) / s)
    days = [ (100 - p + s - 1) // s for p, s in zip(progresses, speeds) ]

    answer = []
    current = days[0]   # 현재 배포 기준일(맨 앞 작업의 완료일)
    cnt = 1             # 같은 날 함께 배포되는 작업 수

    for d in days[1:]:
        if d <= current:
            # 기준일보다 빨리(또는 같은 날) 끝나는 작업은 같이 배포
            cnt += 1
        else:
            # 기준일보다 늦게 끝나는 작업이 나오면 이전 배포 묶음을 종료
            answer.append(cnt)
            current = d
            cnt = 1

    answer.append(cnt)  # 마지막 묶음 추가
    return answer
