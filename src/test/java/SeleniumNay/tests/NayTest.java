package SeleniumNay.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

/**
 * Unit test for simple App.
 */
public class NayTest
    extends TestCase {

    public void testGoogleSearch() {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty( "webdriver.chrome.driver", "/path/to/chromedriver" );

        WebDriver driver = new ChromeDriver();
        driver.get( "http://www.google.com/xhtml" );
        //Thread.sleep( 5000 );  // Let the user actually see something!
        WebElement searchBox = driver.findElement( By.name( "q" ) );
        searchBox.sendKeys( "ChromeDriver" );
        searchBox.submit();
        //sleep( 5000 );  // Let the user actually see something!
        driver.quit();
    }
}
