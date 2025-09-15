function solution(n, control) {
    return control.split('').reduce((answer, sumCount) => {
        switch (sumCount) {
            case 'w':
                return answer + 1;
            case 's':
                return answer - 1;
            case 'd':
                return answer + 10;
            case 'a':
                return answer - 10;
            default:
                return answer;
        }
    }, n);
}