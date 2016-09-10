package lindsay.devon.SumOrProduct;
import java.util.Scanner;
/**
 * Created by devonlindsay on 9/10/16.
 */
public class Display {

    public int getUserInt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive whole number:  ");
        return scan.nextInt();
    }

    public String getUserString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to add or multiply?");
        return scanner.next();
    }
    public void displayMessage(int output) {
        System.out.println("Your answer is: " + output);
    }
}
