import java.util.*;

public class BillofItems {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.println("Enetr cost of pen: ");
        float pen = sc.nextFloat();

        System.out.println("Enter cost of eraser: ");
        float eraser = sc.nextFloat();
        
        float total = pencil + pen + eraser;

        System.out.println("Total Bill of Items is: " + total);

        sc.close();
    }

}
