/*
Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException.
Record the catching of each exception by displaying the message stored in the exception object.
 */
package com.stackroute.javaPe3;

public class ExceptionHandlingClass {
    public static void checkExceptions() {
        /*Negative Array Size Exception*/
        try {
            int array[] = new int[-2];
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        /*ArrayIndexOutOfBounds Exception*/
        try {
            int array[] = new int[1];
            array[0] = 0;
            System.out.println(array[1]);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        /*NullPointerException*/
        try {
            String str = null;
            int len = str.length();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String args[]) {

        checkExceptions();
    }
}
