package hooks;

import com.relevantcodes.extentreports.ExtentReports;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Juan Castillo
 * @since 06/10/2020
 */
public class Hook {

    public static WebDriver driver;

    @Before
    public void init(){
       // super.set

    }
    @After
    public void close() {
        this.driver.close();
    }



}
