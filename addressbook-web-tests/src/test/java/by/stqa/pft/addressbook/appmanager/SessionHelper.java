package by.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void login(String username, String password) {
        type(By.xpath("//input[contains(@name,'user')]"), username);
        type(By.xpath("//input[contains(@name,'pass')]"), password);
        click(By.xpath("//input[contains(@value,'Login')]"));
    }
}
