package tests;

import base.BaseTest;
import base.WebdriverManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DataTable;

public class DatatableTest extends BaseTest {

    DataTable dataTable;


    @Test
    public void verifyclickOnCheckBox()
    {
        dataTable=new DataTable(driver);
        driver.get(prop.getProperty("url"));
        dataTable.clickonCheckBox("Blue Band");
    }
}
