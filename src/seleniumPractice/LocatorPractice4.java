package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice4 {
//    Test case 5
//  1. Go to http://zero.webappsecurity.com/
//  2. Click Signin button
//  3. Enter login ( “username”)
//  4. Enter password (“password”(
//  5. Click Sign in button
//  6. Verify the title is “Zero – Account Summary”
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/");
        WebElement signinButton = driver.findElement(By.id("signin_button"));
        signinButton.click();
        WebElement userLogin = driver.findElement(By.xpath("//input[@name='user_login']"));
        userLogin.sendKeys("username");
        WebElement password = driver.findElement(By.name("user_password"));
        password.sendKeys("password");
        WebElement singInButton = driver.findElement(By.xpath("//input[@name='submit']"));
        singInButton.click();
        String expectedTitle = "Zero - Account Summary";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("actualTitle = " + actualTitle);
            System.out.println("expectedTitle = " + expectedTitle);
        }
        driver.quit();
    }
}
