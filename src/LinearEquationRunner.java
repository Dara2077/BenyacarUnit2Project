import java.util.Scanner;
import java.text.DecimalFormat;

public class LinearEquationRunner {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        String strx1 = coord1.substring(1, 2);
        String stry1 = coord1.substring(4, 5);
        String strx2 = coord2.substring(1, 2);
        String stry2 = coord2.substring(4, 5);
        int x1 = Integer.parseInt(strx1);
        int y1 = Integer.parseInt(stry1);
        int x2 = Integer.parseInt(strx2);
        int y2 = Integer.parseInt(stry2);
        if (x1 == x2){
            System.out.println( "These points are on a vertical line: x= " + x1);
            return;
        }
        LinearEquation myLinEqu = new LinearEquation (x1, y1, x2, y2);
        System.out.println("Enter a value for x: ");
        double xInput = scan.nextDouble();
        myLinEqu.coordinateForX(xInput);
    }
}
