package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice1 {
//    Test case 2
//  1. Go to ebay
//  2. enter search term
//  3. click on search button
//  4. print number of results
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        WebElement search = driver.findElement(By.id("gh-ac"));
        search.sendKeys("lg g6");
        WebElement searchButton = driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']"));
        searchButton.click();
        String resultText = driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println("resultText = " + resultText);
        driver.quit();

    }
}
