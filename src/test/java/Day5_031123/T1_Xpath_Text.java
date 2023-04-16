package Day5_031123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Xpath_Text {
    public static void main(String[] args) throws InterruptedException {

        //Set up you driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for automation
        WebDriver driver = new ChromeDriver();

        //navigate to the Google home page
        driver.navigate().to("https://www.google.com");

        //wait for 2-5 seconds
        Thread.sleep(2000);


        //click on About Text link using Xpath text()
        driver.findElement(By.xpath("//*[text()='About']")).click();



    }//end of main
}//end of java class

