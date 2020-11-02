package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

// 1. Go to http://zero.webappsecurity.com/ 
// 2. Click Signin button 
// 3. Enter login ( “username”) 
// 4. Enter wrong password (“password.”) 
// 5. Click Sign in button
// 6. Go to Pay Bills page
// 7. Enter any amount into amount input
// 8. Enter date “2020-08-23”
// 9. Click Pay button
// 10. Verify “The payment was successfully submitted.” message is displayed



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

        WebElement loginSigninButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginSigninButton.click();

        WebElement payBillsPage = driver.findElement(By.linkText("Pay Bills"));
        payBillsPage.click();

        WebElement amountButton = driver.findElement(By.id("sp_amount"));
        amountButton.sendKeys("1000");

        WebElement dateButton = driver.findElement(By.id("sp_date"));
        dateButton.sendKeys("2020-08-23");

        WebElement payButton = driver.findElement(By.id("pay_saved_payees"));
        payButton.click();

        WebElement message = driver.findElement(By.id("alert_content"));
        String actualMessage = message.getText();
        String expectedMessage = "The payment was successfully submitted.";
        if(actualMessage.equals(expectedMessage)) {
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("ACTUAL MESSAGE: " + actualMessage);
            System.out.println("EXPECTED MESSAGE: " + expectedMessage);
        }
    }
}
