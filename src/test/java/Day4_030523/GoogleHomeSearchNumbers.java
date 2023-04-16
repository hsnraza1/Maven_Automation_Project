package Day4_030523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomeSearchNumbers {
    public static void main(String[] args) throws InterruptedException {
        
        //Set up you driver through web driver manager
        WebDriverManager.chromedriver().setup();
        
        //define the chrome driver that you will use for automation
        WebDriver driver = new ChromeDriver();
        
        //navigate to the Google home page
        driver.navigate().to("https://www.google.com");
        
        //wait for 2-5 seconds
        //Thread.sleep(3000);
        
        
        //entre keyword BMW to search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("BMW");
        
        //click on search button
        driver.findElement(By.xpath("//*[@name='btnK' ]")).submit();
        
        //capture the search result using .getText()
        String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();

        //System.out.println("Search result: " + result);
        //Print only numbers

        String[] arrayResult = result.split(" ");
       System.out.println("Search Number: " + arrayResult[1]);
        
        
        
        //close
        //driver.close();
        
        
    }//end of java main
}//end of java class
