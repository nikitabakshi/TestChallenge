package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DataTablePage;

public class DatatableTest extends BaseTest {

    DataTablePage dataTable;


    @Test
    public void verifyclickOnCheckBox()
    {
        dataTable=new DataTablePage(driver);
        driver.get(prop.getProperty("url"));
        dataTable.clickonCheckBox("Blue Band");
    }
}
