import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.AutomationExercise;
import util.Driver;

import java.util.List;

public class TestCase2 {
    public static void main(String[] args) {
        /*
        Test Case 2: Validate Automation Exercise site header items
        Given user navigates to “https://automationexercise.com/”
        Then validate all below header items are displayed and enabled and their text is as below
        Home
        Products
        Cart
        Signup / Login
        Test Cases
        API Testing
        Video Tutorials
        Contact us
        */

        WebDriver driver = AutomationExercise.getHomePage();



        List<WebElement> headerItems = driver.findElements(By.cssSelector(".navbar-nav>li")); // By.cssSelector(#header li)
        String[] headerItemsNames = {
                "Home",
                "Products",
                "Cart",
                "Signup / Login",
                "Test Cases",
                "API Testing",
                "Video Tutorials",
                "Contact us"};

        for (int i = 0; i < headerItems.size(); i++) {
            System.out.println(headerItems.get(i).isDisplayed() ? "Display is PASSED" :"Display is FAILED");
            System.out.println(headerItems.get(i).isEnabled() ? "Enable is PASSED" :"Enable is FAILED");
            System.out.println(headerItems.get(i).getText());
            System.out.println(headerItems.get(i).getText().trim().equals(headerItemsNames[i]) ?
                    "Text is PASSED" :"Text is FAILED"); // we can use contains() here to make it pass it

            System.out.println("-----------------------");
        }
        Driver.quitDriver();
    }
}
