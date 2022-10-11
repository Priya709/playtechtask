package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseClass {
        public WebDriver driver;
        public BaseClass(WebDriver driver){
            this.driver=driver;
        }
        public BaseClass(){

        }

       @Before
        public void setUp() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        public void selectOptionForDropDown(WebElement webElement, String valueToSearch) {
            Select select = new Select(webElement);
            List<WebElement> option = select.getOptions();
            for (WebElement element : option) {
                if (element.getText().contains(valueToSearch)) {
                    element.click();
                    break;
                }
            }
        }

        public WebElement getWebElementWithExplicitWait(WebDriver driver, int timeout, By locator) {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return element;
        }

      //  @After
       // public void tearDown(){
         //   driver.close();
        //}

    }


