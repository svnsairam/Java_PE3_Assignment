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
