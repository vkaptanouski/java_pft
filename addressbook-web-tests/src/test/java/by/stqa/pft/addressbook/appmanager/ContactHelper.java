package by.stqa.pft.addressbook.appmanager;

import by.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.confirm;

public class ContactHelper extends HelperBase{


    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitContactModification() {
        click(By.xpath("//input[contains(@value,'Update')]"));
    }

    public void submitContactCreation() {
        click(By.xpath("//input[contains(@value,'Enter')]"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.xpath("//input[contains(@name,'firstname')]"), contactData.getFirstName());
        type(By.xpath("//input[contains(@name,'lastname')]"), contactData.getLastName());
        type(By.xpath("//textarea[contains(@name,'address')]"), contactData.getAddress());
        type(By.xpath("//input[contains(@name,'mobile')]"), contactData.getMobilePhone());
    }

    public void addContact() {
        click(By.xpath("//a[contains(text(),'add new')]"));
    }

    public void selectContact() {
        click(By.xpath("//input[contains(@name,'selected[]')]"));
    }

    public void submitContactDeletion() {
        $$x("//input[contains(@name,'selected[]')]").first().click();
        $x("//input[contains(@value,'Delete')]");
        confirm();
    }

    public void editContact() {
        click(By.xpath("//img[contains(@title,'Edit')]"));
    }


}



