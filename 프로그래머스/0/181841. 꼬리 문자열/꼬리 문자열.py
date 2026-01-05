def solution(str_list, ex):
    answer = ''
    for st in str_list:
        if st.find(ex) == -1:
            answer += st
    return answer