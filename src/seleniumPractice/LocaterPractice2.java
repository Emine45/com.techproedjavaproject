package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocaterPractice2 {
//    Test case 3
// 1.Go to amazon
// 2. Enter search any text “men hats” term
// 3. Click on search button
// 4. Verify title contains this text is “men hats” search term
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.es");
        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Men Hats");
        Thread.sleep(2000);
        WebElement searchButton=driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
        searchButton.click();
        String actualTitle=driver.getTitle();
        if (actualTitle.contains("men hats")){
            System.out.println("PASSED");
        }
        else{
            System.out.println("FAILED");
        }
        driver.quit();

    }
}
