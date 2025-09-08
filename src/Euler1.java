public class Euler1 {
    int sum = 0;

    public static void main(String[] args) {
        Euler1 euler = new Euler1();
        int result = euler.findMultiples();
        System.out.println(result);
    }

    public int findMultiples() {
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
