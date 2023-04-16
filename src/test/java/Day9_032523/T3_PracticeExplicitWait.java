package Day9_032523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T3_PracticeExplicitWait {
    public static void main(String[] args) {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        //options.addArguments("headless");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //set maximized for mac users
        driver.manage().window().maximize();

        //navigate to DHL
        driver.navigate().to("https://www.leopardscourier.com/");

        //declare Explicit wait Command
        WebDriverWait wait = new WebDriverWait(driver, 20);

        //click on Services
        //your explicit wait conditions replaces your find.Element(s)
        //presenceOfAllElementLocatedBy is same as findElement
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='dropdown-toggle middle']"))).click();



    }//end of java main
}//end of java class
