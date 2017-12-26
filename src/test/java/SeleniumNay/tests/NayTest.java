package SeleniumNay.tests;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class NayTest
    extends TestCase {

    @Test
    public void testGoogleSearch()  {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty( "webdriver.chrome.driver", "/Users/nme/work/chromedriver" );

        WebDriver driver = new ChromeDriver();
        driver.get( "http://www.google.com/xhtml" );
        //Thread.sleep( 5000 );  // Let the user actually see something!
        WebElement searchBox = driver.findElement( By.name( "q" ) );
        searchBox.sendKeys( "ChromeDriver" );
        searchBox.submit();
        //Thread.sleep( 5000 );  // Let the user actually see something!
        driver.quit();
    }
}
