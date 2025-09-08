public class Euler6 {
    /**
     * Finds the difference of the sum of squares and the square of the sum of the first 100 natural numbers
     * @return sumSquareDifference
     */
    public int sumSquareDifference() {
        return getSquareOfSum() - getSumOfSquares();
    }

    private int getSumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    private int getSquareOfSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum * sum;
    }


}
