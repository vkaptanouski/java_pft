package by.stqa.pft.addressbook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {

        addContact();
        fillContactForm(new ContactData("Grodno, Sovetskaja, 18", "John", "Smith", "+375336001144"));
        submitContactCreation();
        gotoHomePage();
    }


}
