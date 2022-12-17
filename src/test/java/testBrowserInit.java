import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testBrowserInit extends Base {

    @Test
    public void testTitles(){

        initBrowser("chrome");
        driver.get(Base.URL);
        Assert.assertEquals(driver.getTitle(), "Amazon.com. Spend less. Smile more.");
    }
}
