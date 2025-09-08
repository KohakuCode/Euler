public class StringHelper {

    /**
     * Checks if a number is a palindrome
     * @param testnumber
     * @return
     */
    public static boolean isPalindrome(int testnumber){
        if (testnumber < 0)
            return false;

        String originalTestnumString = Integer.toString(testnumber);
        String reversedTestnumString = new StringBuilder(originalTestnumString).reverse().toString();
        return originalTestnumString.equals(reversedTestnumString);
    }
}
