package com.company;

public class StudentMarks {


    public String studentMarks(String noOfStudents, String[] grades) {

        if(noOfStudents.matches("[0-9]+")){
            int     totalNoOfStudents       =   Integer.parseInt(noOfStudents);
            String  resultantStringOfGrades =   new String();
            for (int i=0;i<totalNoOfStudents;i++){
                System.out.println(grades[i]);
                if((grades[i].matches("[0-9]+"))&&(Integer.parseInt(grades[i])<=100)){
                    resultantStringOfGrades =  resultantStringOfGrades.concat(grades[i]+" ");
                }else {
                    return "Invalid grade 1.may be due to not a number or 2.may be due to grade not in 0 to 100 range ";
                }
            }
            return resultantStringOfGrades;
        }else {
            return "Invalid Input";
        }
    }

}
