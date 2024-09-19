public class GreatestCommonDivisor {



    public static void main(String[] args) {

        // Test cases

        System.out.println(getGreatestCommonDivisor(25, 15));  // should return 5

        System.out.println(getGreatestCommonDivisor(12, 30));  // should return 6

        System.out.println(getGreatestCommonDivisor(9, 18));   // should return -1

        System.out.println(getGreatestCommonDivisor(81, 153)); // should return 9

    }



    // Method to find the greatest common divisor

    public static int getGreatestCommonDivisor(int first, int second) {

        // Check if either parameter is less than 10

        if (first < 10 || second < 10) {

            return -1;

        }



        // Find the minimum of the two numbers

        int min = Math.min(first, second);



        // Loop from the minimum down to 1

        for (int i = min; i >= 1; i--) {

            // Check if i is a divisor of both numbers

            if (first % i == 0 && second % i == 0) {

                return i;

            }

        }



        // If no common divisor found (should not happen with valid input)

        return -1;

    }

}

