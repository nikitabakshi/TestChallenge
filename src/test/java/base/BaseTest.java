package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class BaseTest {


    protected Properties prop;
    protected  WebDriver driver;
    protected BaseTest()
    {
        prop=new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties");
            prop.load(fileInputStream);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




    @BeforeMethod
    public void setUp()
    {

       if(!Objects.isNull(prop.getProperty("url")))
       driver= WebdriverManager.getDriver(prop.getProperty("browsername"));

    }


    @AfterMethod
    public void quitBrowser()
    {
        WebdriverManager.quitDriver();
    }



}
