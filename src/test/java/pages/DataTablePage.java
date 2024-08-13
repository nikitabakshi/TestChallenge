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
    

    public DataTablePage(WebDriver driver)
    {
        super(driver);

    }

   public void clickonCheckBox(String name)
   {
       scrollintoView(checkBox,driver);
        for(WebElement el : tableRow)
        {
            WebElement nameColumn=el.findElement(By.xpath(".//td[3]"));
            System.out.println(nameColumn.getText());
            if(nameColumn.getText().equals(name))
            {
                WebElement checkBoxButton= el.findElement(By.xpath(".//td[1]//div[contains(@class,'p-checkbox')]"));
                checkBoxButton.click();
                break;
            }
        }
   }

}
