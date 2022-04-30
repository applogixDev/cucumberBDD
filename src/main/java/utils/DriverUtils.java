package utils;

import org.openqa.selenium.WebElement;

public class DriverUtils
{
    public void navigateToUrl(String url)
    {
        DriverFactory.driver.navigate().to(url);
    }

    public String getPageTitle()
    {
        return DriverFactory.driver.getTitle();
    }

    public String getEleText(WebElement ele)
    {
        return ele.getText();
    }


}
