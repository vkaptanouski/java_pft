package by.stqa.pft.addressbook.appmanager;

import by.stqa.pft.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupPage() {
        click(By.xpath("//a[contains(text(),'group page')]"));
    }

    public void submitGroupCreation() {
        click(By.xpath("//input[contains(@value,'Enter information')]"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.xpath("//input[contains(@name,'group_name')]"), groupData.getName());
        type(By.xpath("//textarea[contains(@name,'group_header')]"), groupData.getHeader());
        type(By.xpath("//textarea[contains(@name,'group_footer')]"), groupData.getFooter());
    }

    public void initGroupCreation() {
        click(By.xpath("//input[contains(@value,'New group')]"));
    }

    public void deleteSelectedGroups() {
        click(By.xpath("//input[contains(@value,'Delete group(s)')]"));
    }

    public void selectGroup() {
        click(By.xpath("//input[contains(@name,'selected[]')]"));
    }

    public void initGroupModification() {
        click(By.xpath("//input[contains(@value,'Edit group')]"));
    }

    public void submitGroupModification() {
        click(By.xpath("//input[contains(@value,'Update')]"));
    }
}
