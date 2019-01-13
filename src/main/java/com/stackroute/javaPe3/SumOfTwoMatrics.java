package com.stackroute.javaPe3;

public class SumOfTwoMatrics {
    public String sumOfTwoMatrice(String row, String column, String[][] matrix1, String[][] matrix2) {
        if (row.matches("\\d[0-9]") && column.matches("\\d[0-9]")) {
            int noOfRows = Integer.parseInt(row);
            int noOfColumn = Integer.parseInt(column);
            long[][] resultantMatrix = new long[noOfRows][noOfColumn];
            String resultantString = new String();
            for (int i = 0; i < noOfRows; i++) {
                for (int j = 0; j < noOfColumn; j++) {
                    if (matrix1[i][j].matches("\\d[0-9]") && matrix2[i][j].matches("\\d[0-9]")) {
                        resultantMatrix[i][j] = Integer.parseInt(matrix1[i][j]) + Integer.parseInt(matrix2[i][j]);
                    } else {
                        return "Invalid input in matrix1 or matrix2";
                    }
                }
            }
            for (int i = 0; i < noOfRows; i++) {
                for (int j = 0; j < noOfColumn; j++) {
                    resultantString = resultantString.concat(resultantMatrix[i][j] + " ");
                }

            }
            return resultantString;
        } else {
            return "Invalid Input";
        }
    }
}
