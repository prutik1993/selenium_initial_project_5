import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.AutomationExercise;
import util.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        /*
        Test Case 4: Validate Automation Exercise site footer
        Given user navigates to “https://automationexercise.com/”
        Then user should see “Copyright © 2021 All rights reserved” text in the footer
        */

        WebDriver driver = AutomationExercise.getHomePage();

        System.out.println(driver.findElement(By.cssSelector(".footer-bottom p")).isDisplayed() ?
                "Footer is PASSED" : "Footer is FAILED" );

        System.out.println(driver.findElement(By.cssSelector(".footer-bottom p")).getText().equals
                ("Copyright © 2021 All rights reserved") ? "Footer text is PASSED" : "Footer text is FAILED");

        Driver.quitDriver();
    }
}
