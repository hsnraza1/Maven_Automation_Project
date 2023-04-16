package InClass_Actionitem.Hotels;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Action_item_inClass {
    public static void main(String[] args) throws InterruptedException {

        //set up your driver through web driver manager
        WebDriverManager.chromedriver().setup();

//set your chrome options arguments for your web driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
//define the chrome driver that you will use for automation test
//option variable must be passed inside chromeDriver in order for your driver to recognize those conditions
        WebDriver driver = new ChromeDriver(options);

//navigate to Hotels home page
        driver.navigate().to("https://www.hotels.com/");

        Thread.sleep(2000);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Las Vegas");
        //cities.add("Miami");
        //cities.add("Huston");

        for (int i =0; i< cities.size(); i++) {




            //wait 2-3 seconds
            Thread.sleep(2000);

            try{
                WebElement goingTo = driver.findElement(By.xpath("//*[@aria-label='Going to']"));
                goingTo.click();
                Thread.sleep(2000);
                System.out.println("Successfully typed destination in textbox");
            }catch (Exception e){
                System.out.println("typing destination in textbox was unsuccessful");
            }//end of exception for typing in city

            Thread.sleep(1000);

            try{
                WebElement destination = driver.findElement(By.xpath("//*[@data-stid='destination_form_field-menu-input']"));
                destination.click();
                destination.sendKeys(cities.get(i));
                Thread.sleep(2000);
                driver.findElement(By.xpath("//*[@aria-label='Las Vegas Nevada, United States']")).click();

                System.out.println("Successfully clicked on destination box");
            }catch (Exception e){
                System.out.println("clicking on destination was unsuccessful");
            }
            try {
                WebElement Travler = driver.findElement(By.xpath("//*[@ class='uitk-menu-trigger uitk-fake-input uitk-form-field-trigger']"));
                Travler.click();
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println(" Click on travler unsuccessful");
            }
            try {
                WebElement Adult = driver.findElement(By.xpath("//*[@ class='uitk-icon uitk-step-input-icon uitk-icon-medium']"));
                Adult.click();
                Thread.sleep(2000);
            }catch(Exception e){
                System.out.println("Click was unsuccessful");

            }try {
                WebElement ChildAge = driver.findElement(By.xpath("//*[@aria-label='Increase the number of children in room 1']"));
                ChildAge.click();
                Thread.sleep(2000);
            }catch (Exception e){
                System.out.println("Click was unsuccessful");
            }
            try {
                WebElement ChildAgeValue = driver.findElement(By.xpath("//*[@name='child-traveler_selector_children_age_selector-0-0']"));
                ChildAgeValue.click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@value='2']")).click();
                Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@ id='traveler_selector_done_button']")).click();
                Thread.sleep(1000);


            }catch (Exception e){
                System.out.println("Click was unsuccessful");


            }try{
                WebElement ClickOnSearch = driver.findElement(By.xpath("//*[@ id='search_button']"));
                ClickOnSearch.click();
                Thread.sleep(1000);
            } catch(Exception e){
                System.out.println("Click wasn't unsuccessful");
            }try {
                WebElement ClickOnResortLink = driver.findElement(By.xpath("//*[@data-stid='open-hotel-information']"));
                ClickOnResortLink.click();
                Thread.sleep(2000);


            }catch (Exception e){
                System.out.println(" Unable to click");
            }
            //try {
                //WebElement ReserveARoom = driver.findElement(By.xpath("//*[@aria-hidden='true']"));
                //ReserveARoom.click();



            //}catch (Exception e){
                //System.out.println(" Unable to click");
            //}

            driver.quit();




        }

                }//end of java main
                }//end of java class
