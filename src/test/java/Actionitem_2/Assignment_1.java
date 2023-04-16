package Actionitem_2;

public class Assignment_1 {
    public static void main(String[] args) {

        String myGrades;
        myGrades = "What is my Grade ";
        System.out.println("What is my Grade");

        int grade = 90;

        if (grade >= 90 && grade <= 100) {
            System.out.println("Grade A ");

        } else if (grade >= 80 && grade <= 90) {
            System.out.println("Grade B");
        } else if ( grade >= 70 && grade <= 80){

            System.out.println("Grade C ");
         } else if (grade >= 60 && grade <= 70){

            System.out.println("Grade D");
        } else if (grade < 60){
            System.out.println("Fail");
        }


    }//end of java main
}//end of java class
