package Day4_030523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomeSearch {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through wen driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome that you will use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to browser
        driver.navigate().to("https://www.google.com");

        //waiting for 2-5 seconds
        Thread.sleep(5000);


        //entre keyword BMW to search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");

        //Click on Google Search
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();


        //close
        driver.close();
    }//end of java main
}// emd of java class
