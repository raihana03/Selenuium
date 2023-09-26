package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Selenium Homework Assignment: Automating a Login Process
Objective: Write a Selenium script to automate the login process on the OrangeHRM website.
 */
public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=  new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement userName= driver.findElement(By.name("username"));
        userName.sendKeys("abc");
        Thread.sleep(2000);
        userName.clear();
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement login = driver.findElement(By.tagName("button"));
        System.out.println("The login button text is "+login.getText());
        login.click();
    }
}
