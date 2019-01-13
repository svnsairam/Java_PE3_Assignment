/*
Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console
 Input:
    India
    United States
    Germany
     Egypt
     czechoslovakia

Output:
    Place Name without Vowels:0 Ind
    Place Name without Vowels:1 Untd Stts
    Place Name without Vowels:2 Grmny
    Place Name without Vowels:3 Egypt
    Place Name without Vowels:4 czchslvk
 */
package com.stackroute.javaPe3;

public class ArrayOfPlaces {
    public String arrayOfPlaces(String[] places) {
        if (places == null) {
            return "Null input is not expected";
        }
        String[] resultantPlaces = new String[places.length];
        for (int i = 0; i < places.length; i++) {
            if (places[i].matches("\\w+[^0-9]")) {
                resultantPlaces[i] = places[i].replaceAll("[aeiou]", "");
            } else {
                return "Invalid places name";
            }
        }
        String placesWithoutVowels = new String();
        for (int i = 0; i < resultantPlaces.length; i++) {
            placesWithoutVowels = placesWithoutVowels.concat(resultantPlaces[i] + " ");
        }
        return placesWithoutVowels;
    }
}
