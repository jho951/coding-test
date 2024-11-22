import java.util.*;


public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result="";
        String[] arr = a.split(""); 
        for(int i=0; i< arr.length; i++){
            if(arr[i].equals(arr[i].toUpperCase())){
               arr[i]= arr[i].toLowerCase();
            }else{
               arr[i]= arr[i].toUpperCase();
            }
            result+=arr[i];
        }
        System.out.println(result);
    }
}