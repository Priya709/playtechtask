package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

    public class HomePage extends BaseClass {
        /* public void setUp() throws InterruptedException {
             WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.rightmove.co.uk/");
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             Thread.sleep(2000);
             driver.findElement(By.xpath(".//button[@class='optanon-allow-all accept-cookies-button']")).click();
             Thread.sleep(2000);
             driver.findElement(By.cssSelector("div#_1oW0JJocRfjq6xXQVELlr7>button:nth-of-type(2)")).click();
         }*/
        // By searchbox = By.xpath("//*[@id=\"_3OuiRnbltQyS534SB4ivLV\"]/div/div/div/div/input");
        By searchbox = By.xpath("//input[@placeholder=e.g. 'York', 'NW3', 'NW3 5TY' or 'Waterloo Station]");
        By for_sale = By.xpath("//button[contains(text(),'For Sale')]");
        public void initializer() {
            BaseClass bs = new BaseClass();
        }
        public void searchBox() {

            driver.findElement(searchbox).sendKeys("EN2");

        }
        public void forSale(){
            driver.findElement(for_sale).click();
        }
    }
