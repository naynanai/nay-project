package tests;

import org.junit.Before;
import org.junit.Test;
import pages.RegistrationPage;

import java.util.Random;

import static org.junit.Assert.assertTrue;

/**
 * Registration Form test.
 */

public class NayTest02  {

    private RegistrationPage registrationPage;

    @Before
    public void initialize() {
        registrationPage = new RegistrationPage();

    }

    @Test
    public void testThatRegistrationFormIsAccessible() throws InterruptedException {

        registrationPage.goToPage("http://demoqa.com/");
        registrationPage.clickRegistrationLink();
        Thread.sleep( 2000 );
        assertTrue( "Page is not Registration form", registrationPage.getTitle().equals( "Registration | Demoqa" ) );

        registrationPage.closeAndQuitPage();
    }

    // * Created randomizer for username
    // * Create randomizer for email
    @Test
    public void testSimpleRegistrationSuccessful() throws InterruptedException {

        registrationPage.goToPage("http://demoqa.com/registration/");

        registrationPage.fillFirstNameField( "Nay" );
        registrationPage.fillLastNameField("Nanai ");
        registrationPage.selectCheckbox("input[value='divorced']" );
        registrationPage.selectCheckbox("input[value='reading']" );
        registrationPage.selectDropdown( "dropdown_7", "Argentina" );
        registrationPage.selectDropdown( "mm_date_8", "12" );
        registrationPage.selectDropdown( "dd_date_8", "10" );
        registrationPage.selectDropdown( "yy_date_8", "1983" );
        registrationPage.fillPhoneNumber( "0034123456789" );
        registrationPage.fillUserName( "Nayuo de la Puebla" );
        registrationPage.fillEmail( "testo+teuiuti@testi.com" );
        registrationPage.fillPassword( "12345678" );
        registrationPage.confirmPassword( "12345678" );
        registrationPage.clickSubmittButton();

        registrationPage.waitSomeSeconds(5);
        registrationPage.RegisterIsSuccesfull();
        registrationPage.closeAndQuitPage();
    }

}
