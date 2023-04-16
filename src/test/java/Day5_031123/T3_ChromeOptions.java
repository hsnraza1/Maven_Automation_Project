package Day5_031123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_ChromeOptions {
    public static void main(String[] args) throws InterruptedException {

        //Set up you driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options for your web driver
        ChromeOptions options = new ChromeOptions();

        //add maximize for window
        //options.addArguments("start-maximizes");
        //add --kiosk mode mac
        //options.addArguments("--kiosk");
        //add incognito to option
        options.addArguments("incognito");
        //add options to run on the driver on the background(headless)
        options.addArguments("headless");

        //define the chrome driver that you will use for automation
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to the Google home page
        driver.navigate().to("https://www.yahoo.com");

        //wait for 2-5 seconds
        Thread.sleep(2000);

        //click on mail link
        driver.findElement(By.xpath("//*[text()='Sign in']")).click();

        Thread.sleep(2000);

        //Print out sign in to yahoo text
        //String result = driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).getText();
        //System.out.println(("Result" + result));

        driver.quit();

    }//end of main
}//end of class
