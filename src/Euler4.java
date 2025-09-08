public class Euler4 {
    /*public static void main(String[] args){
        System.out.println(StringHelper.isPalindrome(1001));
        System.out.println(largestPalindromeOf3DigitNumbers());
    }*/

    /**
     *
     * @return
     */
    public int largestPalindromeOf3DigitNumbers(){
        int maxPalindrome = 0;
        for(int i=999; i>=500; i--){
            for(int x=999; x>=i; x--){
                if(StringHelper.isPalindrome(x*i) && x*i > maxPalindrome)
                    maxPalindrome = x*i;
            }
        }
        return maxPalindrome;
    }
}
