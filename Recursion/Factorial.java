import java.util.*;

public class Factorial {
    
    public static void main(String args[]){

    int fact = 1;
    int no;

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no to find factorial: ");
    no = sc.nextInt();

    for(int i=1; i<=no; i++){

        fact = i * fact ;
    }
    System.out.println("Factoril= "+ fact);

    sc.close();

    }
}
