package pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Created by nme on 27/12/17.
 */

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage() {
        System.setProperty( "webdriver.chrome.driver", "/Users/nme/work/chromedriver" );
        driver = new ChromeDriver();
    }

    public void goToPage(String urlToNavigate) {
        driver.get(urlToNavigate);
    }

    public void closePage() {
        driver.close();
        driver.quit();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickRegistrationLink () {
        WebElement registrationLink = driver.findElement( By.linkText( "Registration" ) );
        registrationLink.click();
    }

    public void fillFirstNameField (String username) {
        WebElement firstName = driver.findElement(By.id("name_3_firstname"));
        firstName.sendKeys(username);
    }

    public void fillLastNameField (String surname) {
        WebElement lastName = driver.findElement(By.id("name_3_lastname"));
        lastName.sendKeys(surname);
    }

    public void selectCheckbox (String checkboxValue) {
        WebElement statusCheckBox = driver.findElement(By.cssSelector(checkboxValue));
        statusCheckBox.click();
    }

    public void selectDropdown (String dropDown, String value) {
        Select countrySelector = new Select(driver.findElement(By.id(dropDown)));
        countrySelector.selectByVisibleText(value);
    }
}
