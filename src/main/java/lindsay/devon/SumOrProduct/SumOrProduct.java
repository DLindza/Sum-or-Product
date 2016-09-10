package lindsay.devon.SumOrProduct;

import java.util.Scanner;

/**
 * Created by devonlindsay on 9/10/16.
 */

/* Get input from user for number n and choice of SumOrProduct or Product
Create separate functions for SumOrProduct and Product
Compute for SumOrProduct/Product
Print final output to screen
*/

public class SumOrProduct {

    Display display;

    public void logicEngine() {
        display = new Display();
        int value1 = display.getUserInt();

        String userProcess = display.getUserString();

        userInputProcess(userProcess, value1);
    }

    public void userInputProcess (String userProcess, int value1) {

        Calculator calculator = new Calculator();

        if (userProcess.equals("add")) {
            display.displayMessage(calculator.sum(value1));
        } else {
            display.displayMessage(calculator.product(value1));
        }
    }
}
