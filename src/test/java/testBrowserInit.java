import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testBrowserInit extends Base {

    @Test
    public void testTitles(){

        initBrowser("chrome");
        driver.get(Base.URL);
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
    }

    @Test
    public void testDeals(){
        initBrowser("chrome");
        driver.get(Base.URL);
        WebElement merryDeals = driver.findElement(By.linkText("Very Merry Deals"));
        merryDeals.click();
        Assert.assertEquals(driver.getTitle(), "Amazon.com - Today's Deals");
    }
}
