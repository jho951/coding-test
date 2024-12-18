function solution(rny_string) {
    return [...rny_string].map(str => str.replace('m','rn')).join('');
}