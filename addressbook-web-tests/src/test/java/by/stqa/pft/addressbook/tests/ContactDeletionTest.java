package by.stqa.pft.addressbook.tests;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ContactDeletionTest {

//    @Test
//    public void testContactDeletion() {
//
//        app.getNavigationHelper().gotoHomePage();
//        app.getContactHelper().selectContact();
//        app.getContactHelper().submitContactDeletion();
//
//    }

    @Test
    public void itShouldBePossibleToDeleteContact() {
        Configuration.browser = "chrome";
        open("http://localhost/addressbook/index.php");
        $x("//input[contains(@name,'user')]").val("admin");
        $x("//input[contains(@name,'pass')]").val("secret");
        $x("//input[contains(@value,'Login')]").click();

        $$x("//input[contains(@name,'selected[]')]").first().click();
        $x("//input[contains(@value,'Delete')]").click();
        confirm();
    }
}
