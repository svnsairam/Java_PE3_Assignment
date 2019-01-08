package com.company;

public class ConsecutiveNumbers {
    public String checkConsecutive(String numbers){

        if(numbers==null){
            return "Null input not expected";
        }

        String  arrayNumbers[]   =   numbers.split(" ");
        int     stringToInt[]    =   new int[arrayNumbers.length];
        for (int i=0;i<arrayNumbers.length;i++) {
            if (arrayNumbers[i].matches("-?[0-9]+")) {
                stringToInt[i] = Integer.parseInt(arrayNumbers[i]);
            } else {
                return "Invalid Numbers";
            }
        }

        if(stringToInt.length == 0){
            return "not consecutive numbers";
        }

        if(stringToInt.length==1){
            return "Single digit is not consecutive a number";
        }
        int diff    =   stringToInt[0]-stringToInt[1];
        if(diff>1 || diff==0 || diff<-1){
            return "not consecutive numbers";
        }
        for (int i=1;i<stringToInt.length-1;i++){
           int tempDiff    =   stringToInt[i]-stringToInt[i+1];
            if(diff != tempDiff){
                return "not consecutive numbers";
            }
        }

        String  resultantString   =   new String();
        for (int i=0;i<stringToInt.length;i++){
            resultantString   =   resultantString+stringToInt[i]+" ";
        }
        return resultantString;
    }
}
