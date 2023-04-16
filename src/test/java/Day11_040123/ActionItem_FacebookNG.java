package Day11_040123;

import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionItem_FacebookNG {
    //to make variable global, you must declare it outside the annotation methods
    WebDriver driver;


    //create before suite to define your chrome driver
    @BeforeSuite
    public void setUpDriver(){

        driver = ReusableMethods.defineChromeDriver();
    }//end of before suite


    //@Test is a replacement of the main method to execute your code
    @Test(priority = 1)
    public void goFacebook(){
        //Navigate to Facebook
        driver.navigate().to("https://www.facebook.com/");
        //Click on Create New Account using mouse Method
        ReusableMethods.mouseHover(driver,"//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']","Create New Account");
    }//End of Test 1

    @Test(priority = 2)
    public void firstName(){
        //Enter First Name
        ReusableMethods.sendKeysMethod(driver,"//*[@class='inputtext _58mg _5dba _2ph-']","Hassan","First Name");
    }//end of Test 2

    @Test(priority = 3)
    public void lastName(){
        //Enter Last Name
        ReusableMethods.sendKeysMethod(driver,"//*[@name='lastname']","Raza","Last Name");
    }//end of Test 3

    @Test(priority = 4)
    public void phoneNumber(){
        //Enter Phone Number
        ReusableMethods.sendKeysMethod(driver,"//*[@aria-label='Mobile number or email']","123-456-7890","Phone or Email");
    }//end of Test 4

    @Test(priority = 5)
    public void enterPassword(){
        //Enter Password
        ReusableMethods.sendKeysMethod(driver,"//*[@data-type='password']","123456789","New Password");
    }//end of Test 5

    @Test(priority = 6)
    public void birthdayMonth(){
        //Select Birthday Month
        ReusableMethods.selectByText(driver,"//*[@id='month']","Dec","Birthday Month");
    }//end of Test 6

    @Test(priority = 7)
    public void birthdayDay(){
        //Select Birthday Day
        ReusableMethods.selectByText(driver,"//*[@id='day']","20","Birthday Day");
    }//end of Test 7

    @Test(priority = 8)
    public void birthdayYear(){
        //Select Birthday Year
        ReusableMethods.selectByText(driver,"//*[@id='year']","1999","Birthday Year");
    }//end of Test 9

    @Test(priority = 9)
    public void selectGender(){
        //Select Gender
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='_5k_2 _5dba']",1,"Gender");
    }//end of Test 9

    @AfterSuite
    public void quitSession(){
        driver.quit();
    }//end of after suite


}
