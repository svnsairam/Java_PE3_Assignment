/*
Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
 Input: 98,96,95,94,93
 Output: 98,96,95,94,93 non consecutive numbers

 Input: 54,53,52,51,50,49,48
 Output : 54,53,52,51,50,49,48 are consecutive numbers

 Input: 1,2,3,4,5,6,6
 Output: 1,2,3,4,5,6,6 non consecutive numbers
 */
package com.stackroute.javaPe3;

public class ConsecutiveNumbers {
    public String checkConsecutive(String numbers) {
        if (numbers == null) {
            return "Null input not expected";
        }
        String arrayNumbers[] = numbers.split(" ");
        int stringToInt[] = new int[arrayNumbers.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i].matches("-?[0-9]+")) {
                stringToInt[i] = Integer.parseInt(arrayNumbers[i]);
            } else {
                return "Invalid Numbers";
            }
        }
        if (stringToInt.length == 0) {
            return "not consecutive numbers";
        }
        if (stringToInt.length == 1) {
            return "Single digit is not consecutive a number";
        }
        int diff = stringToInt[0] - stringToInt[1];
        if (diff > 1 || diff == 0 || diff < -1) {
            return "not consecutive numbers";
        }
        for (int i = 1; i < stringToInt.length - 1; i++) {
            int tempDiff = stringToInt[i] - stringToInt[i + 1];
            if (diff != tempDiff) {
                return "not consecutive numbers";
            }
        }
        String resultantString = new String();
        for (int i = 0; i < stringToInt.length; i++) {
            resultantString = resultantString + stringToInt[i] + " ";
        }
        return resultantString;
    }
}
