package by.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase{

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void gotoGroupPage() {
        click(By.xpath("//a[contains(text(),'groups')]"));
    }

    public void gotoHomePage() {
        click(By.xpath("//a[contains(text(),'home')]"));
    }
}
