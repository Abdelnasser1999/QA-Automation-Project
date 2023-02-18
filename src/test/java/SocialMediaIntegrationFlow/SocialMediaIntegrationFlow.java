package SocialMediaIntegrationFlow;

import AddToCartFlow.AddToCartFlowPOM;
import ConfigData.Setup;
import ConfigData.TestData;
import DiscoverFlow.DiscoverFlowPOM;
import SearchFlow.SearchFlowPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static ConfigData.Setup.driver;

public class SocialMediaIntegrationFlow {
    @Test(priority = 1)
    public void CloseAd() {
        Setup.wait.until(ExpectedConditions.elementToBeClickable(DiscoverFlowPOM.getCloseAdButton()));
        DiscoverFlowPOM.getCloseAdButton().click();
    }
    @Test(priority = 2)
    public void verifyFacebookViewIsDisplayed() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getFacebookView().isDisplayed());
    }

    @Test(priority = 3)
    public void verifyTwitterViewIsDisplayed() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getTwitterView().isDisplayed());
    }

    @Test(priority = 4)
    public void verifyPinterestViewIsDisplayed() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getPinterestView().isDisplayed());
    }

    @Test(priority = 5)
    public void verifyInstagramViewIsDisplayed() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getInstagramView().isDisplayed());
    }

    @Test(priority = 6)
    public void verifyYoutubeViewIsDisplayed() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getYoutubeView().isDisplayed());
    }

    @Test(priority = 7)
    public void verifyFacebookViewHasTheRightLink() {
        Assert.assertEquals(SocialMediaIntegrationFlowPOM.getFacebookView().getAttribute("href"),TestData.SocialMediaIntegrationData.FacebookUrl);
    }

    @Test(priority = 8)
    public void verifyTwitterViewHasTheRightLink() {
        Assert.assertEquals(SocialMediaIntegrationFlowPOM.getTwitterView().getAttribute("href"),TestData.SocialMediaIntegrationData.TwitterUrl);
    }

    @Test(priority = 9)
    public void verifyPinterestViewHasTheRightLink() {
        Assert.assertEquals(SocialMediaIntegrationFlowPOM.getPinterestView().getAttribute("href"),TestData.SocialMediaIntegrationData.PinterestUrl);
    }

    @Test(priority = 10)
    public void verifyInstagramViewHasTheRightLink() {
        Assert.assertEquals(SocialMediaIntegrationFlowPOM.getInstagramView().getAttribute("href"),TestData.SocialMediaIntegrationData.InstagramUrl);
    }

    @Test(priority = 11)
    public void verifyYoutubeViewHasTheRightLink() {
        Assert.assertEquals(SocialMediaIntegrationFlowPOM.getYoutubeView().getAttribute("href"),TestData.SocialMediaIntegrationData.YoutubeUrl);
    }
    @Test(priority = 12)
    public void verifyFacebookViewIsClickable() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getFacebookView().isEnabled());
        Setup.driver.manage().deleteAllCookies();
        Actions action = new Actions(Setup.driver);
        action.moveToElement(SocialMediaIntegrationFlowPOM.getFacebookView()).click().build().perform();

    }

    @Test(priority = 13)
    public void verifyTwitterViewIsClickable() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getTwitterView().isEnabled());
        Setup.driver.manage().deleteAllCookies();
        Actions action = new Actions(Setup.driver);
        action.moveToElement(SocialMediaIntegrationFlowPOM.getTwitterView()).click().build().perform();
    }

    @Test(priority = 14)
    public void verifyPinterestViewIsClickable() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getPinterestView().isEnabled());
        Setup.driver.manage().deleteAllCookies();
        Actions action = new Actions(Setup.driver);
        action.moveToElement(SocialMediaIntegrationFlowPOM.getPinterestView()).click().build().perform();
    }

    @Test(priority = 15)
    public void verifyInstagramViewIsClickable() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getInstagramView().isEnabled());
        Setup.driver.manage().deleteAllCookies();
        Actions action = new Actions(Setup.driver);
        action.moveToElement(SocialMediaIntegrationFlowPOM.getInstagramView()).click().build().perform();
    }

    @Test(priority = 16)
    public void verifyYoutubeViewIsClickable() {
        Assert.assertTrue(SocialMediaIntegrationFlowPOM.getYoutubeView().isEnabled());
        Setup.driver.manage().deleteAllCookies();
        Actions action = new Actions(Setup.driver);
        action.moveToElement(SocialMediaIntegrationFlowPOM.getYoutubeView()).click().build().perform();
    }

}
