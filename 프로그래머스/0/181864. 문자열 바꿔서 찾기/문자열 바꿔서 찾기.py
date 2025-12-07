def solution(myString, pat):
    # 1. 문자열 변환 (A <-> B 스왑)
    # str.maketrans("원본 문자들", "대응할 문자들")을 사용하여 변환 테이블 생성
    # "AB"에 있는 A는 "BA"의 B로, "AB"에 있는 B는 "BA"의 A로 매핑됩니다.
    translation_table = str.maketrans("AB", "BA")
    
    # translate() 메서드를 사용하여 변환을 적용합니다.
    transformed_string = myString.translate(translation_table)
    
    # 2. 포함 확인 및 결과 반환
    # 변환된 문자열(transformed_string) 안에 pat이 부분 문자열로 있는지 확인합니다.
    if pat in transformed_string:
        return 1
    else:
        return 0