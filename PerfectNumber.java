public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println("6 is perfect: " + isPerfectNumber(6));        // true
        System.out.println("28 is perfect: " + isPerfectNumber(28));      // true
        System.out.println("5 is perfect: " + isPerfectNumber(5));        // false
        System.out.println("496 is perfect: " + isPerfectNumber(496));    // true
        System.out.println("8128 is perfect: " + isPerfectNumber(8128));  // true
        System.out.println("33550336 is perfect: " + isPerfectNumber(33550336));  // true
        System.out.println("-1 is perfect: " + isPerfectNumber(-1));      // false (invalid case)
    }
}
