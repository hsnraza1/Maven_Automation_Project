package Actionitem_3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Actonitem_3 {
    public static void main(String[] args) throws InterruptedException {

        // Create an ArrayList to store 3 different real zipCodes
        ArrayList<String> zipCodes = new ArrayList<String>();
        zipCodes.add("11229");
        zipCodes.add("11228");
        zipCodes.add("11235");

        // Iterate through the test steps multiple times using for loop
        for (int i = 0; i < zipCodes.size(); i++) {


            //set up your driver through web driver manager
            WebDriverManager.chromedriver().setup();

            //set up your chrome options for your web driver
            ChromeOptions options = new ChromeOptions();

            // Set up Chrome driver with ChromeOptions to maximize and use incognito mode
            options.addArguments("--kiosk");
            options.addArguments("incognito");

            //define chrome driver for automation
            WebDriver driver = new ChromeDriver(options);

            //navigate to the weightwatchers.com
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");

            //wait for 2-3 seconds
            Thread.sleep(3000);


            driver.findElement(By.xpath("//*[@class='input input-3TfT5']")).clear();

            //Enter zip code into search field
            driver.findElement(By.xpath("//*[@class='input input-3TfT5']")).sendKeys(zipCodes.get(i));

            Thread.sleep(2000);

            //Click on Search
            driver.findElement(By.xpath("@class='rightArrow-daPRP")).submit();

            //wait 2-3 seconds
            Thread.sleep(2000);



            ArrayList<WebElement> studio = new ArrayList<>(driver.findElements(By.xpath("//a[contains(text(),'ww Studio')]")));

            if (i == 0){
                studio.get(1).click();
            }else if (i == 1){
                studio.get(2).click();
            }else if ((i == 2)){
                studio.get(0).click();
            }

            Thread.sleep(2000);


        }




        //close the browser
        //driver.quit();
    }//end of java main
}//end of java class
