package tests;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Registration Form test.
 */
public class NayTest02
        extends TestCase {

    @Test
    public void testThatRegistrationFormIsAccesible() throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "/Users/nme/work/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://demoqa.com/" );

        WebElement registrationLink = driver.findElement( By.linkText( "Registration" ) );
        registrationLink.click();
        Thread.sleep( 2000 );
        assertTrue( "Page is not Registration form", driver.getTitle().equals( "Registration | Demoqa" ) );

        driver.quit();
    }

    @Test
    public void testSimpleRegistration() throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "/Users/nme/work/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://demoqa.com/registration/" );

    }

}
