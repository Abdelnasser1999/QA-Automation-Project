package SocialMediaIntegrationFlow;

import ConfigData.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SocialMediaIntegrationFlowPOM {

    public static WebElement getFacebookView(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"footer\"]/div[5]/div/ul/li[1]"));
    }

    public static WebElement getTwitterView(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"footer\"]/div[5]/div/ul/li[2]/a"));
    }

    public static WebElement getPinterestView(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"footer\"]/div[5]/div/ul/li[3]/a"));
    }

    public static WebElement getYoutubeView(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"footer\"]/div[5]/div/ul/li[4]/a"));
    }

    public static WebElement getInstagramView(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"footer\"]/div[5]/div/ul/li[5]/a"));
    }

}
