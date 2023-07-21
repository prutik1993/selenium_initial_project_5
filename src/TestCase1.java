import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.AutomationExercise;
import util.Driver;

public class TestCase1 {
    public static void main(String[] args) {
        /*
        Test Case 1: Validate Automation Exercise site logo
        Given user navigates to “https://automationexercise.com/”
        Then user should see logo on top-left
         */

        WebDriver driver = AutomationExercise.getHomePage();



        System.out.println(driver.findElement(By.cssSelector("img[src='/static/images/home/logo.png']")).isDisplayed() ?
                "Logo is PASSED" : "Logo if FAILED"); // By.cssSelector(".logo img")

        System.out.println(driver.findElement(By.xpath("//div[@class='logo pull-left']//img")).isDisplayed() ?
                "Logo is PASSED" : "Logo if FAILED");

        

        Driver.quitDriver();
    }
}
