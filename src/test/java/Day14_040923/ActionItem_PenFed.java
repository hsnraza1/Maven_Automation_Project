package Day14_040923;

import ResuableLibrary.ReusableAnnotations;
import ResuableLibrary.ReusableMethods;
import ResuableLibrary.ReusableMethods_Logger;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ActionItem_PenFed extends ReusableAnnotations {

    @Test(priority = 1)
    public void FreeChecking() throws InterruptedException {
        logger.log(LogStatus.INFO, "Navigate to PedFed Page");
        //navigate to PenFed.com
        driver.navigate().to("https://www.penfed.org");
        //click on Free Checking
        ReusableMethods_Logger.clickMethod(driver, "//*[@data-id='CheckingSavings'] ", logger, " Free Checking");
        Thread.sleep(3000);
    }


}

