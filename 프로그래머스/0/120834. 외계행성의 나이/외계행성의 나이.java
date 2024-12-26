class Solution {
    public String solution(int age) {
        String stringAge= (age + "");
        stringAge = stringAge.replaceAll("0","a");
        stringAge = stringAge.replaceAll("1","b");
        stringAge = stringAge.replaceAll("2","c");
        stringAge = stringAge.replaceAll("3","d");
        stringAge =  stringAge.replaceAll("4","e");
        stringAge = stringAge.replaceAll("5","f");
        stringAge = stringAge.replaceAll("6","g");
        stringAge = stringAge.replaceAll("7","h");
        stringAge = stringAge.replaceAll("8","i");
        stringAge =  stringAge.replaceAll("9","j");
        return stringAge;
    }
}