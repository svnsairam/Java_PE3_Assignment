/*
Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
 */
package com.stackroute.javaPe3;

public class StringException extends Exception {
    StringException() {
        String str = "This string is in constructor.";
        System.out.println(str);
    }

    public static void main(String args[]) throws Exception {
        try {
            new StringException();
            throw new Exception();

        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("This is a finally string");
        }
    }
}
