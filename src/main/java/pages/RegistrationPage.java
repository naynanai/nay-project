package pages;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


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
        driver.get( urlToNavigate );
    }

    public void waitSomeSeconds (int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public void closeAndQuitPage() {
        driver.close();
        driver.quit();
    }

    public void RegisterIsSuccesfull () {
        WebElement confirmationMessage = driver.findElement(By.className( "piereg_message" ));
        confirmationMessage.isDisplayed();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickRegistrationLink() {
        WebElement registrationLink = driver.findElement( By.linkText( "Registration" ) );
        registrationLink.click();
    }

    public void clickSubmittButton() {
        WebElement submitButton = driver.findElement( By.name( "pie_submit" ) );
        submitButton.click();
    }

    public void fillFirstNameField(String username) {
        WebElement firstName = driver.findElement( By.id( "name_3_firstname" ) );
        firstName.sendKeys( username );
    }

    public void fillLastNameField(String surname) {
        WebElement lastName = driver.findElement( By.id( "name_3_lastname" ) );
        lastName.sendKeys( surname );
    }

    public void selectCheckbox(String checkboxValue) {
        WebElement statusCheckBox = driver.findElement( By.cssSelector( checkboxValue ) );
        statusCheckBox.click();
    }

    public void selectDropdown(String dropDown, String value) {
        Select countrySelector = new Select( driver.findElement( By.id( dropDown ) ) );
        countrySelector.selectByVisibleText( value );
    }

    public void fillPhoneNumber(String userPhone) {
        WebElement phoneNumber = driver.findElement( By.name( "phone_9" ) );
        phoneNumber.sendKeys( userPhone );
    }

    public void fillUserName(String nickname) {
        WebElement username = driver.findElement( By.name( "username" ) );
        username.sendKeys( nickname );
    }

    public void fillEmail(String userMail) {
        WebElement email = driver.findElement( By.name( "e_mail" ) );
        email.sendKeys( userMail );
    }

    public void fillPassword(String userPassword) {
        WebElement password = driver.findElement( By.name( "password" ) );
        password.sendKeys( userPassword );
    }

    public void confirmPassword(String repeatPassword) {
        WebElement confirmPassword = driver.findElement( By.id( "confirm_password_password_2" ) );
        confirmPassword.sendKeys( repeatPassword );
    }

}
