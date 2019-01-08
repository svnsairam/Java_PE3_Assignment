package com.company;

public class StringException extends Exception {

    StringException(){
        String str = "This string is in constructor.";
        System.out.println(str);
    }

    public static void main(String args[]) throws Exception{
        try{
            new StringException();
            throw new Exception();

        }
        catch(Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("This is a finally string");
        }
    }

}
