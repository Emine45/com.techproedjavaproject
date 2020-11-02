package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Homework {
    //1.Create a new class : Day1Homework
    // 2.Using ChromeDriver, Go to facebook and verify if page 3tle is “facebook”, If not, print the correct 3tle.
    // 3.Verify if the page URL contains facebook  if not, print the right url.
    // 4.Then Navigate to https://www.walmart.com/
    // 5.Verify if the walmart page 3tle includes “Walmart.com”
    // 6.Navigate back to facebook
    // 7.Refresh the page
    // 8.Maximize the window
    // 9.Close the browser
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "facebook";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("ACTUAL TITLE:"+ actualTitle);
            System.out.println("EXPECTED TITLE:"+ expectedTitle);
        }
        // 3. Verify if the page URL contains facebook if not, print the right url.
        if (driver.getCurrentUrl().contains("facebook")) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("ACTUAL :"+ driver.getCurrentUrl());
        }
        // 4- Then Navigate to https://www.walmart.com/
        driver.navigate().to("https://www.walmart.com/");
        //5. Verify if the walmart page title includes “Walmart.com”
        String actualTitle1 = driver.getTitle();
        String expectedTitle1 = "Walmart.com";
        if (actualTitle1.equals(expectedTitle1)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
            System.out.println("EXPECTED TITLE:"+ expectedTitle1);
            System.out.println("ACTUAL TITLE:"+ actualTitle1);
        }
        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.quit();
    }
}
