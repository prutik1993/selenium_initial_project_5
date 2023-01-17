package util;

import org.openqa.selenium.WebDriver;

public class AutomationExercise {
    private static WebDriver driver;

    public static WebDriver getHomePage(){
        driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        return driver;
    }
}
