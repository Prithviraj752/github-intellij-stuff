package PracticeStuff;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.*;
public class function1 {
    public static int calculatesum (int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculatesum(a,b);
        System.out.println("sum of 2 numbers is : "+ sum);
    }
}
