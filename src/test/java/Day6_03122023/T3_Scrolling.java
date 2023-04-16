package Day6_03122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3_Scrolling {
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
        //options.addArguments("incognito");
        //add options to run on the driver on the background(headless)
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);


        //navigate to yahoo home
        driver.navigate().to("https://www.mlcalc.com");


        Thread.sleep(2000);

        //scroll to the bottom to click on mortgage rates
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll using pixels
        jse.executeScript("scroll(0,3000)");

        //Thread.sleep(1000);

        //scrolling back up again using pixels
        jse.executeScript("scroll(0,-3000)");


        //Thread.sleep(1500);

        //Scroll again to the bottom
        jse.executeScript("scroll(0,3000)");

        //click on mortgage rate link
        driver.findElements(By.xpath("//*[text()='Mortgage Rates']")).get(1).getText();




    }//end of  java main
}//end of java class
