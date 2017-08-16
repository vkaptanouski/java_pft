package by.stqa.pft.addressbook.appmanager;

import by.stqa.pft.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobilePhone());
    }

    /*public void addContact() {
        click(By.linkText("add new"));
    }*/

    public void addContact() {
        click(By.xpath("//div[@id='nav']/ul/li/a[contains(text(),'add new')]"));
    }


    public void selectContact() {
        click(By.xpath("//input[contains(@name,'selected[]')]"));
    }

    public void submitContactDeletion() {
        click(By.xpath("//input[contains(@value,'Delete')]"));
    }


    public void editContact() {
        click(By.xpath("//td[@class='center']/a/img[contains(@title,'Edit')]"));
    }


}



