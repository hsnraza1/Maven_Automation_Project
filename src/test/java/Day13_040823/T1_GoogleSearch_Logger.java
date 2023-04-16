package Day13_040823;

import ResuableLibrary.ReusableAnnotations;
import ResuableLibrary.ReusableMethods_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

    public class T1_GoogleSearch_Logger extends ReusableAnnotations {


        @Test(priority = 1)
        public void searchForCricket(){
            //navigate to google home
            logger.log(LogStatus.INFO,"Navigate to Google Home page");
            driver.navigate().to("https://www.google.com");
            //type the word cricket on search field
            ReusableMethods_Logger.sendKeysMethod(driver,"//*[@name='q']","cricket",logger,"Search Field");
            //hit submit on google search
            ReusableMethods_Logger.submitMethod(driver,"//*[@name='btnK']",logger,"Google Search Button");
        }//end of test 1

        @Test(priority = 2)
        public void printOutSearchNumber(){
            //capture the search result
            String result = ReusableMethods_Logger.captureTextMethod(driver,"//*[@id='result-stats']",logger,"Search Results");
            logger.log(LogStatus.INFO,"Search Results: " + result);
            String[] arrayResult = result.split(" ");
            System.out.println("Search number for cricket: " + arrayResult[1]);
            logger.log(LogStatus.INFO,"Search number for cricket: " + arrayResult[1]);
        }//end of test 2


        }//end of after suite

