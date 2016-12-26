package com.inmarkit.qa.framework.mh.model;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPageModel extends MHModelBase{

    private WebElement dailyNewUsersLink = null;
    private WebElement dailyUsersTotalLink = null;
    private WebElement dailyItemCommentsLink = null;
    private WebElement dailyOfferCommentsLink = null;
    private WebElement dailySharedItemsLink = null;
    private WebElement dailySavedItemsLink = null;
    private WebElement dailyCommentsLink = null;
    private WebElement dailySStreamClickLink = null;
    private WebElement usageDistributionLink = null;
    private WebElement demoByRegionLink = null;
    private WebElement demoByStateLink = null;
    private WebElement demoByCityLink = null;    
    private WebElement demoByZipLink = null;
    private WebElement savedItemsLink = null;
    private WebElement sentItemGroupByLink = null;
    private WebElement sharedItemGroupByLink = null;
    private WebElement savedOffersLink = null;
    private WebElement sentOfferGroupByLink = null;
    private WebElement sharedOfferGroupByLink = null;
    private WebElement totalItemInFeedLink = null;
    private WebElement offerInFeedLink = null;
    private WebElement consumerEngagementsLink = null;
    private WebElement consumerInfluenceLink = null;
    private WebElement sharedTextNCommentsLink = null;
    private WebElement savedTextLink = null;
    private WebElement itemPopularityLink = null;
    private WebElement mostPopularTagsLink = null;
    private WebElement usersSavedItemsLink = null;
    private WebElement usersSharedItemsLink = null;
    private WebElement usersSharedOffersLink = null;
    private List<WebElement> dailyClicksOnLinksData = null;
    private List<WebElement> usageDistributionData = null;
    private List<WebElement> demographicRagionData = null;
    private List<WebElement> demographicStateData = null;
    private List<WebElement> demographicCityData = null;
    private List<WebElement> demographicZipData = null;
    private List<WebElement> savedItemsData = null;
    private List<WebElement> sentItemsGroupByData = null;
    private List<WebElement> sharedItemsGroupByData = null;
    private List<WebElement> savedOffersData = null;
    private List<WebElement> sentOffersGroupByData = null;
    private List<WebElement> sharedOffersGroupByData = null;
    private List<WebElement> totalItemData = null;
    private List<WebElement> totaOfferData = null;
    private List<WebElement> consumerEngagementsData = null;
    private List<WebElement> consumerInfluenceData = null;
    private List<WebElement> sharedTextAndCommentsData = null;
    private List<WebElement> SavedTextData = null;
    private List<WebElement> ItemPopularityData = null;
    private List<WebElement> mostPopularTagData = null;
    private List<WebElement> usersSavedItemsData = null;
    private List<WebElement> usersSharedItemsData = null;
    private List<WebElement> usersSharedOffersData = null;
    private WebElement usageCountBySocialName = null;
    private WebElement usagePercentageBySocialName = null;
    private WebElement demoRegionCountByAge = null;
    private WebElement demoRegionByAge = null;
    private WebElement demoStateCount = null;
    private WebElement demoStateByAge = null;
    private WebElement demoCityCount = null;
    private WebElement demoCityByAge = null;
    private WebElement demoZipCount = null;
    private WebElement demoZipByAge = null;
    private WebElement savedItemName = null;
    private WebElement savedItemCount = null;
    private WebElement sentItemGroupByName = null;
    private WebElement sentItemGroupByCount = null;
    private WebElement sentItemGroupByTarget = null;
    private WebElement sharedItemGroupByName = null;
    private WebElement sharedItemGroupByCount = null;
    private WebElement sharedItemGroupBySocial = null;
    private WebElement savedOfferCountByName = null;
    private WebElement savedOfferIMICByName = null;
    private WebElement sentOfferGroupByIMIC = null;
    private WebElement sentOfferGroupByCount = null;
    private WebElement sentOfferGroupByTarget = null;
    private WebElement sharedOfferGroupByCount = null;
    private WebElement sharedOfferGroupBySocial = null;
    private WebElement sharedOfferGroupByName = null;
    private WebElement totalItemCount = null;
    private WebElement totalItemName = null;
    private WebElement consumerEngagementEmail = null;
    private WebElement consumerEngagementPoints = null;
    private WebElement consumerInfluenceEmail = null;
    private WebElement consumerInfluencePoints = null;
    private WebElement popularItemName = null;
    private WebElement popularItemCount = null;
    private WebElement popularTagItemname = null;
    private WebElement popularTagTagname = null;
    private WebElement popularTagCount = null;
    private WebElement usersSavedItemDate = null;
    private WebElement usersSavedItemName = null;
    private WebElement usersSavedItemUid = null;
    private WebElement usersSharedItemDate = null;
    private WebElement usersSharedItemName = null;
    private WebElement usersSharedItemNetwork = null;
    private WebElement usersSharedItemUid = null;
    private WebElement usersSharedOffersDate = null;
    private WebElement usersSharedOffersName = null;
    private WebElement usersSharedOffersNetwork = null;
    private WebElement usersSharedOffersUid = null;
    
    private WebElement userTextbox = null;
    private WebElement filterButton = null;
    private WebElement downloadCsvFormatLink = null;
    
    public ReportsPageModel(WebDriver driver) {
        super(driver);
        // TODO Auto-generated constructor stub
    }
    
    public WebElement userTextbox(){
        userTextbox = driver.findElement(By.id("report_user"));
        return userTextbox;
    }
    
    public WebElement filterButton(){
        filterButton = driver.findElement(By.id("report_run"));
        return filterButton;
    }
    
    public WebElement downloadCsvFormatLink(){
        downloadCsvFormatLink = driver.findElement(By.xpath("//div[@class='report_container']/a[@class='download']"));
        return downloadCsvFormatLink;
    }
    
    public WebElement usersSharedOffersDate(String imic){
        usersSharedOffersDate = driver.findElement(By.xpath("//table[@class='shared_user_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return usersSharedOffersDate;
    }
        
    public WebElement usersSharedOffersName(String imic){
        usersSharedOffersName = driver.findElement(By.xpath("//table[@class='shared_user_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return usersSharedOffersName;
    }
    
    public WebElement usersSharedOffersNetwork(String imic){
        usersSharedOffersNetwork = driver.findElement(By.xpath("//table[@class='shared_user_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[4]"));
        return usersSharedOffersNetwork;
    }
    
    public WebElement usersSharedOffersUid(String imic){
        usersSharedOffersUid = driver.findElement(By.xpath("//table[@class='shared_user_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[5]"));
        return usersSharedOffersUid;
    }
        
    public WebElement usersSharedItemDate(String imic){
        usersSharedItemDate = driver.findElement(By.xpath("//table[@class='shared_user_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return usersSharedItemDate;
    }
    
    public WebElement usersSharedItemName(String uid){
        usersSharedItemName = driver.findElement(By.xpath("//table[@class='shared_user_items']" +
                                            "//td[contains(text(), '"+ uid +"')]/../td[2]"));
        return usersSharedItemName;
    }
    
    public WebElement usersSharedItemNetwork(String uid){
        usersSharedItemNetwork = driver.findElement(By.xpath("//table[@class='shared_user_items']" +
                                            "//td[contains(text(), '"+ uid +"')]/../td[4]"));
        return usersSharedItemNetwork;
    }
    
    public WebElement usersSharedItemIMIC(String uid){
        usersSharedItemUid = driver.findElement(By.xpath("//table[@class='shared_user_items']" +
                                            "//td[contains(text(), '"+ uid +"')]/../td[4]"));
        return usersSharedItemUid;
    }
    
    public WebElement usersSavedItemDate(String uid){
        usersSavedItemDate = driver.findElement(By.xpath("//table[@class='saved_user_items']" +
                                            "//td[contains(text(), '"+ uid +"')]/../td[1]"));
        return usersSavedItemDate;
    }
    
    public WebElement usersSavedItemName(String uid){
        usersSavedItemName = driver.findElement(By.xpath("//table[@class='saved_user_items']" +
                                            "//td[contains(text(), '"+ uid +"')]/../td[2]"));
        return usersSavedItemName;
    }
    
    public WebElement usersSavedItemIMIC(String uid){
        usersSavedItemUid = driver.findElement(By.xpath("//table[@class='saved_user_items']" +
                                            "//td[contains(text(), '"+ uid +"')]/../td[3]"));
        return usersSavedItemUid;
    }
    
    public WebElement popularTagCount(String imic){
        popularTagCount = driver.findElement(By.xpath("//table[@class='tag_popularity_top_10']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[4]"));
        return popularTagCount;
    }
    
    public WebElement popularTagTagname(String imic){
        popularTagTagname = driver.findElement(By.xpath("//table[@class='tag_popularity_top_10']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[3]"));
        return popularTagTagname;
    }
    
    public WebElement popularTagItemname(String imic){
        popularTagItemname = driver.findElement(By.xpath("//table[@class='tag_popularity_top_10']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return popularTagItemname;
    }
    
    public WebElement popularItemName(String imic){
        popularItemName = driver.findElement(By.xpath("//table[@class='item_popularity']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return popularItemName;
    }
    
    public WebElement popularItemCount(String imic){
        popularItemCount = driver.findElement(By.xpath("//table[@class='item_popularity']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[3]"));
        return popularItemCount;
    }
    
    public WebElement consumerInfluenceEmail(String fname, String lname){
        consumerInfluenceEmail = driver.findElement(By.xpath("//table[@class='influence_point']" +
                "//td[contains(text(), '"+ fname +"')]/../td[contains(text(),'"+ lname +"')]/../td[4]"));
        return consumerInfluenceEmail;
    }
    
    public WebElement consumerInfluencePoints(String fname, String lname){
        consumerInfluencePoints = driver.findElement(By.xpath("//table[@class='influence_point']" +
                "//td[contains(text(), '"+ fname +"')]/../td[contains(text(),'"+ lname +"')]/../td[5]"));
        return consumerInfluencePoints;
    }
    
    public WebElement consumerEngagementEmail(String fname, String lname){
        consumerEngagementEmail = driver.findElement(By.xpath("//table[@class='engagement_point']" +
                "//td[contains(text(), '"+ fname +"')]/../td[contains(text(),'"+ lname +"')]/../td[4]"));
        return consumerEngagementEmail;
    }
    
    public WebElement consumerEngagementPoints(String fname, String lname){
        consumerEngagementPoints = driver.findElement(By.xpath("//table[@class='engagement_point']" +
                "//td[contains(text(), '"+ fname +"')]/../td[contains(text(),'"+ lname +"')]/../td[5]"));
        return consumerEngagementPoints;
    }
    
    
    public WebElement totalItemCount(String imic){
        totalItemCount = driver.findElement(By.xpath("//table[@class='total_feed_item']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return totalItemCount;
    }
    
    public WebElement totalItemName(String imic){
        totalItemName = driver.findElement(By.xpath("//table[@class='total_feed_item']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return totalItemName;
    }
    
    public WebElement sharedOfferGroupByName(String imic){
        sharedOfferGroupByName = driver.findElement(By.xpath("//table[@class='shared_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return sharedOfferGroupByName;
    }
    
    public WebElement sharedOfferGroupByImic(String offername, String network){
        sharedOfferGroupByCount = driver.findElement(By.xpath("//table[@class='shared_offers']" +
                "//td[contains(text(), '"+offername+"')]/../td[contains(text(), '"+network+"')]/../td[4]"));
        return sharedOfferGroupByCount;
    }
    
    public WebElement sharedOfferGroupByCount(String offername, String network){
        sharedOfferGroupByCount = driver.findElement(By.xpath("//table[@class='shared_offers']" +
                "//td[contains(text(), '"+offername+"')]/../td[contains(text(), '"+network+"')]/../td[2]"));
        return sharedOfferGroupByCount;
    }
        
    public WebElement sentOfferGroupByTarget(String imic){
        sentOfferGroupByTarget = driver.findElement(By.xpath("//table[@class='sent_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[3]"));
        return sentOfferGroupByTarget;
    }
    
    public WebElement sentOfferGroupByName(String imic){
        sentOfferGroupByCount = driver.findElement(By.xpath("//table[@class='sent_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return sentOfferGroupByCount;
    }
    
    public WebElement sentOfferGroupByCount(String imic){
        sentOfferGroupByIMIC = driver.findElement(By.xpath("//table[@class='sent_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return sentOfferGroupByIMIC;
    }
        
    
    public WebElement savedOfferName(String imic){
        savedOfferIMICByName = driver.findElement(By.xpath("//table[@class='saved_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return savedOfferIMICByName;
    }
    
    public WebElement savedOfferCount(String imic){
        savedOfferCountByName = driver.findElement(By.xpath("//table[@class='saved_offers']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return savedOfferCountByName;
    }
    
    public WebElement sharedItemGroupBySocial(String imic){
        sharedItemGroupBySocial = driver.findElement(By.xpath("//table[@class='shared_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[3]"));
        return sharedItemGroupBySocial;
    }
    
    public WebElement sharedItemGroupByName(String imic){
        sharedItemGroupByName = driver.findElement(By.xpath("//table[@class='shared_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return sharedItemGroupByName;
    }
    
    public WebElement sharedItemGroupByCount(String imic){
        sharedItemGroupByCount = driver.findElement(By.xpath("//table[@class='shared_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return sharedItemGroupByCount;
    }
    
    
    public WebElement sentItemGroupByTarget(String imic){
        sentItemGroupByTarget = driver.findElement(By.xpath("//table[@class='sent_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[3]"));
        return sentItemGroupByTarget;
    }
    
    public WebElement sentItemGroupByCount(String imic){
        sentItemGroupByCount = driver.findElement(By.xpath("//table[@class='sent_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return sentItemGroupByCount;
    }
    
    public WebElement sentItemGroupByName(String imic){
        sentItemGroupByName = driver.findElement(By.xpath("//table[@class='sent_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return sentItemGroupByName;
    }
    
    public WebElement savedItemCount(String imic){
        savedItemCount = driver.findElement(By.xpath("//table[@class='saved_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[2]"));
        return savedItemCount;
    }
    
    public WebElement savedItemName(String imic){
        savedItemName = driver.findElement(By.xpath("//table[@class='saved_items']" +
                                            "//td[contains(text(), '"+ imic +"')]/../td[1]"));
        return savedItemName;
    }
    
    public WebElement demoZipByAge(String age){
        demoZipByAge = driver.findElement(By.xpath("//table[@class='demo_by_zip']" +
                                            "//td[contains(text(), '"+ age +"')]/../td[3]"));
        return demoZipByAge;
    }
    
    public WebElement demoZipCount(String age, String zip){
        demoZipCount = driver.findElement(By.xpath("//table[@class='demo_by_city']" +
                    "//td[contains(text(), '"+ age +"')]/../td[contains(text(), '"+ zip +"')]/../td[2]"));
        return demoZipCount;
    }
    
    public WebElement demoCityByAge(String age){
        demoCityByAge = driver.findElement(By.xpath("//table[@class='demo_by_city']" +
                                            "//td[contains(text(), '"+ age +"')]/../td[3]"));
        return demoCityByAge;
    }
    
    public WebElement demoCityCount(String age, String city){
        demoCityCount = driver.findElement(By.xpath("//table[@class='demo_by_city']" +
                    "//td[contains(text(), '"+ age +"')]/../td[contains(text(), '"+ city +"')]/../td[2]"));
        return demoCityCount;
    }
    
    public WebElement demoStateByAge(String age){
        demoStateByAge = driver.findElement(By.xpath("//table[@class='demo_by_state']" +
                                            "//td[contains(text(), '"+ age +"')]/../td[3]"));
        return demoStateByAge;
    }
    
    public WebElement demoStateCount(String age, String state){
        demoStateCount = driver.findElement(By.xpath("//table[@class='demo_by_state']" +
                    "//td[contains(text(), '"+ age +"')]/../td[contains(text(), '"+ state +"')]/../td[2]"));
        return demoStateCount;
    }
    
    public WebElement demoRegionByAge(String age){
        demoRegionByAge = driver.findElement(By.xpath("//table[@class='demo_by_region']" +
                                            "//td[contains(text(), '"+ age +"')]/../td[3]"));
        return demoRegionByAge;
    }
    
    public WebElement demoRegionCountByAge(String age){
        demoRegionCountByAge = driver.findElement(By.xpath("//table[@class='demo_by_region']" +
                                            "//td[contains(text(), '"+ age +"')]/../td[2]"));
        return demoRegionCountByAge;
    }
    
    public WebElement usagePercentageBySocialName(String socialName){
        usagePercentageBySocialName = driver.findElement(By.xpath("//table[@class='users_social_distribution']" +
                                            "//td[contains(text(), '"+ socialName +"')]/../td[3]"));
        return usagePercentageBySocialName;
    }
    
    public WebElement usageCountBySocialName(String socialName){
        usageCountBySocialName = driver.findElement(By.xpath("//table[@class='users_social_distribution']" +
                                                    "//td[contains(text(), '"+ socialName +"')]/../td[2]"));
        return usageCountBySocialName;
    }
    
    public List<WebElement> dailyClicksOnLinksData(){
        dailyClicksOnLinksData = driver.findElements(By.xpath("//html/body/table/tbody/tr/td"));
        return dailyClicksOnLinksData;
    }
    
    public List<WebElement> usageDistributionData(){
        usageDistributionData = driver.findElements(By.xpath("//table[@class= 'users_social_distribution']//tr/td"));
        return usageDistributionData;
    }
    
    
    public List<WebElement> demographicRegionData(){
        demographicRagionData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return demographicRagionData;
    }
    
    public List<WebElement> demographicStateData(){
        demographicStateData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return demographicStateData;
    }
    
    public List<WebElement> demographicCityData(){
        demographicCityData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return demographicCityData;
    }
    
    public List<WebElement> demographicZipData(){
        demographicZipData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return demographicZipData;
    }
    
    public List<WebElement> savedItemsData(){
        savedItemsData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return savedItemsData;
    }
    
    public List<WebElement> sentItemsGroupByData(){
        sentItemsGroupByData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return sentItemsGroupByData;
    }
    
    public List<WebElement> sharedItemsGroupByData(){
        sharedItemsGroupByData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return sharedItemsGroupByData;
    }
    
    public List<WebElement> savedOffersData(){
        savedOffersData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return savedOffersData;
    }
    
    public List<WebElement> sentOffersGroupByData(){
        sentOffersGroupByData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return sentOffersGroupByData;
    }
    
    public List<WebElement> sharedOffersGroupByData(){
        sharedOffersGroupByData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return sharedOffersGroupByData;
    }
    
    public List<WebElement> totalItemData(){
        totalItemData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return totalItemData;
    }
    
    public List<WebElement> totaOfferData(){
        totaOfferData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return totaOfferData;
    }
    
    public List<WebElement> consumerEngagementsData(){
        consumerEngagementsData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return consumerEngagementsData;
    }
    
    public List<WebElement> consumerInfluenceData(){
        consumerInfluenceData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return consumerInfluenceData;
    }
    
    public List<WebElement> sharedTextAndCommentsData(){
        sharedTextAndCommentsData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return sharedTextAndCommentsData;
    }
    
    public List<WebElement> SavedTextData(){
        SavedTextData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return SavedTextData;
    }
    
    public List<WebElement> ItemPopularityData(){
        ItemPopularityData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return ItemPopularityData;
    }
    
    public List<WebElement> mostPopularTagData(){
        mostPopularTagData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return mostPopularTagData;
    }
    
    public List<WebElement> usersSavedItemsData(){
        usersSavedItemsData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return usersSavedItemsData;
    }
    
    public List<WebElement> usersSharedItemsData(){
        usersSharedItemsData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return usersSharedItemsData;
    }
    
    public List<WebElement> usersSharedOffersData(){
        usersSharedOffersData = driver.findElements(By.xpath("//html/body/table//tr/td"));
        return usersSharedOffersData;
    }
    
    public WebElement dailyNewUsersLink(){
        dailyNewUsersLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[1]"));
        return dailyNewUsersLink;
    }
    
    public WebElement dailyUsersTotalLink(){
        dailyUsersTotalLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[2]"));
        return dailyUsersTotalLink;
    }
    
    public WebElement dailyItemCommentsLink(){
        dailyItemCommentsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[3]"));
        return dailyItemCommentsLink;
    }
    
    public WebElement dailyOfferCommentsLink(){
        dailyOfferCommentsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[4]"));
        return dailyOfferCommentsLink;
    }
    
    public WebElement dailySharedItemsLink(){
        dailySharedItemsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[5]"));
        return dailySharedItemsLink;
    }
    
    public WebElement dailySavedItemsLink(){
        dailySavedItemsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[6]"));
        return dailySavedItemsLink;
    }
    
    public WebElement dailyCommentsLink(){
        dailyCommentsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[7]"));
        return dailyCommentsLink;
    }
    
    public WebElement dailySStreamClickLink(){
        dailySStreamClickLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[8]"));
        return dailySStreamClickLink;
    }
    
    public WebElement usageDistributionLink(){
        usageDistributionLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[9]"));
        return usageDistributionLink;
    }
    
    public WebElement demoByRegionLink(){
        demoByRegionLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[10]"));
        return demoByRegionLink;
    }
    
    public WebElement demoByStateLink(){
        demoByStateLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[11]"));
        return demoByStateLink;
    }
    
    public WebElement demoByCityLink(){
        demoByCityLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[12]"));
        return demoByCityLink;
    }
    
    
    
    public WebElement demoByZipLink(){
        demoByZipLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[13]"));
        return demoByZipLink;
    }
    
    public WebElement savedItemsLink(){
        savedItemsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[14]"));
        return savedItemsLink;
    }
    
    public WebElement sentItemGroupByLink(){
        sentItemGroupByLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[15]"));
        return sentItemGroupByLink;
    }
    
    public WebElement sharedItemGroupByLink(){
        sharedItemGroupByLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[16]"));
        return sharedItemGroupByLink;
    }
    
    public WebElement savedOffersLink(){
        savedOffersLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[17]"));
        return savedOffersLink;
    }
    
    public WebElement sentOfferGroupByLink(){
        sentOfferGroupByLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[18]"));
        return sentOfferGroupByLink;
    }
    
    public WebElement sharedOfferGroupByLink(){
        sharedOfferGroupByLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[19]"));
        return sharedOfferGroupByLink;
    }
    
    public WebElement totalItemInFeedLink(){
        totalItemInFeedLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[20]"));
        return totalItemInFeedLink;
    }
    
    public WebElement offerInFeedLink(){
        offerInFeedLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[21]"));
        return offerInFeedLink;
    }
    
    public WebElement consumerEngagementsLink(){
        consumerEngagementsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[22]"));
        return consumerEngagementsLink;
    }
    
    public WebElement consumerInfluenceLink(){
        consumerInfluenceLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[23]"));
        return consumerInfluenceLink;
    }
    
    public WebElement sharedTextNCommentsLink(){
        sharedTextNCommentsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[24]"));
        return sharedTextNCommentsLink;
    }
    
    public WebElement savedTextLink(){
        savedTextLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[25]"));
        return savedTextLink;
    }
    
    public WebElement itemPopularityLink(){
        itemPopularityLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[26]"));
        return itemPopularityLink;
    }
    
    public WebElement mostPopularTagsLink(){
        mostPopularTagsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[27]"));
        return mostPopularTagsLink;
    }
    
    public WebElement usersSavedItemsLink(){
        usersSavedItemsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[28]"));
        return usersSavedItemsLink;
    }
    
    public WebElement usersSharedItemsLink(){
        usersSharedItemsLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[29]"));
        return usersSharedItemsLink;
    }
    
    public WebElement usersSharedOffersLink(){
        usersSharedOffersLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[30]"));
        return usersSharedOffersLink;
    }
    
    public WebElement dailyNewUsers1(){
        dailyNewUsersLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[1]"));
        return dailyNewUsersLink;
    }
    
    public WebElement dailyNewUsers2(){
        dailyNewUsersLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[1]"));
        return dailyNewUsersLink;
    }
    
    public WebElement dailyNewUsers3(){
        dailyNewUsersLink = driver.findElement(By.xpath("//div[@class='lcol_report']/ul/li[1]"));
        return dailyNewUsersLink;
    }

}