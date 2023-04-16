package Day4_030523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHome {

    public static void main(String[] args) throws InterruptedException {
        //setup your driver through web driver manger

        WebDriverManager.chromedriver().setup();

        //define the chrome driver that you will use for testing
        WebDriver driver = new ChromeDriver();

        //navigate to Google homepage
        driver.navigate().to("https://www.google.com");

        //waiting for 3 seconds
        Thread.sleep(3000);

        //close the browser
        driver.close();

    }// end of java main
}// end of java class
