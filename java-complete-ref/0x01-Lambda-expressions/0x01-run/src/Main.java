import HALF_OF_A_RECTANGLE.HALF_OF_A_RECTANGLE;

public class Main {

    public static void main(String[] args) {

        /** 4. Let's make a functional interface that can help
         * us with a method we can implement with a lambda
         * expression to write out a half rectangle
         *
         * The code for a half rectangle is provided without no
         * explanation here
         *
         */

         HALF_OF_A_RECTANGLE rectangle;
         rectangle = (lengthOfRectangle,
         widthOfRectangle,
         brickToUse) -> {

         int row = lengthOfRectangle;
         int line = widthOfRectangle;
         for (row = 1; row <= 5; row++) {
         for (line = 1; line <= 6 - row; line++) {
         System.out.print("#");
         }
         System.out.println();
         }
         };

         // We now create/output our rectangle on the screen
         int lengthOfRectangle = 5;
         int widthOfRectangle = 5;
         String brickToUse = "#";
         rectangle.build(lengthOfRectangle, widthOfRectangle, brickToUse);


        /** 3. A lambda expression that takes two parameters
         // I can also use the NumericTest2 interface to test
         // two parameters on certain conditions
         NumericTest2 isGreater;
         // I will now implement the `isGreater` reference
         // to check which is greater between two parameters
         int num1 = 12;
         int num2 = 10;
         isGreater = (a, b) -> a > b;
         if (isGreater.test(num1, num2)) System.out.println("Yes, '" + num1 + "' is greater than '" +
         num2 + "'");
         if (isGreater.test(num2, num1)) System.out.println("Yes, '" + num2 + "' is greater than '" +
         num1 + "'");
         *
         */


        /** 2. Lambda expression that takes a parameter
         // I can use the interface `NumericTest`'s method test
         // to test for an integer number and check an
         // information about it then return a report
         NumericTest isEven;

         isEven = (n) -> { return n % 2 == 0;};
         System.out.println(isEven.test(10));
         if (isEven.test(4)) System.out.println("Yes, 4 is even");
         if (!isEven.test(5)) System.out.println("No, it is not even");
         *
         */


        /** 1. `MyNum` Interface:
         // I have a reference to a functional interface
         MyNum myNum;

         // I can use a lambda expression to
         // 'implement the method of the
         // functional interface'.
         //
         // Now the lambda expression creates an anonymous class
         // that implement the method and return the value to `myNum`
         myNum = () -> 123.45;

         System.out.println(myNum.getValue());
         *
         */

    }
}
