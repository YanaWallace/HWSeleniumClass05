package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HWTask01 extends CommonMethods {
    /*   goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
click on start    ,    print the text  "welcome syntax technologies "on console*/

    public static void main(String[] args) {

        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='startButton']")));
        WebElement btn= driver.findElement(By.xpath("//button[@id='startButton']"));
        btn.click();

        WebElement text= driver.findElement(By.xpath("//h4[normalize-space()='Welcome Syntax Technologies']"));
        driverWait.until(ExpectedConditions.textToBePresentInElement(text, "Welcome Syntax Technologies"));
        String message= text.getText();
        System.out.println(message);
    }
}
