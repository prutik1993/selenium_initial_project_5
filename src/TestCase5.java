import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.Driver;
import util.Waiter;

import javax.swing.*;

public class TestCase5 {
    public static void main(String[] args) {
        /*
        Test Case 5: Validate Automation Exercise site Test Cases page
        Given user navigates to “https://automationexercise.com/”
        When user clicks on “Test Cases” header item
        Then validate user is navigated to “Test Cases” page successfully by it’s title and url
        Expected URL = https://automationexercise.com/test_cases
        Expected Title = Automation Practice Website for UI Testing - Test Cases
         */

        WebDriver driver = Driver.getDriver();


       driver.navigate().to("https://automationexercise.com/");


        driver.findElement(By.xpath("((//ul/li)[5]")).click();
        Waiter.pause(1);


        Driver.quitDriver();

        //        driver.findElement(By.id("dismiss-button"));
//        Waiter.pause(2);

//        WebElement actionBtn=driver.findElement(By.id("dismiss-button"));
//        act.doubleClick(actionBtn).perform();
//        Waiter.pause(2);

        //System.out.println();



        //Driver.quitDriver();
    }
}
