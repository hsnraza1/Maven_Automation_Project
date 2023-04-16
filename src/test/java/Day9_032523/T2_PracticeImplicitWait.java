package Day9_032523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class T2_PracticeImplicitWait {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

        //set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");

        //define the chrome driver that you will use for automation test
        //option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

        //declare your implicit wait statement
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //navigate to FedEx web
        driver.navigate().to("https://www.fedex.com/us");


        //declare and define mouse action
        Actions mouseAction = new Actions(driver);

        //hover to tracking tab to open up submodules/functionality

        try{
            WebElement trackingTab = driver.findElements(By.xpath("//*[@class='fxg-mouse']")).get(2);
            mouseAction.moveToElement(trackingTab).click().perform();
        }catch (Exception e){
            System.out.println("Unable to hover to tracking tab:" + e);
        }//end of tracking tab
        try{
            WebElement trackingTab = driver.findElements(By.xpath("//*[@class='fxg-field__placeholder fxg-field__floating-placeholder']")).get(0);
            mouseAction.moveToElement(trackingTab).click().sendKeys("123456").perform();

        }catch (Exception e){
            System.out.println("Unable to to click amd type:" + e);
        }//end of click and type

        try{
            WebElement trackingTab = driver.findElements(By.xpath("//*[@class='fxg-button fxg-button--orange']")).get(0);
            mouseAction.moveToElement(trackingTab).click().perform();


        }catch (Exception e) {
            System.out.println("Unable to to click on track :" + e);


        }//end of click on Track


        driver.quit();
    }//end of java main
}//end of java class
