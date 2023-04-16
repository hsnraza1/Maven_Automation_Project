package Day7_0300823;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_SelectDropdownByClick {
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
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);


        //navigate to yahoo home
        driver.navigate().to("https://www.mortgagecalculator.org");

        //wait 2-3 seconds
        Thread.sleep(2000);

        //select start month as April from the dropdown using select function
        //if the dropdown is not under select tag then on the dropdown first
        driver.findElement(By.xpath("//*[@name='param[start_month]']")).click();

        Thread.sleep(3000);
        //click on the dropdown value by using xpath text
        driver.findElement(By.xpath("//*[text()='May']")).click();

        //click on empty area to close the dropdown
        driver.findElement(By.xpath("//*[@class='content-area']")).click();



    }//end of java main
}// end of java class
