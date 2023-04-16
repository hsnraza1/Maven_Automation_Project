package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_findElement {
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

        //navigate to the Google home page
        driver.navigate().to("https://www.mlcalc.com");

        Thread.sleep(2000);

        //clear the auto-populated data from purchase price
        driver.findElement(By.xpath("//*[@name='ma']")).clear();

        //entre purchase price
        driver.findElement(By.xpath("//*[@name='ma']")).sendKeys("25000");

        //click on calculate
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();

        Thread.sleep(1500);

        //capture the monthly payment using findElement with index of 0
        String result = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(0).getText();
        System.out.println("Monthly Payment " + result );

        //capture the total 360 payments using findElement with index of 1
        String result2 = driver.findElements(By.xpath("//*[@style='font-size: 32px']")).get(1).getText();
        System.out.println("Total 360 Payment " + result2 );

        //capture the interest rate using findElement
        String result3 = driver.findElement(By.xpath("//*[@value='4.5 ']")).getText();
        System.out.println("Interest rate = " + result3);




    }//end of java main
}//end of java class
