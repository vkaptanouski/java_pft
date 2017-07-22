package by.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    
    @Test
    public void testContactCreation() {

        app.addContact();
        app.fillContactForm(new ContactData("Grodno, Sovetskaja, 18", "John", "Smith", "+375336001144"));
        app.submitContactCreation();
        app.gotoHomePage();
    }


}
