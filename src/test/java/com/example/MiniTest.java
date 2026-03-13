package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniTest {

    @Test
    public void simpleTest() {

        // Automatically downloads correct driver
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        System.out.println("Successfully opened: " + driver.getTitle());

        driver.quit();
    }
}