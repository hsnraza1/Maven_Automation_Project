package Day9_032523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_PracticeMouseAction {
    public static void main(String[] args) throws InterruptedException {

        //Set up of Driver through Web driver Manager
        WebDriverManager.chromedriver().setup();

        //set up your chrome option arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        //options.addArguments("");

        //define the chrome driver that you will use for automation test
        WebDriver driver = new ChromeDriver(options);

        //navigate to FedEx web
        driver.navigate().to("https://www.fedex.com/us");
        Thread.sleep(2000);

        //declare and define mouse action
        Actions mouseAction = new Actions(driver);

        //hover to send tab to open up submodules/functionality

        try{
            WebElement trackingTab = driver.findElements(By.xpath("//*[@class='fxg-mouse']")).get(2);
            mouseAction.moveToElement(trackingTab).click().perform();
        }catch (Exception e){
            System.out.println("Unable to hover to Sen tab:" + e);
            Thread.sleep(2000);

        } try{
            WebElement trackingTab = driver.findElements(By.xpath("//*[@class='fxg-field__placeholder fxg-field__floating-placeholder']")).get(0);
            mouseAction.moveToElement(trackingTab).click().sendKeys("123456").perform();
            Thread.sleep(2000);

        }catch (Exception e){
            System.out.println("Unable to to click amd type:" + e);

        }try{
            WebElement trackingTab = driver.findElements(By.xpath("//*[@class='fxg-button fxg-button--orange']")).get(0);
            mouseAction.moveToElement(trackingTab).click().perform();
            Thread.sleep(2000);

        }catch (Exception e) {
            System.out.println("Unable to to click amd type:" + e);

        }



    }//end of java main
}//end of java class
