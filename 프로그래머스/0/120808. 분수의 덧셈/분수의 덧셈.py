def solution(numer1, denom1, numer2, denom2):
    # 1. 분자 합 구하기 (통분)
    numer = numer1 * denom2 + numer2 * denom1
    # 2. 분모 곱 구하기
    denom = denom1 * denom2
    
    # 3. 최대공약수(GCD) 계산
    common = gcd(numer, denom)
    
    # 4. 약분하기 (Python에서 /는 실수를 반환하므로 //를 사용하여 정수 유지)
    # 5. 리턴값은 리스트 [] 또는 튜플 () 형태로 반환해야 합니다.
    return [numer // common, denom // common]

def gcd(a, b):
    while b != 0:
        temp = b
        b = a % b
        a = temp
    return a