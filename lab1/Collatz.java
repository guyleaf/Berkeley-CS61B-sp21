/** Class that prints the Collatz sequence starting from a given number.
 *  @author Leaf Ying
 */
public class Collatz {

    /**
     * Implementation of <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">Collatz conjecture</a>
     * @param n current number in the Collatz sequence
     * @return next number in the Collatz sequence
     */
    public static int nextNumber(int n) {
        if (n % 2 == 1) {
            return 3 * n + 1;
        } else {
            return n / 2;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
