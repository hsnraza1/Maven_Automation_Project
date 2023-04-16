package InClass_Actionitem.Hotels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Action_item7 {
    public static void main(String[] args) throws InterruptedException {

        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");

        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);
        //now navigate to the Hotels website
        driver.navigate().to("https://www.Hotels.com");
        Thread.sleep(3000);

        ArrayList<String> locations = new ArrayList<>();
        locations.add("Miami");
        locations.add("California");
        locations.add("NewYork");
        for (int i = 0; i < locations.size(); i++) {

            try {
                WebElement goingTo = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
                goingTo.click();
                Thread.sleep(2000);
                WebElement goingWhere = driver.findElement(By.xpath("//*[@id='location-field-destination']"));
                goingWhere.click();
                goingWhere.sendKeys(locations.get(i));
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println(" " + e);
            }

            try {
                WebElement searchOption1 = driver.findElements(By.xpath("//*[@class='uitk-typeahead-button-label truncate']")).get(0);
                searchOption1.click();
            } catch (Exception e) {
                System.out.println("" + e);
            }

            try {

                WebElement CheckInBox = driver.findElement(By.xpath("//*[@id='d1-btn']"));
                CheckInBox.click();
                Thread.sleep(3000);

                WebElement chooseDate = driver.findElement(By.xpath("//*[@aria-label='Jun 8, 2022']"));
                chooseDate.click();

                driver.findElement(By.xpath("//*[@aria-label='Jun 17, 2023']")).click();
                Thread.sleep(1000);

                driver.findElement(By.xpath("//*[@data-stid='apply-date-picker']")).click();

                //click on Travelers
                driver.findElement(By.xpath("//*[@aria-label='1 room, 2 travelers']")).click();

                //click + adult twice
                WebElement adults = driver.findElement(By.xpath("//*[@aria-label='Increase adults in room 1']"));
                adults.click();
                adults.click();
                Thread.sleep(1000);

                //click done
                driver.findElement(By.xpath("//*[@data-testid='guests-done-button']")).click();
                Thread.sleep(1000);

                //click search
                driver.findElement(By.xpath("//*[@data-testid='submit-button']")).click();


            } catch (Exception e) {

                System.out.println("Unable to open" + e);

            }


        }
    }
}
