package Day10_032623;

import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;

public class ActionItem_Facebook {
    public static void main(String[] args) throws InterruptedException {


        //set up the chrome driver
        WebDriver driver = ReusableMethods.defineChromeDriver();

        //navigate to the Facebook website
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);

        //Click on Create New Account using mouse Method
        ReusableMethods.mouseHover(driver,"//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']","Create New Account");
        Thread.sleep(1000);
        //Enter First Name
        ReusableMethods.sendKeysMethod(driver,"//*[@class='inputtext _58mg _5dba _2ph-']","Hassan","First Name");
        Thread.sleep(1000);
        //Enter Last Name
        ReusableMethods.sendKeysMethod(driver,"//*[@name='lastname']","Raza","Last Name");
        Thread.sleep(1000);
        //Enter Phone Number
        ReusableMethods.sendKeysMethod(driver,"//*[@aria-label='Mobile number or email']","123-456-7890","Phone or Email");
        Thread.sleep(1000);
        //Enter Password
        ReusableMethods.sendKeysMethod(driver,"//*[@data-type='password']","123456789","New Password");
        Thread.sleep(1000);
        //Select Birthday Month
        ReusableMethods.selectByText(driver,"//*[@id='month']","Dec","Birthday Month");
        Thread.sleep(1000);
        //Select Birthday Day
        ReusableMethods.selectByText(driver,"//*[@id='day']","20","Birthday Day");
        Thread.sleep(1000);
        //Select Birthday Year
        ReusableMethods.selectByText(driver,"//*[@id='year']","1998","Birthday Year");
        Thread.sleep(1000);
        //Select Gender
        ReusableMethods.clickMethodByIndex(driver,"//*[@class='_5k_2 _5dba']",1,"Gender");
    }//end of java class
}//end of java main
