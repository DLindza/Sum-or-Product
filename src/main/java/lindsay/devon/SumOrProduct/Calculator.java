package lindsay.devon.SumOrProduct;

/**
 * Created by devonlindsay on 9/10/16.
 */
public class Calculator {
    int sum = 0;
    int product = 1;

    public int sum (int userNum) {
        for (int i = 1; i <= userNum; i++) {
            sum += i;
        }
        return sum;

    }

    public int product (int userNum) {
        for (int i = 1; i<= userNum; i++) {
            product *= i;
        }
        return product;
    }
}
