import java.util.*;

public class AvgOfNumbers{
    public static void main(String args[]){

        System.out.println("Enter 3 Numbers: ");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = ( a + b + c) / 3;

        System.out.println("Average of Given Numbers: " + average);

        sc.close();

    }
}
