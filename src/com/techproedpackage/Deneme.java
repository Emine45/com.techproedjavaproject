package com.techproedpackage;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    //    Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
    //    Verify if the page URL contains youtube if not, print the right url
    //    Then Navigate to https://www.amazon.com/
    //    Navigate back to youtube
    //    Refresh the page
    //    Navigate forward to amazon
    //    Maximize the window
    //    Then verify if page title includes(contains) “Amazon”, If not, print the correct title
    //    Verify if the page URL is(equals) https://www.amazon.com/, if not print the correct url
    //  Quit the browser
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        //    Using ChromeDriver, Go to youtube and verify if page title is “youtube”, If not, print the correct title.
        driver.get("https://www.youtube.com");
        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
        }

        //    Verify if the page URL contains youtube if not, print the right url
        String actualYoutubeURL = driver.getCurrentUrl();
        String expectedYoutubeURL = "youtube";
        if(actualYoutubeURL.contains(expectedYoutubeURL)) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println(actualYoutubeURL);
            System.out.println(expectedYoutubeURL);
        }
        //    Then Navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //    Navigate back to youtube
        driver.navigate().back();
        //    Refresh the page
        driver.navigate().refresh();
        //    Navigate forward to amazon
        driver.navigate().forward();
        //    Maximize the window
        driver.manage().window().maximize();
        //    Then verify if page title includes(contains) “Amazon”, If not, print the correct title
        if(driver.getTitle().contains("Amazon")) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE: " + driver.getTitle());
        }
        //    Verify if the page URL is(equals) https://www.amazon.com/, if not print the correct url
        if (driver.getCurrentUrl().contains("https://www.amazon.com/")) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("ACTUAL AMAZON URL: " + driver.getCurrentUrl());
        }
        //  Quit the browser
        driver.close();


    }
}
