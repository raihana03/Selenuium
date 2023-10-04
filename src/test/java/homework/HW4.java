package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
Check if the "Female" radio button is displayed.
Click on the "Show Button".
Check again if the "Female" radio button is displayed or not.
Print the results of the checks to the console.
 */
public class HW4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php.");
        driver.manage().window().maximize();
        WebElement radioBtnFemale = driver.findElement(By.xpath("//input[@value='Female']"));
        boolean isDisplayedBefore= radioBtnFemale.isDisplayed();
        Thread.sleep(2000);
        WebElement showButton= driver.findElement(By.xpath("//button[contains(text(),'Show Button')]"));
    showButton.click();
        Thread.sleep(2000);
        boolean isDisplayedAfter= radioBtnFemale.isDisplayed();
        System.out.println("Is Female radio button displayed before click? "+ isDisplayedBefore);
        System.out.println("Is Female radio button displayed after click? "+ isDisplayedAfter);

        driver.quit();

        }}

