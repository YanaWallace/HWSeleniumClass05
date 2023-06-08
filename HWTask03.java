package class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HWTask03 extends CommonMethods {
    /*   develop a function in common methods to select from dropdown(single select)*/

    public static void dropdownSelector(WebDriver driver, By dropdownLocator, String optionText) {
        Select dropdown = new Select(driver.findElement(dropdownLocator));
        dropdown.selectByVisibleText(optionText);



    }
}
