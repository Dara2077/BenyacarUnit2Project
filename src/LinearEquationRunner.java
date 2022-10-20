import java.util.Scanner;
import java.text.DecimalFormat;

public class LinearEquationRunner {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();
        int parenth1a = coord1.indexOf("(");
        int parentha1b = coord1.indexOf(")");
        int comma1 = coord1.indexOf(",");
        int parenth2a = coord2.indexOf("(");
        int parentha2b = coord2.indexOf(")");
        int comma2 = coord2.indexOf(",");
        int x1 = Integer.parseInt(coord1.substring(parenth1a +1, comma1));
        int y1 = Integer.parseInt(coord1.substring(comma1 +2, parentha1b));
        int x2 = Integer.parseInt(coord2.substring(parenth2a +1, comma2));
        int y2 = Integer.parseInt(coord2.substring(comma2 +2, parentha2b));
        if (x1 == x2){
            System.out.println( "These points are on a vertical line: x= " + x1);
            return;
        }
        LinearEquation myLinEqu = new LinearEquation (x1, y1, x2, y2);
        System.out.println(myLinEqu.lineInfo());
        System.out.println();
        System.out.print("Enter a value for x: ");
        double xInput = scan.nextDouble();
        System.out.println();
        System.out.println("The point on the line is: " + myLinEqu.coordinateForX(xInput));
    }
}
