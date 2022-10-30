
//Importing scanner function
import java.util.Scanner;
import java.text.DecimalFormat;

public class LinearEquationRunner {
    public static void main(String args[]){
        //Scanner object
        Scanner scan = new Scanner(System.in);

        //Welcome user
        System.out.println("Welcome!");

        //Get user input
        System.out.print("Enter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        //Change user input into ints
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

        //Test if two points entered are on vertical line
        if (x1 == x2){
            System.out.println( "These points are on a vertical line: x = " + x1);
            return;
        }

        //Creates linear equation object
        LinearEquation myLinEqu = new LinearEquation (x1, y1, x2, y2);

        //Prints lin equ info
        System.out.println(myLinEqu.lineInfo());
        System.out.println();

        //Takes input of x value from user
        System.out.print("Enter a value for x: ");
        double xInput = scan.nextDouble();
        System.out.println();

        //Prints the coordinate of the x value in the eq
        System.out.println("The point on the line is: " + myLinEqu.coordinateForX(xInput));
    }
}
