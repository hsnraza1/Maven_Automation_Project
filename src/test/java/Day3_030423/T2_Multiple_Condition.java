package Day3_030423;

public class T2_Multiple_Condition {
    public static void main(String[] args) {

        //using multiple conditions statement verify when a+b > c, a+b< c & a+b ==c

        int a = 2;
        int b = 3;
        int c = 5;

        if(a+b < c){
            System.out.println("a & b is greater than c");
        }else if ( a+b > c ){
            System.out.println(" a & c is less than c");
        } else if (a+b == c) {
            //when you compare two values it will always be equal sign
            System.out.println(" a & b is equal to c");
        }

    }//end of java main
}//end of java class
