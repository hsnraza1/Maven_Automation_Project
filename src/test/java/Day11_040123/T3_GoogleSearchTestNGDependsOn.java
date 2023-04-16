package Day11_040123;

import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T3_GoogleSearchTestNGDependsOn {
    //to make variable global, you must declare it outside the annotation methods
    WebDriver driver;

    //@Test is a replacement of the main method to execute your code
    @Test
    public void searchForBMW() {
        //navigate to google home
        driver.navigate().to("https://www.google.com");
        //enter nmw on search field
        ReusableMethods.sendKeysMethod(driver, "//*[@name='q'] ", "BMW", "Search Field ");
        //submit on Google search
        ReusableMethods.submitMethod(driver, "//*[@name='btnK']", "Google Search");
    }//end of test 1

    @Test(dependsOnMethods = "searchForBMW")
        public  void captureSearchNumberForBMW(){
        //capture the text and print out the number
        String result = ReusableMethods.captureTextMethod(driver, "//*[@id='result-stats']", "Search Results");
        String[] arrayResult = result.split(" ");
        System.out.println("Search number for BMW" + arrayResult[1]);
    }//end of test 2

    @Test(dependsOnMethods = {"searchForBMW", "captureSearchNumberForBMW"})
    public  void clickOnFinance(){
        ReusableMethods.clickMethod(driver,"//div[text()='Finance']", "Finance");
    }//end of test 3

    //create before suite to define your chrome driver
    @BeforeSuite
    public void setUpDriver(){

        driver = ReusableMethods.defineChromeDriver();
    }//end of before suite


    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite

}//end of java class
