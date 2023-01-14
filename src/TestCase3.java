import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Driver;

public class TestCase3 {
    public static void main(String[] args) {
         /*
        Test Case 3: Validate Automation Exercise site SUBSCRIPTION form
        Given user navigates to “https://automationexercise.com/”
        Then user should see heading2 as “SUBSCRIPTION”
        And user should see and email input box with “Your email address” placeholder
        And user should see arrow submit button
        And user should see “Get the most recent updates from our site and be updated your self...
        ” text under the email input box
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://automationexercise.com/");

        System.out.println(driver.findElement(By.cssSelector(".single-widget>h2")).isDisplayed() ?
                "SUBSCRIPTION button is PASSED" : "SUBSCRIPTION button is FAILED");

        System.out.println(driver.findElement(By.id("susbscribe_email")).isDisplayed() ?
                "Email box is PASSED" : "Email box is FAILED");
        System.out.println(driver.findElement(By.id("susbscribe_email")).getAttribute
                ("placeholder").equals("Your email address") ?
                "Email box text is PASSED" : "Email box text is FAILED");

        System.out.println(driver.findElement(By.id("subscribe")).isDisplayed() ?
                "Arrow submit button is PASSED" : "Arrow submit button is FAILED");

        System.out.println(driver.findElement(By.cssSelector(".searchform>p")).isDisplayed() ?
                "Text is PASSED" : "Test box is FAILED");
        System.out.println(driver.findElement(By.cssSelector(".searchform>p")).getText());

        Driver.quitDriver();
    }
}
