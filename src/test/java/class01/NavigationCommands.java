package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        //go to google.com
        driver.get("https://www.google.com");
        //max the window
        driver.manage().window().maximize();
        // slow down to observe
        Thread.sleep(2000);
        // go to facebook.com
        driver.navigate().to("https://www.facebook.com");
        //slow down
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        Thread.sleep(2000);
        //go forward
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        //close
        driver.close(); // you can also use drive.quit
    }
}
