public class q2_unchecked {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {
            int a = 10;
            int b = 0;

          
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Runtime Exception Caught: " + e.getMessage());
        }

        System.out.println("Program Ended");
    }
}
