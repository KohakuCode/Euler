public class Euler5 {

    /**
     * Finds the smallest positive number that is evenly divisible by all numbers from 1 to 20
     *
     * @return The smallest multiple
     */
    public int getSmallestMultiple() {
        int smallestDividant = 2520;
        while (true) {
            if (isEvenlyDivisible(smallestDividant)) {
                return smallestDividant;
            }
            smallestDividant += 2520;
        }
    }

    private boolean isEvenlyDivisible(int testnumber) {
        for (int i = 11; i <= 20; i++) {
            if (testnumber % i != 0) {
                return false;
            }
        }
        return true;
    }
}