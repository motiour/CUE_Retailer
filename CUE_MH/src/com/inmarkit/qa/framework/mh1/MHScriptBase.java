package com.inmarkit.qa.framework.mh1;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.inmarkit.qa.framework.mh.controller.AboutInMarkitPageController;
import com.inmarkit.qa.framework.mh.controller.AssortmentManagerPageController;
import com.inmarkit.qa.framework.mh.controller.AttachMultimediaPageController;
import com.inmarkit.qa.framework.mh.controller.ContactUsPageController;
import com.inmarkit.qa.framework.mh.controller.CorporateInfoPageController;
import com.inmarkit.qa.framework.mh.controller.CreateAssortmentAssignItemPageController;
import com.inmarkit.qa.framework.mh.controller.CreateAssortmentReviewSavePageController;
import com.inmarkit.qa.framework.mh.controller.CreateAssortmentSelectStorePageController;
import com.inmarkit.qa.framework.mh.controller.CreateOfferStep1PageController;
import com.inmarkit.qa.framework.mh.controller.CreateOfferStep2PageController;
import com.inmarkit.qa.framework.mh.controller.CreateOfferStep3PageController;
import com.inmarkit.qa.framework.mh.controller.CreateOfferStep4PageController;
import com.inmarkit.qa.framework.mh.controller.CreateOfferStep5PageController;
import com.inmarkit.qa.framework.mh.controller.CreateOfferStep6PageController;
import com.inmarkit.qa.framework.mh.controller.CreateRegionPageController;
import com.inmarkit.qa.framework.mh.controller.EditAccountPageController;
import com.inmarkit.qa.framework.mh.controller.EditAssortmentAssignItemPageController;
import com.inmarkit.qa.framework.mh.controller.EditAssortmentReviewSavePageController;
import com.inmarkit.qa.framework.mh.controller.EditCorpInfoPageController;
import com.inmarkit.qa.framework.mh.controller.EditOfferStep1PageController;
import com.inmarkit.qa.framework.mh.controller.EditOfferStep2PageController;
import com.inmarkit.qa.framework.mh.controller.EditOfferStep3PageController;
import com.inmarkit.qa.framework.mh.controller.EditOfferStep4PageController;
import com.inmarkit.qa.framework.mh.controller.EditOfferStep5PageController;
import com.inmarkit.qa.framework.mh.controller.EditOfferStep6PageController;
import com.inmarkit.qa.framework.mh.controller.ForgotPasswordPageController;
import com.inmarkit.qa.framework.mh.controller.ItemManagerPageController;
import com.inmarkit.qa.framework.mh.controller.LoadExistingRegionPageController;
import com.inmarkit.qa.framework.mh.controller.MHHelpPageController;
import com.inmarkit.qa.framework.mh.controller.MHHomePageController;
import com.inmarkit.qa.framework.mh.controller.MHLoginPageController;
import com.inmarkit.qa.framework.mh.controller.MHProfileTabPageController;
import com.inmarkit.qa.framework.mh.controller.MultimediaManagerPageController;
import com.inmarkit.qa.framework.mh.controller.NewUserFormPageController;
import com.inmarkit.qa.framework.mh.controller.OfferDetailPageController;
import com.inmarkit.qa.framework.mh.controller.OfferManagerPageController;
import com.inmarkit.qa.framework.mh.controller.PrivacyPolicyPageController;
import com.inmarkit.qa.framework.mh.controller.ProfileAccountInfoPageController;
import com.inmarkit.qa.framework.mh.controller.RegionManagerPageController;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;


public class MHScriptBase {
	

	public WebDriver driver = null;
	

	
    @Before
    public void beforeTest() throws SecurityException, IOException {

 
    	 System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         driver.manage().window().maximize();
         driver.get("https://business.cueconnect.com/");
        
   
         

    	/*
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("browser.cache.disk.enable", "false");
            driver = new FirefoxDriver(profile);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.navigate().to("https://business.cueconnect.com/");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            
           */
         

    }
    
    
    public void delayFor(int time) {

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @After
    public void afterTest() {
    	
    
    	driver.close();
    }
 
    
    

public void hoverItem(WebElement element) {
	Actions actions = new Actions(driver);
	actions.moveToElement(element);
	actions.perform();
}

public void hoverItem(By by) {
	WebElement element = driver.findElement(by);
	hoverItem(element);
}

public void hoverItemEx(WebElement element) {
	Locatable hoverItem = (Locatable) element;
	Mouse mouse = ((HasInputDevices) driver).getMouse();
	mouse.mouseMove(hoverItem.getCoordinates());
}

public void hoverItemEx(By by) {
	WebElement element = driver.findElement(by);
	hoverItemEx(element);
}


public void mouseClick(WebElement element) {
    String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'click',true,false );"
                + "fireOnThis.dispatchEvent(evObj);";
    ((JavascriptExecutor) driver).executeScript(code, element);
}





public void mouseOver(WebElement element) {
    String code = "var fireOnThis = arguments[0];"
                + "var evObj = document.createEvent('MouseEvents');"
                + "evObj.initEvent( 'mouseover', true, true );"
                + "fireOnThis.dispatchEvent(evObj);";
    ((JavascriptExecutor) driver).executeScript(code, element);
}


	

	
	public MHLoginPageController mhLoginPage() {
		return new MHLoginPageController(driver);
	}
	
	
	public CorporateInfoPageController corporateInfoPage() {
		return new CorporateInfoPageController(driver);
	}
	
	public MHHomePageController mhHomePage() {
		return new MHHomePageController(driver);
	}
	
	
	
	
	
	public MHLoginPageController mhLoginPanel() {
		return new MHLoginPageController(driver);
	}

	
	
	public ProfileAccountInfoPageController accountInfoPage() {
		return new ProfileAccountInfoPageController(driver);
	}
	
	public EditAccountPageController editAccountPage() {
		return new EditAccountPageController(driver);
	}
	
	
	
	
	public EditCorpInfoPageController editCorpInfoPage() {
		return new EditCorpInfoPageController(driver);
	}
		
	
	public MHProfileTabPageController profileTab() {
		return new MHProfileTabPageController(driver);
	}
	
	
	
	public RegionManagerPageController regionManagerPage() {
		return new RegionManagerPageController(driver);
	}

	public LoadExistingRegionPageController loadRegionPage() {
		return new LoadExistingRegionPageController(driver);
	}

	public CreateRegionPageController createRegionPage() {
		return new CreateRegionPageController(driver);
	}

	public ItemManagerPageController itemManagerPage() {
		return new ItemManagerPageController(driver);
	}
	

	public AttachMultimediaPageController attachMultimediaPage() {
		return new AttachMultimediaPageController(driver);
	}

	public AssortmentManagerPageController assortmentManagerPage() {
		return new AssortmentManagerPageController(driver);
	}
	
	public CreateAssortmentSelectStorePageController createAssSelectStorePage() {
		return new CreateAssortmentSelectStorePageController(driver);
	}

	public CreateAssortmentAssignItemPageController createAssAssignItemPage() {
		return new CreateAssortmentAssignItemPageController(driver);
	}
	
	public CreateAssortmentReviewSavePageController createAssReviewSavePage() {
		return new CreateAssortmentReviewSavePageController(driver);
	}

	public EditAssortmentAssignItemPageController editAssAssignItemPage() {
		return new EditAssortmentAssignItemPageController(driver);
	}
	
	public EditAssortmentReviewSavePageController editAssReviewSavePage() {
		return new EditAssortmentReviewSavePageController(driver);
	}

	public OfferManagerPageController offerManagerPage() {
		return new OfferManagerPageController(driver);
	}
	
	public CreateOfferStep1PageController createOfferStep1Page() {
		return new CreateOfferStep1PageController(driver);
	}

	public CreateOfferStep2PageController createOfferStep2Page() {
		return new CreateOfferStep2PageController(driver);
	}
	
	public CreateOfferStep3PageController createOfferStep3Page() {
		return new CreateOfferStep3PageController(driver);
	}
	
	public CreateOfferStep4PageController createOfferStep4Page() {
		return new CreateOfferStep4PageController(driver);
	}
	
	public CreateOfferStep5PageController createOfferStep5Page() {
		return new CreateOfferStep5PageController(driver);
	}
	
	public CreateOfferStep6PageController createOfferStep6Page() {
		return new CreateOfferStep6PageController(driver);
	}
	
	public EditOfferStep1PageController editOfferStep1Page() {
		return new EditOfferStep1PageController(driver);
	}
	
	public EditOfferStep2PageController editOfferStep2Page() {
		return new EditOfferStep2PageController(driver);
	}
	
	public EditOfferStep3PageController editOfferStep3Page() {
		return new EditOfferStep3PageController(driver);
	}
	
	public EditOfferStep4PageController editOfferStep4Page() {
		return new EditOfferStep4PageController(driver);
	}
	
	public EditOfferStep5PageController editOfferStep5Page() {
		return new EditOfferStep5PageController(driver);
	}
	
	public EditOfferStep6PageController editOfferStep6Page() {
		return new EditOfferStep6PageController(driver);
	}

	
	public NewUserFormPageController newUserFormPage() {
		return new NewUserFormPageController(driver);
	}
	
	public ContactUsPageController contactUsPage() {
		return new ContactUsPageController(driver);
	}

	
	public MHHelpPageController mhHelpPage() {
		return new MHHelpPageController(driver);
	}
	
	public AboutInMarkitPageController aboutInMarkitPage() {
		return new AboutInMarkitPageController(driver);
	}
	
	
	
	public PrivacyPolicyPageController privacyPolicyPage() {
		return new PrivacyPolicyPageController(driver);
	}
	
	
	
	public ForgotPasswordPageController forgotPasswordPage() {
		return new ForgotPasswordPageController(driver);
	}
	
	public OfferDetailPageController offerDetailPage() {
		return new OfferDetailPageController(driver);
	}
	
	/*
	package com.inmarkit.qa.framework.mh;

	import java.io.File;
	import java.util.Calendar;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.NoSuchElementException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebDriverBackedSelenium;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;

	import com.inmarkit.qa.framework.RobotService;
	import com.inmarkit.qa.framework.mh.controller.AboutInMarkitPageController;
	import com.inmarkit.qa.framework.mh.controller.AssortmentManagerPageController;
	import com.inmarkit.qa.framework.mh.controller.AttachMultimediaPageController;
	import com.inmarkit.qa.framework.mh.controller.ContactUsPageController;
	import com.inmarkit.qa.framework.mh.controller.CorporateInfoPageController;
	import com.inmarkit.qa.framework.mh.controller.CreateAssortmentAssignItemPageController;
	import com.inmarkit.qa.framework.mh.controller.CreateAssortmentSelectStorePageController;
	import com.inmarkit.qa.framework.mh.controller.CreateAssortmentReviewSavePageController;
	import com.inmarkit.qa.framework.mh.controller.CreateOfferStep1PageController;
	import com.inmarkit.qa.framework.mh.controller.CreateOfferStep2PageController;
	import com.inmarkit.qa.framework.mh.controller.CreateOfferStep4PageController;
	import com.inmarkit.qa.framework.mh.controller.CreateOfferStep5PageController;
	import com.inmarkit.qa.framework.mh.controller.CreateOfferStep6PageController;
	import com.inmarkit.qa.framework.mh.controller.CreateRegionPageController;
	import com.inmarkit.qa.framework.mh.controller.EditAccountPageController;
	import com.inmarkit.qa.framework.mh.controller.EditAssortmentAssignItemPageController;
	import com.inmarkit.qa.framework.mh.controller.EditAssortmentReviewSavePageController;
	import com.inmarkit.qa.framework.mh.controller.EditCorpInfoPageController;
	import com.inmarkit.qa.framework.mh.controller.EditOfferStep1PageController;
	import com.inmarkit.qa.framework.mh.controller.EditOfferStep2PageController;
	import com.inmarkit.qa.framework.mh.controller.EditOfferStep3PageController;
	import com.inmarkit.qa.framework.mh.controller.EditOfferStep4PageController;
	import com.inmarkit.qa.framework.mh.controller.EditOfferStep5PageController;
	import com.inmarkit.qa.framework.mh.controller.EditOfferStep6PageController;
	import com.inmarkit.qa.framework.mh.controller.ForgotPasswordPageController;
	import com.inmarkit.qa.framework.mh.controller.ItemManagerPageController;
	import com.inmarkit.qa.framework.mh.controller.LoadExistingRegionPageController;
	import com.inmarkit.qa.framework.mh.controller.MHHelpPageController;
	import com.inmarkit.qa.framework.mh.controller.MHHomePageController;
	import com.inmarkit.qa.framework.mh.controller.MHLoginPageController;
	import com.inmarkit.qa.framework.mh.controller.MHProfileTabPageController;
	import com.inmarkit.qa.framework.mh.controller.MultimediaManagerPageController;
	import com.inmarkit.qa.framework.mh.controller.NewUserFormPageController;
	import com.inmarkit.qa.framework.mh.controller.OfferDetailPageController;
	import com.inmarkit.qa.framework.mh.controller.OfferManagerPageController;
	import com.inmarkit.qa.framework.mh.controller.PrivacyPolicyPageController;
	import com.inmarkit.qa.framework.mh.controller.ProfileAccountInfoPageController;
	import com.inmarkit.qa.framework.mh.controller.RegionManagerPageController;
	import com.inmarkit.qa.framework.mh.controller.ReportsPageController;
	import com.inmarkit.qa.framework.mh.controller.StoreInfoPageController;
	import com.inmarkit.qa.framework.mh.controller.TermsOfUsePageController;
	import com.inmarkit.qa.framework.mh.controller.ThankYouPageController;
	import com.inmarkit.qa.framework.mh.controller.UploadDataPageController;
	import com.inmarkit.qa.framework.mh.controller.UploadMultimediaPageController;
	import com.inmarkit.qa.framework.mh.controller.CreateOfferStep3PageController;
	import com.inmarkit.qa.framework.mh.controller.UserGuidePageController;
	import com.inmarkit.qa.framework.tcstream.controller.TStreamLoginPanelController;
	import com.thoughtworks.selenium.Selenium;

	public class MHScriptBase {
		protected WebDriver driver = null;
		protected Selenium selenium = null;
		
		protected static final String URL = "http://ni-merchant.inmarkit.net";
		protected static final String ENV_SELECT = "www.tysencorner.com/envselect";

		
		@BeforeClass
		public void beforeClass() {

		}

		@BeforeTest
		public void beforeTest() {

		}

		@Parameters({"BrowserName"})
		@BeforeMethod
		public void beforeMethod(@Optional("FIREFOX") String browser) {
		
			System.out.println(browser);
			
			if(browser.toUpperCase().contentEquals("FIREFOX"))

	{
				driver = new FirefoxDriver();

				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				selectEnvironment("QA");

				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

//				selenium = new WebDriverBackedSelenium(driver, URL);
	//
				
//				driver.navigate().to("http://inmarkit:munu4u@" + ENV_SELECT);

//				
//				selectEnvironment("QA");
//				obLoginWithItem(1);
			}
			else if(browser.toUpperCase().contentEquals("IE")){
				
				//File file = new File("C:/Devtools/Driver/IEDriverServer.exe"); 
				File file = new File(System.getProperty("user.dir") + "/IEDriver/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				
				driver = new InternetExplorerDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.navigate().to(URL);
				selenium = new WebDriverBackedSelenium(driver, URL);

				driver.navigate().to(ENV_SELECT);
				windowsAuthentication("inmarkit","munu4u");
				selectEnvironment("QA");
				obLoginWithItem(1);
			}
			else if(browser.toUpperCase().contentEquals("CHROME")){
				//For Mac
				System.setProperty("webdriver.chrome.driver", "//Users/nazrulislam/Desktop/Selenium/chromedriver");
				//For Windows
				//System.setProperty("webdriver.chrome.driver", "C:/Users/QA Tester/Desktop/Selenium/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.navigate().to(URL);
				selenium = new WebDriverBackedSelenium(driver, URL);
				
				driver.navigate().to("http://inmarkit:munu4u@" + ENV_SELECT);
				
				selectEnvironment("QA");
				obLoginWithItem(1);
			}
		
		}
		
		

		public void windowsAuthentication(String user, String password){
			RobotService.getInstance().type(user);
			RobotService.getInstance().type("\t");
			RobotService.getInstance().type(password);
			RobotService.getInstance().type("\t");
			RobotService.getInstance().type("\t");
			RobotService.getInstance().type(10);
			
			delayFor(5000);
		}
		
		@AfterMethod
		public void afterMethod() {
			driver.quit();
		}

		@AfterTest
		public void afterTest() {
			//driver.close();
		}

		@AfterClass
		public void afterClass() {
			//driver.close();
		}

		@AfterSuite
		public void afterSuite(){
			
		}
		
		public MHLoginPageController mhLoginPanel() {
			return new MHLoginPageController(driver);
		}

		public MHHomePageController mhHomePage() {
			return new MHHomePageController(driver);
		}
		
		public ProfileAccountInfoPageController accountInfoPage() {
			return new ProfileAccountInfoPageController(driver);
		}
		
		public EditAccountPageController editAccountPage() {
			return new EditAccountPageController(driver);
		}
		
		public CorporateInfoPageController corporateInfoPage() {
			return new CorporateInfoPageController(driver);
		}
		
		
		public EditCorpInfoPageController editCorpInfoPage() {
			return new EditCorpInfoPageController(driver);
		}
			
		public StoreInfoPageController storeInfoPage() {
			return new StoreInfoPageController(driver);
		}

		public UploadDataPageController uploadDataPage() {
			return new UploadDataPageController(driver);
		}
		
		public MHProfileTabPageController profileTab() {
			return new MHProfileTabPageController(driver);
		}
		
		public MultimediaManagerPageController multimediaManagerPage() {
			return new MultimediaManagerPageController(driver);
		}
		
		public UploadMultimediaPageController uploadMultimediaPage() {
			return new UploadMultimediaPageController(driver);
		}

		public RegionManagerPageController regionManagerPage() {
			return new RegionManagerPageController(driver);
		}

		public LoadExistingRegionPageController loadRegionPage() {
			return new LoadExistingRegionPageController(driver);
		}

		public CreateRegionPageController createRegionPage() {
			return new CreateRegionPageController(driver);
		}

		public ItemManagerPageController itemManagerPage() {
			return new ItemManagerPageController(driver);
		}
		

		public AttachMultimediaPageController attachMultimediaPage() {
			return new AttachMultimediaPageController(driver);
		}

		public AssortmentManagerPageController assortmentManagerPage() {
			return new AssortmentManagerPageController(driver);
		}
		
		public CreateAssortmentSelectStorePageController createAssSelectStorePage() {
			return new CreateAssortmentSelectStorePageController(driver);
		}

		public CreateAssortmentAssignItemPageController createAssAssignItemPage() {
			return new CreateAssortmentAssignItemPageController(driver);
		}
		
		public CreateAssortmentReviewSavePageController createAssReviewSavePage() {
			return new CreateAssortmentReviewSavePageController(driver);
		}

		public EditAssortmentAssignItemPageController editAssAssignItemPage() {
			return new EditAssortmentAssignItemPageController(driver);
		}
		
		public EditAssortmentReviewSavePageController editAssReviewSavePage() {
			return new EditAssortmentReviewSavePageController(driver);
		}

		public OfferManagerPageController offerManagerPage() {
			return new OfferManagerPageController(driver);
		}
		
		public CreateOfferStep1PageController createOfferStep1Page() {
			return new CreateOfferStep1PageController(driver);
		}

		public CreateOfferStep2PageController createOfferStep2Page() {
			return new CreateOfferStep2PageController(driver);
		}
		
		public CreateOfferStep3PageController createOfferStep3Page() {
			return new CreateOfferStep3PageController(driver);
		}
		
		public CreateOfferStep4PageController createOfferStep4Page() {
			return new CreateOfferStep4PageController(driver);
		}
		
		public CreateOfferStep5PageController createOfferStep5Page() {
			return new CreateOfferStep5PageController(driver);
		}
		
		public CreateOfferStep6PageController createOfferStep6Page() {
			return new CreateOfferStep6PageController(driver);
		}
		
		public EditOfferStep1PageController editOfferStep1Page() {
			return new EditOfferStep1PageController(driver);
		}
		
		public EditOfferStep2PageController editOfferStep2Page() {
			return new EditOfferStep2PageController(driver);
		}
		
		public EditOfferStep3PageController editOfferStep3Page() {
			return new EditOfferStep3PageController(driver);
		}
		
		public EditOfferStep4PageController editOfferStep4Page() {
			return new EditOfferStep4PageController(driver);
		}
		
		public EditOfferStep5PageController editOfferStep5Page() {
			return new EditOfferStep5PageController(driver);
		}
		
		public EditOfferStep6PageController editOfferStep6Page() {
			return new EditOfferStep6PageController(driver);
		}

		public ReportsPageController reportsPage() {
			return new ReportsPageController(driver);
		}
		
		public NewUserFormPageController newUserFormPage() {
			return new NewUserFormPageController(driver);
		}
		
		public ContactUsPageController contactUsPage() {
			return new ContactUsPageController(driver);
		}
		
		public ThankYouPageController thankYouPage() {
			return new ThankYouPageController(driver);
		}
		
		public MHHelpPageController mhHelpPage() {
			return new MHHelpPageController(driver);
		}
		
		public AboutInMarkitPageController aboutInMarkitPage() {
			return new AboutInMarkitPageController(driver);
		}
		
		public UserGuidePageController userGuidePage() {
			return new UserGuidePageController(driver);
		}
		
		public PrivacyPolicyPageController privacyPolicyPage() {
			return new PrivacyPolicyPageController(driver);
		}
		
		public TermsOfUsePageController termsOfUsePage() {
			return new TermsOfUsePageController(driver);
		}
		
		public ForgotPasswordPageController forgotPasswordPage() {
			return new ForgotPasswordPageController(driver);
		}
		
		public OfferDetailPageController offerDetailPage() {
			return new OfferDetailPageController(driver);
		}
		
	//
	//public CorporateInfoPageController corporateInfoPage() {
//		return new CorporateInfoPageController(driver);
	//}
		
		@Parameters({"BrowserName"})
		public void LoginToStream(@Optional("FIREFOX") String browser){
					
				System.out.println(browser);
				
				if(browser.toUpperCase().contentEquals("FIREFOX")){
					driver = new FirefoxDriver();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					tysenCornerEnvSelect("QA");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					loginWithStreamOrOB("STREAM");

				}
				else if(browser.toUpperCase().contentEquals("IE")){
					
					//File file = new File("C:/Devtools/Driver/IEDriverServer.exe"); 
					File file = new File(System.getProperty("user.dir") + "/IEDriver/IEDriverServer.exe");
					System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
					
					driver = new InternetExplorerDriver();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.navigate().to(URL);
					selenium = new WebDriverBackedSelenium(driver, URL);

					driver.navigate().to(ENV_SELECT);
					windowsAuthentication("inmarkit","munu4u");
					tysenCornerEnvSelect("QA");
					obLoginWithItem(1);
				}
				else if(browser.toUpperCase().contentEquals("CHROME")){
					//For Mac
					System.setProperty("webdriver.chrome.driver", "//Users/nazrulislam/Desktop/Selenium/chromedriver");
					//For Windows
					//System.setProperty("webdriver.chrome.driver", "C:/Users/QA Tester/Desktop/Selenium/chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					driver.navigate().to(URL);
					selenium = new WebDriverBackedSelenium(driver, "www.tysencorner.com");
					
					driver.navigate().to("http://inmarkit:munu4u@" + "www.tysencorner.com");
					
					tysenCornerEnvSelect("QA");
					obLoginWithItem(1);
				}
			
		}
		
		public void selectEnvironment(String envName) {
			
			if(envName.toUpperCase().contentEquals("QA")){
				driver.navigate().to("http://qa-merchant.inmarkit.net");
			}
			else if(envName.toUpperCase().contentEquals("PROD")){
				driver.navigate().to("http://merchant.inmarkit.com");
			}
			else {
				driver.navigate().to("http://ni-merchant.inmarkit.net");
			}
			
			delayFor(2000);
		}

			
		public void tysenCornerEnvSelect(String envName) {
			driver.get("http://inmarkit:munu4u@" + "www.tysencorner.com/envselect");
			if(envName.toUpperCase().contentEquals("QA")){
				WebElement envElement = driver.findElement(By.xpath("/html/body"));
				String envtxt = envElement.getText();
				if (!(envtxt).contains("qa-stream.inmarkit.net")) {
					WebElement selectEnv = driver.findElement(By
							.xpath("/html/body/form/input[2]"));
					selectEnv.click();
				}
			}
			else if(envName.toUpperCase().contentEquals("PROD")){
				WebElement envElement = driver.findElement(By.xpath("/html/body"));
				String envtxt = envElement.getText();
				if (!(envtxt).contains("qa-stream.inmarkit.net")) {
					WebElement selectEnv = driver.findElement(By
							.xpath("/html/body/form/input[1]"));
					selectEnv.click();
				}
			}
			else
			{
				WebElement inputOthers = driver.findElement(By.xpath("/html/body/form/input[3]"));
				inputOthers.sendKeys(envName);
				
				WebElement othersButton = driver.findElement(By.xpath("/html/body/form/input[4]"));
				othersButton.click();
			}
		
			delayFor(2000);
		}
		
		public void tysenCornerLogin(String email, String password){
			TStreamLoginPanelController tysencorner = new TStreamLoginPanelController(driver);
			tysencorner.loginTysenCornerStream(email, password);
			
			WebElement goBackButton = driver.findElement(By.xpath("//a[@id='backToLink']/img"));
			goBackButton.click();
			delayFor(2000);
		}
			
		public void loginWithStreamOrOB(String loginName) {
			driver.navigate().to("http://www.tysencorner.com/cu.php");
			driver.navigate().to("http://www.tysencorner.com");
			delayFor(2000);
			WebElement itemElement = driver
					.findElement(By
							.xpath("//table[@id='products-grid-table']/tbody/tr/td[1]/h3/a"));
			itemElement.click();
			delayFor(4000);
			if (loginName.contains("OB")){
				WebElement oneButton = driver.findElement(By
						.xpath("//div[@id='inmarkit-onebutton']/img"));
				oneButton.click();
			}
			else if (loginName.contains("STREAM")){
				driver.switchTo().defaultContent();
				driver.switchTo().frame(driver.findElement(By.id("streamButtonIFrame")));
				WebElement tcStream = driver.findElement(By
						.xpath("//div[@id='stream-button']/img"));
				tcStream.click();
				
			}
			delayFor(3000);
		}
		
		public void obLoginWithItem(int item) {
			driver.navigate().to("http://www.tysencorner.com/cu.php");
			delayFor(1000);
			driver.navigate().to("http://www.tysencorner.com");
			
			delayFor(3000);
			if (item == 1){
				WebElement itemElement = driver
				.findElement(By
						.xpath("//table[@id='products-grid-table']/tbody/tr/td[1]/h3/a"));
				//itemElement.click();
				mouseClick(itemElement);
				delayFor(3000);
				driver.switchTo().frame(driver.findElement(By.id("oneButtonButtonIFrameB000G3GZ2I")));
				WebElement oneButton = driver.findElement(By.xpath("//img[@id='ob-button']"));
				delayFor(1000);
				mouseClick(oneButton);
				//oneButtonClick("B000G3GZ2I");
			}
			else if (item == 2){
				WebElement itemElement = driver
				.findElement(By
						.xpath("//table[@id='products-grid-table']/tbody/tr/td[2]/h3/a"));
				mouseClick(itemElement);
				driver.switchTo().frame(driver.findElement(By.id("oneButtonButtonIFrameB00009IMB0")));
				WebElement oneButton = driver.findElement(By.xpath("//img[@id='ob-button']"));
				mouseClick(oneButton);
			}
			
			else if (item == 3){
				WebElement itemElement = driver
				.findElement(By
						.xpath("//table[@id='products-grid-table']/tbody/tr/td[3]/h3/a"));
				itemElement.click();
				driver.switchTo().frame(driver.findElement(By.id("oneButtonButtonIFrameB000W8Q9W8")));
				WebElement oneButton = driver.findElement(By.xpath("//img[@id='ob-button']"));
				mouseClick(oneButton);
			}
			
			delayFor(3000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("oneButtonIFrame")));
				
		}
		
		public void tysenCornerLogin(String loginName){
			
			if (loginName.contains("TCSTREAM")){
				WebElement tcStream = driver.findElement(By
						.xpath("//div[@id='inmarkit-stream']/img"));
				tcStream.click();
				delayFor(2000);
			}
			
		}
		protected void mouseClick(WebElement element) {
		    String code = "var fireOnThis = arguments[0];"
		                + "var evObj = document.createEvent('MouseEvents');"
		                + "evObj.initEvent( 'click',true,false );"
		                + "fireOnThis.dispatchEvent(evObj);";
		    ((JavascriptExecutor) driver).executeScript(code, element);
		}
		
		public void oneButtonClick(String productSKU) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("oneButtonButtonIFrame" + productSKU)));
			WebElement oneButton = driver.findElement(By.xpath("//img[@id='ob-button']"));
			oneButton.click();
			delayFor(3000);
			
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("oneButtonIFrame")));
		}
		
		public void tysenCornerStreamClick() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("streamButtonIFrame")));
			WebElement tcStream = driver.findElement(By
					.xpath("//div[@id='stream-button']/img"));
			tcStream.click();
			delayFor(4000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("streamIFrame")));
		}
		
		public void delayFor(int time){
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void closeTsLoginWindowAndClickOB(String productKey){
			//switchToIFrame();
			WebElement closeButton = driver.findElement(By.xpath("//div[@id='imi-close']/img"));
			closeButton.click();
			delayFor(2000);
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("oneButtonButtonIFrame" + productKey)));
			WebElement oneButton = driver.findElement(By.xpath("//img[@id='ob-button']"));;
			oneButton.click();
			delayFor(3000);	
			
		}
		
		public boolean exists(String elementId){
			boolean present;
		
		try {
			   driver.findElement(By.id(elementId));
			   present = true;
			} catch (NoSuchElementException e) {
			   present = false;
			}
			return present;
		}
		
		public void handleWinHandler(){
			String curentWin = driver.getWindowHandle();
			Set<String > win = driver.getWindowHandles();
			for(String s : win){
				System.out.println(s);
				if(!(curentWin.contentEquals(s)))
				{
					driver.switchTo().window(s);
				}
			}
		}
		
		public void switchToStreamIFrame(){
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.id("streamIFrame")));
		}
		
		public String getDriverHandleWithTitle(String titleName){
	        
	        String targetHandle = "";
	        for (String handle : driver.getWindowHandles()) {      
	            if(driver.switchTo().window(handle).getTitle().contains(titleName))
	            {
	                targetHandle = handle;
	                break;
	            }        
	        }
	        
	        return targetHandle;
	    }
		
		public String getTodaysDate(){
		       Calendar cal=Calendar.getInstance();
		       int year=cal.get(Calendar.YEAR);
		       int date = cal.get(Calendar.DATE);
		       int Month = cal.get(Calendar.MONTH);
		       int newMonth = Month +1;
		       String currentDate = (year+"-"+newMonth+"-"+date);
		       return currentDate;
		   }

	}
*/


}
