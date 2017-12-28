package tests;

import org.junit.Before;
import org.junit.Test;
import pages.RegistrationPage;

import static org.junit.Assert.assertTrue;

/**
 * Created by nme on 09/11/17.
 */

public class RegistrationTest {

    private RegistrationPage registrationPage;

    @Before
    public void initialize() {
        registrationPage = new RegistrationPage();
    }

    // TEST DATA
    String pagetitle = "Registration | Demoqa";
    String userName = "User"+(int)(Math.random()*Integer.MAX_VALUE);
    String surname = "Van Damme";
    String status = "input[value='divorced']";
    String hobby = "input[value='reading']";
    String country = "Argentina";
    String month = "12";
    String day = "10";
    String year = "1983";
    String phone = "0034123456789";
    String password = "12345678";
    String emailID = "User"+userName+"@example.com";
    int secondsToWait = 5;

    @Test
    public void testThatRegistrationFormIsAccessible() throws InterruptedException {

        registrationPage.goToPage("http://demoqa.com/");
        registrationPage.clickRegistrationLink();
        registrationPage.waitSomeSeconds(secondsToWait);
        assertTrue( "Page is not Registration form", registrationPage.getTitle().equals( pagetitle ) );

        registrationPage.closeAndQuitPage();
    }

    @Test
    public void testSimpleRegistrationSuccessful() throws InterruptedException {

        registrationPage.goToPage("http://demoqa.com/registration/");

        registrationPage.fillFirstNameField( userName );
        registrationPage.fillLastNameField( surname );
        registrationPage.selectCheckbox( status );
        registrationPage.selectCheckbox( hobby );
        registrationPage.selectDropdown( "dropdown_7", country );
        registrationPage.selectDropdown( "mm_date_8", month );
        registrationPage.selectDropdown( "dd_date_8", day );
        registrationPage.selectDropdown( "yy_date_8", year );
        registrationPage.fillPhoneNumber( phone );
        registrationPage.fillUserName(userName);
        registrationPage.fillEmail(emailID);
        registrationPage.fillPassword( password );
        registrationPage.confirmPassword( password );
        registrationPage.clickSubmittButton();
        registrationPage.waitSomeSeconds(secondsToWait);
        registrationPage.RegisterIsSuccesfull();
        registrationPage.closeAndQuitPage();
    }

}