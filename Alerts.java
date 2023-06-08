package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utils.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";

        openBrowserAndLaunchApplication(url,browser);
        WebElement alert1Btn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alert1Btn.click();

        Thread.sleep(3000);
//        switch the focus of the driver to the alert
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

//        find the other alert button and click on it
        WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
//        to observe
        Thread.sleep(3000);

//        switch to the alert

        Alert confirmationALert2 = driver.switchTo().alert();
        confirmationALert2.dismiss();


    }
    }

