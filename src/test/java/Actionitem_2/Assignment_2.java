package Actionitem_2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Assignment_2 {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through the web driver

        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for testing
        WebDriver driver = new ChromeDriver();

        //set up ArrayList for Country
        ArrayList<String>hobby = new ArrayList<>();
        hobby.add("Cooking");
        hobby.add("Swimming");
        hobby.add("drawing");
        hobby.add("reading");

        //iterate through the list of Country and print out number for each variable
        for(int i=0; i<hobby.size(); i++){

            //navigate to bing.com
            driver.navigate().to("https://www.bing.com");

            //wait for 3 seconds
            Thread.sleep(5000);

            //Enter keyword USA to search field
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys(hobby.get(i));

            //click on bing search field
            driver.findElement(By.xpath("//*[@viewBox='0 0 25 24']")).submit();

            //whenever you go to a new page or navigate, always use 2-3 seconds wait to pause your script a bit
            Thread.sleep(5000);

             //capture the search result using .getText()
           String result = driver.findElement(By.xpath("//*[@data-bm ='4']")).getText();


           //print out only the number
            String[] arrayResult = result.split(" ");
            System.out.println("For " + "The search number is " + arrayResult[1]);

        }//end of loop

        driver.close();

    }//end of java main
}//end of java class
