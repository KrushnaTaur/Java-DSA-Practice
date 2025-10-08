import java.util.*;

public class EvenOdd {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no: ");
        int number = sc.nextInt();

        if(isEven(number)){
            System.out.println("Even!!!");
        }else{
            System.out.println("Odd!!!");
        }

        sc.close();
    }

    public static boolean isEven(int number){

      // check even or not
        if(number % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
