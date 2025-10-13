package com.dongnnp;

import com.dongnnp.mathutil.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
 public static void main(String[] args) {
     testFactorialGivenValidArgumentReturnsWell();
     testFactorialGivenWrongArgMinus5ThrowException();
 }
    //TEST CASE #1: CHECK/VERIFY getFactorial() method with valid parameter
    //e.g.n = 0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n = 0
    //2. Call/invoke getFactorial(n = 0) method
    //3. Execute the method
    //EXPECTED RESULT:
    //  The method will return 1 as the result of 0!
    //PASSED/FAILED:

    //TEST CASE #2: CHECK/VERIFY getFactorial() method with valid parameter
    //e.g.n = 0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n = 5
    //2. Call/invoke getFactorial(n = 5) method
    //3. Execute the method
    //EXPECTED RESULT:
    //  The method will return 120 as the result of 0!
    //PASSED/FAILED:

    //TEST CASE #3: CHECK/VERIFY getFactorial() method with valid parameter
    //e.g.n = 0
    //STEPS/PROCEDURE:
    //1. Given a valid n, e.g. n = 6
    //2. Call/invoke getFactorial(n = 6) method
    //3. Execute the method
    //EXPECTED RESULT:
    //  The method will return 720 as the result of 0!
    //PASSED/FAILED:


    public static void testFactorialGivenValidArgumentReturnsWell() {
        //Given
        int n = 0;
        long expectedValue = 1; //hope to see 0! = 1, kì vọng
        //When
        long actualValue = MathUtility.getFactorial(n);
        //test, so sánh giữa expected value và actual value
        //dùng biến boolean hoặc in ra
        //Then
        System.out.println("0! expected: " + expectedValue + "; actual: " + actualValue);
        if (expectedValue == actualValue) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    //TEST CASE #4: CHECK/VERIFY getFactorial() method with invalid parameter
    //e.g.n = -5
    //STEPS/PROCEDURE:
    //1. Given an invalid n, e.g. n = -5
    //2. Call/invoke getFactorial(n = -5) method
    //3. Execute the method
    //EXPECTED RESULT:
    //  The method will throw an exception!
    //PASSED/FAILED:
    public static void testFactorialGivenWrongArgMinus5ThrowException()
    {
        MathUtility.getFactorial(-5); //passed

    }
}