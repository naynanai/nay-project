package tests;

import junit.framework.TestCase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


/**
 * Registration Form test.
 */
public class NayTest02 extends TestCase {



    @Test
    public void testThatRegistrationFormIsAccesible() throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "/Users/nme/work/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://demoqa.com/" );

        WebElement registrationLink = driver.findElement( By.linkText( "Registration" ) );
        registrationLink.click();
        Thread.sleep( 2000 );
        assertTrue( "Page is not Registration form", driver.getTitle().equals( "Registration | Demoqa" ) );

        driver.close();
        driver.quit();
    }

    @Test
    public void testSimpleRegistrationSuccessful() throws InterruptedException {

        System.setProperty( "webdriver.chrome.driver", "/Users/nme/work/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.get( "http://demoqa.com/registration/" );

        WebElement firstName = driver.findElement(By.id("name_3_firstname"));
        firstName.sendKeys("Nay");

        WebElement lastName = driver.findElement( By.id( "name_3_lastname" ) );
        lastName.sendKeys("Nanay");

        WebElement statusCheckBox = driver.findElement(By.cssSelector("input[value='divorced']"));
        statusCheckBox.click();

        WebElement hobbyCheckBox = driver.findElement(By.cssSelector("input[value='reading']"));
        hobbyCheckBox.click();

        Select countrySelector = new Select(driver.findElement(By.id("dropdown_7")));
        countrySelector.selectByVisibleText("Argentina");

        Select monthSelector = new Select(driver.findElement(By.id("mm_date_8")));
        monthSelector.selectByVisibleText("12");

        Select daySelector = new Select(driver.findElement(By.id("dd_date_8")));
        daySelector.selectByVisibleText("10");

        Select yearSelector = new Select(driver.findElement(By.id("yy_date_8")));
        yearSelector.selectByVisibleText("1983");

        WebElement phoneNumber = driver.findElement( By.name( "phone_9" ) );
        phoneNumber.sendKeys("0034123456789");

        WebElement username = driver.findElement( By.name( "username" ) );
        username.sendKeys("Natiira de la Pueblas");

        WebElement email = driver.findElement( By.name( "e_mail" ) );
        email.sendKeys("naydelagfgfebles@pueblas.com");

        WebElement password = driver.findElement( By.name( "password" ) );
        password.sendKeys("12345678");

        WebElement confirmPassword = driver.findElement( By.id( "confirm_password_password_2" ) );
        confirmPassword.sendKeys("12345678");

        WebElement submitButton = driver.findElement(By.name( "pie_submit" ));
        submitButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement confirmationMessage = driver.findElement(By.className( "piereg_message" ));
        confirmationMessage.isDisplayed();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.close();
        driver.quit();

    }

}
