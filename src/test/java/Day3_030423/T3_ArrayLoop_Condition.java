package Day3_030423;

import java.util.ArrayList;

public class T3_ArrayLoop_Condition {
    public static void main(String[] args) {

        /*
        iterate through list of fruit using ArrayList
        but only print when fruit is gape or apple
         */
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Strawberry");
        fruit.add("Grape");

        for(int i = 0; i <fruit.size(); i++) {


            /*
            if(fruit.get(i) == "Apple") {
                System.out.println("Fruit: Apple");
            }else if (fruit.get(i) == " Grape"){
                System.out.println(" Fruit: Grape");
            }// end of condition

             */


            if (fruit.get(i) == "Apple" || fruit.get(i) == "Grape") {
                System.out.println("Fruit: " + fruit.get(i));

            }
        }

    }//end of java main
}//end of java class
