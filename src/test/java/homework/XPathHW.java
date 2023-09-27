package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathHW {

    public static void main(String[] args) {
//instance
        WebDriver driver = new ChromeDriver();

        driver.get(" https://demoqa.com/text-box");
//        maximize the window
        driver.manage().window().maximize();

        WebElement FullName=driver.findElement(By.xpath("//input[@id='userName']"));
        FullName.sendKeys("Jane Doe");

        WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
        Email.sendKeys("Jane.Doe@gmail.com");

        WebElement CurrentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        CurrentAddress.sendKeys("123 Main Street");

        WebElement PermanentAddress=driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        PermanentAddress.sendKeys("123 Main Street");
}}
