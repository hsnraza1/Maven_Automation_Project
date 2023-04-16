package Day6_03122023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class T2_WebElement_ScrollByPixel {
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
        // clear the auto-populated data from purchase
         WebElement pPrice = driver.findElement(By.xpath("//*[@name='ma']"));
         pPrice.clear();

        // enter new purchase
        pPrice.sendKeys("250000");

        // click on calculate
         driver.findElement(By.xpath("//*[@value='Calculate']")).click();
         Thread.sleep(1500);

        // if you want you use findElements as a webelement variable, you need to store it as an Array List
        // capture the monthly payment & total 360
        ArrayList<WebElement> paymentList = new ArrayList<>(driver.findElements((By.xpath("//*[@style='font-size: 32px']"))));

        // print monthly payment
        //
        String mntPayment = paymentList.get(0).getText();
        System.out.println("Monthly Payment: " + mntPayment);
        // print total 360  payment

        String total360Pay = paymentList.get(1).getText();
        System.out.println("Total 360 Payment: " + total360Pay);


    }  //
}
