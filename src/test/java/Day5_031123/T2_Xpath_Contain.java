package Day5_031123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_Xpath_Contain {
    public static void main(String[] args) throws InterruptedException {

        //Set up you driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to yahoo home page
        driver.navigate().to("https://www.yahoo.com");

        Thread.sleep(4000);

        //using xpath contain click on mail link by ignoring the white space on the text property for that element
        driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();


    }//end of jav main
}//end of java class
