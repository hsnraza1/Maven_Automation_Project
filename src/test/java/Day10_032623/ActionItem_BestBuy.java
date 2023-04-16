package Day10_032623;

import ResuableLibrary.ReusableMethods;
import org.openqa.selenium.WebDriver;

public class ActionItem_BestBuy {
    public static void main(String[] args) throws InterruptedException {

        //set up the chrome driver
        WebDriver driver = ReusableMethods.defineChromeDriver();

        //navigate to the Bestbuy website
        driver.navigate().to("https://www.bestbuy.com/");
        //type on search field using sendKey method
        ReusableMethods.sendKeysMethod(driver,"//*[@id='gh-search-input']", "iphone", "Search icon" );

        //click on search button
        ReusableMethods.clickMethod(driver,"//*[@class='header-search-icon']", "search icon");
        //select the sort by dropdown Best selling
        ReusableMethods.selectByText(driver,"//*[@id='sort-by-select']", "Best Selling"," ");
        //Click on 1st iphone
        ReusableMethods.clickMethodByIndex(driver,"//*[@alt='Apple - Pre-Owned iPhone XR 64GB (Unlocked) - Black - Front_Zoom']", 0, " Iphone Image" );
        //Scroll to Learn About Totaltech
        ReusableMethods.scrollByElement(driver, "//*[@class='c-button c-button-outline c-button-md c-button-block v-m-top-xs']", "Learn About Totaltech");
        //Click on Add to Cart
        ReusableMethods.clickMethod(driver,"//*[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']","Add to Cart");
        //On pop up Capture Cart Subtotal (3 items)
        String result = ReusableMethods.captureTextMethod(driver,"//div[contains(text(),'$289.99')]","Cart Subtotal items");
        System.out.println("Subtotal items amount " + result);
        //using mouse hover click on Continue Shopping
        Thread.sleep(3000);
        ReusableMethods.mouseHover(driver,"//*[@class='c-button-link continue-shopping']", "Continue Shopping");


    }//end of java main
}//end of java class
