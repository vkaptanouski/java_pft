package by.stqa.pft.addressbook.tests;

import by.stqa.pft.addressbook.appmanager.ApplicationManaher;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected final ApplicationManaher app = new ApplicationManaher();

    @BeforeMethod
    public void setUp() throws Exception {

        app.init();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
