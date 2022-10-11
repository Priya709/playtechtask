package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


    public class PropertiesPage extends BaseClass {
        WebDriver driver;
        By sorted_order = By.id("sortType");
        By choose_property = By.xpath("//*[@id=\"property-127923215\"]/div/div/div[1]/div/div/div/a/div[1]/div/div[1]/div/img");
        // WebDriver driver;
        public void sortedOrder(){
            WebElement element = driver.findElement(sorted_order);
            Select dropdown = new Select(element);
            dropdown.selectByVisibleText("Newest Listed");
        }


        public void chooseProperty(){
            WebElement element = driver.findElement(choose_property);
            element.click();
        }

    }


