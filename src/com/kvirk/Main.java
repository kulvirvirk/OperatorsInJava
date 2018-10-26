package com.kvirk;

public class Main {

    public static void main(String[] args) {
        //Note: It has a right to left associativity.
        // So, if you have some calculation on right that will be done first
        // and the value will be assigned to the variable.
        System.out.println("Assignment operator example:");


        int result = 1;
        result = 2 + result;
        System.out.println("New result = " + result);
        System.out.println("-----------------------\n");
        //============================================

        /*Reminder operator or Modulo operator
         * displays the reminder*/
        System.out.println("Assignment Reminder operator or Modulo operator example:");
        int someNumber = 10;
        int remainderResult;
        remainderResult = someNumber % 4;
        System.out.println("Remainder is: " + remainderResult);
        System.out.println("-----------------------\n");
        //============================================

        /*Shortcut to add 1 or subtract 1
         * very useful in loops
         * We can use ++ and --*/
        //use of ++, see exmaple below; we are adding 1 using ++
        System.out.println("++ operator example:");

        int someNumber1 = 5;
        System.out.println("Adding 1 to " + someNumber1);
        someNumber1++;
        System.out.println("New value is " + someNumber1);
        System.out.println("-----------------------\n");
        //============================================

        // use of --, see exmaple below; we are subtracting 1 using --
        System.out.println("-- operator example:");

        int someNumber2 = 5;
        System.out.println("Subtracting 1 from " + someNumber2);
        someNumber2--;
        System.out.println("New value is " + someNumber2);
        System.out.println("-----------------------\n");
        //============================================

        // use of conditional operator, see exmaple below
        // we are  using a == comparision operator to compare the logic in if-else statement
        // note: == is for comparision; = is for assignment
        System.out.println("Logical operator example (== is comparision operator)");
        Boolean isTrue = true;
        if(isTrue == true){
            System.out.println("True");
        }
        System.out.println("-----------------------\n");
        //============================================

        // we are  using a && comparision operator to compare the logic in if-else statement
        // note:
        System.out.println("Logical operator example (&& operator)");
        int someNumber3 = 5;
        int someNumber4 = 10;
        if(someNumber3 < someNumber4 && someNumber3 > 4 ){
            System.out.println("Comparision works!");
        }
        System.out.println("-----------------------\n");
        //============================================


    }
}
