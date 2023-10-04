package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
http://35.175.58.98/no-select-tag-dropdown-demo.php
slect your dream destination from this calander
 */
public class HW5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement dropDown= driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']"));
        dropDown.click();
        Thread.sleep(3000);
        WebElement FrenchPoly= driver.findElement(By.linkText("French Polynesia"));
        FrenchPoly.click();
}}
