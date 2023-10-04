package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Navigate to http://35.175.58.98/basic-checkbox-demo.php.
Check the if Checkbox1 is enabled
If Checkbox1 is disabled:
Click on the "enable checkboxes" button.
Verify that Checkbox1 is now enabled.
Click on Checkbox1.
Confirm that Checkbox1 is selected.
 */
public class HW3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("http://35.175.58.98/basic-checkbox-demo.php.");
        driver.manage().window().maximize();

        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        if(!checkBox1.isEnabled()){
            driver.findElement(By.id("enabledcheckbox")).click();
            if (checkBox1.isEnabled()){
                checkBox1.click();
            }
        }
        if(checkBox1.isSelected()){
            Thread.sleep(2000);
            driver.quit();
        }



    }}
