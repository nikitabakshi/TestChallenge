package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DataTablePage extends BasePage {

    @FindBy(xpath="//h5[text()='Checkbox']")
    WebElement checkBox;

    @FindBy(xpath="//h5[text()='Checkbox']/..//tbody[@class='p-datatable-tbody']/tr")
    List<WebElement> tableRow;

    @FindBy(xpath=".//td[1]//div[contains(@class,'p-checkbox')]")
    WebElement checkBoxButton;

    @FindBy(xpath=".//td[3]")
    WebElement nameColumn;

    public DataTablePage(WebDriver driver)
    {
        super(driver);

    }

   public void clickonCheckBox(String name)
   {
       scrollintoView(checkBox,driver);
        for(WebElement el : tableRow)
        {
            //System.out.println(nameColumn.getText());
            if(nameColumn.getText().equals(name))
            {
                checkBoxButton.click();
                break;
            }
        }
   }

}
