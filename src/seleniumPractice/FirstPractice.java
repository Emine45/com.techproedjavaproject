package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPractice {
//    Test Case 1
//    2. Go to website https://google.com
//    3. Save the title in a string variable
//    4. Navigate to https://etsy.com
//    5. Save the title in a string variable
//    6. Navigate back to previous page
//    7. Verify that title is same is in step 3
//    8. Navigate forward to previous page
//    9. Verify that title is same is in step 5
//            10. quite from the browser
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/eminebatar/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
        String expectedGoogleTitle = driver.getTitle();
        driver.navigate().to("https://etsy.com");
        String expectedEtsytitle = driver.getTitle();
        driver.navigate().back();
        String actualGoogleTitle = driver.getTitle();
        if (expectedGoogleTitle.equals(actualGoogleTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedGoogleTitle = " + expectedGoogleTitle);
            System.out.println("actualGoogleTitle = " + actualGoogleTitle);
        }
        driver.navigate().forward();
        String actualEtsyTitle = driver.getTitle();
        if (expectedEtsytitle.equals(actualEtsyTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedEtsytitle = " + expectedEtsytitle);
            System.out.println("actualEtsyTitle = " + actualEtsyTitle);
        }
        driver.quit();
    }
}
