package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice_Sel_State {
    public static void main(String[] args) throws InterruptedException {

        //set up driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set up your chrome options for your web driver
        ChromeOptions options = new ChromeOptions();

        //add incognito to option
        options.addArguments("incognito");

        //define the chrome driver that you will use for automation
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org/");

        //wait 2-3 seconds
        Thread.sleep(2000);


        //select start month as April from the dropdown using select function
        //store to start month locator as an WebElement
        WebElement srtMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //call select function to store the dropdown locator
        Select startMonthDropdown = new Select(srtMonth);

        //select by visible text
        startMonthDropdown.selectByVisibleText("May");


    }//end of java main
}//end of java class
