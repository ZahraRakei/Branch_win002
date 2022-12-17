package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {

    public static WebDriver driver;
    public  static final String URL = "https://amazon.com";

//    @BeforeTest
    public void initBrowser(String browser){

       if (browser.toLowerCase().equals("chrome")){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       } else if (browser.toLowerCase().equals("firefox")){
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
       } else if (browser.toLowerCase().equals("edge")){
           WebDriverManager.edgedriver().setup();
           driver = new EdgeDriver();
       }
       driver.get(URL);
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        if (!(driver instanceof FirefoxDriver)){
            driver.quit();
        }
    }
}
