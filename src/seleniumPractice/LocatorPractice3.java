package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice3 {
//    Test case 4
//   1. Go to wikipedia.org (Links to an external site.)
//   2. Enter search term `selenium webdriver`
//   3. Click on search button
//   4. Click on search result `Selenium (software)`
//   5. Verify url ends with `Selenium_(software)'
   public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://wikipedia.org");
       WebElement searchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));
       searchInput.sendKeys("Selenium (software)");
       Thread.sleep(2000);
       WebElement searchButton = driver.findElement(By.cssSelector(".sprite.svg-search-icon"));
       searchButton.click();
       String getUrl = driver.getCurrentUrl();
       if (getUrl.endsWith("Selenium_(software)")){
           System.out.println("PASS");
       }else {
           System.out.println("FAIL");
       }
       driver.quit();

  }
}
