import java.util.*;
class Main{
    public static void main(String[] args){
        int arr[] = {11,44,22,55};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}