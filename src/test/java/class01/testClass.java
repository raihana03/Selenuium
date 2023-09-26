package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of WebDriver
        WebDriver driver = new ChromeDriver();
        // use the driver.get() method
        driver.get("https://www.google.com");
        //maximize window
        driver.manage().window().maximize();
        // get he url of the website
        String currentURL= driver.getCurrentUrl();
        System.out.println("the current url is: "+ currentURL);
        //get title
        String title= driver.getTitle();
       System.out.println("the title of the page is: "+ driver.getTitle());
       // adds wait, delete once done
       Thread.sleep(2000);
        //close the browser
        driver.quit();
    }}