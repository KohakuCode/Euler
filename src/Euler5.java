public class Euler5 {
    /**
     * Checks if a given number is evenly divisible by all integers from 1 to 20
     * @param testnumber The number to check
     * @return {@code true} if the number is evenly divisible by all integers in the range, {@code false} otherwise.
     */
        private boolean isEvenlyDivisible(int testnumber){
            for(int i=11; i<=20; i++){
                if(testnumber % i != 0){
                    return false;
                }
            }
            return true;
        }

    /**
     * Finds the smallest positive number that is evenly divisible by all numbers from 1 to 20
     * @return The smallest multiple
     */

    public int getSmallestMultiple(){
            int smallestDividant = 2520;
            while(true){
                if(isEvenlyDivisible(smallestDividant)) {
                    return smallestDividant;
                }
                smallestDividant += 2520;
            }
        }
}