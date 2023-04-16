package Day12_040223;

import ResuableLibrary.ReusableAnnotations;
import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionItem_FideliCare extends ReusableAnnotations {

    //to make variable global, you must declare it outside the annotation methods
    WebDriver driver;

    //create before suite to define your chrome driver
    @BeforeSuite
    public void setUpDriver(){

        driver = ReusableMethods.defineChromeDriver();
    }//end of before suite



    //Test case 1
    @Test
    public void dentalCoverage() throws InterruptedException {
        //navigate to FidelisCare
        driver.navigate().to("https://www.fideliscare.org/");
        //click on search element on top right
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='dropdown-toggle'] ",1,"Search element ");
        Thread.sleep(1000);
        //Enter get dental coverage
        ReusableMethods.sendKeysMethodByIndex(driver,"//*[@aria-label='Search']", "get dental coverage", 0,"Search");
        Thread.sleep(1000);
        //click on search button
        ReusableMethods.clickMethodByIndex(driver,"//*[@type='button']",3,"Click on search button");
        Thread.sleep(1000);
        String result = ReusableMethods.captureTextMethod(driver,"//*[@class='gsc-result-info']", "Search Result");
        String[] arrayList = result.split(" ");
        System.out.println("Search Number:" + arrayList[1]);

        //Click on Get dental Coverage
        ReusableMethods.clickMethod(driver,"//b[text()='Get Dental Coverage']","Get Dental Coverage");
        Thread.sleep(2000);

    }// end of test case 1



    //test case 2
    @Test(dependsOnMethods = "dentalCoverage")
    public void switchToTab() throws InterruptedException {
        //New Tab open so Switch to tab
        ReusableMethods.switchToTabByIndex(driver, 1);
        //Entre first name
        ReusableMethods.sendKeysMethod(driver, "//*[@formcontrolname='firstName']", "David", "First Name");
        //Entre Last name
        ReusableMethods.sendKeysMethod(driver, "//*[@formcontrolname='lastName']", "Wolk", "Last Name");
        //Entre Zip Code
        ReusableMethods.sendKeysMethod(driver, "//*[@formcontrolname='zipCode']", "11229", "Zip Code");
        //Select County
        ReusableMethods.selectByText(driver, "//*[@formcontrolname='county']", "Kings", "County");
        //Entre Phone num,ber
        ReusableMethods.sendKeysMethod(driver, "//*[@formcontrolname='phoneNumber']", "123-345-6789", "Phone Number");
        //Entre Email
        ReusableMethods.sendKeysMethod(driver, "//*[@formcontrolname='email']", "david123@gmail.com", "Email");
        //Click on contact me checkbox
        ReusableMethods.clickMethodByIndex(driver, "//*[@for='contactMe']", 1, "Click on Checkbox");
        //Click on contact me button
        ReusableMethods.clickMethodByIndex(driver, "//*[@class='btn btn-primary']", 4, "Click on contact me");
        //Capture the message "Thank you for your submission
        String message = ReusableMethods.captureTextMethod(driver, "//*[@class='alert alert-success']", ": Thank you for your submission");
        System.out.println("Message: " + message);

        driver.close();
        ReusableMethods.switchToTabByIndex(driver, 0);
    }//end of test case 2


    //test case 3

    @Test(priority = 3)
    public void switchBackToDefaultTab() throws InterruptedException {

        //Click on Login
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='tool dropdown login']",0,"Login");
        Thread.sleep(1000);
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='link-external']",0,"Member Portal");
        Thread.sleep(3000);
        String message = ReusableMethods.captureTextMethod(driver,"//*[@class='card-title']","Helpful Hints");
        System.out.println("Message; " + message);

        driver.close();

    }//of test case 3



    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite

}
