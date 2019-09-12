package component_Creation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//This script is for the test case id: 139628

public class T_131832 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);      
		driver.get("https://Progres-uatr22.unhcr.org");
		driver.findElement(By.xpath("//*[text()='Partners']")).click();
		driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys("Partners\\ptestuser265");
		driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("ProgV4.123");
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		WebElement popup=driver.findElement(By.xpath("//*[@id='InlineDialog_Iframe']"));
		if(popup.isDisplayed()){
			driver.switchTo().frame("InlineDialog_Iframe");
			driver.findElement(By.xpath("//*[@id='butBegin']")).click();
			driver.switchTo().defaultContent();
		}

		
		/************Setting--->>>>> Security*******************/
		
		driver.findElement(By.xpath("//*[@id='crmMasthead']//span[@name='TabHome']")).click();
		int count=0;
		int countsub=0;
		int i=1;
		int j=1;
		Thread.sleep(2000);
		WebElement element=driver.findElement(By.xpath("//*[text()='Settings']/../.."));
		WebElement left=driver.findElement(By.xpath("//*[@id='actionGroupControl_leftNavContainer']/a"));
		WebElement right=driver.findElement(By.xpath("//*[@id='actionGroupControl_rightNavContainer']/a"));
		while(count==0){
		if(element.isDisplayed()){
			element.click();
			count++;
		}
		else if(right.isDisplayed() && i==1){		
			right.click();
			Thread.sleep(2000);
			}
		else{		
			i = 0;
			left.click();
		}
	
		}
	
		//driver.findElement(By.xpath("//*[@id='TabWorkplace']")).click();
		Thread.sleep(2000);
		WebElement elementSub=driver.findElement(By.xpath("//*[@id='detailActionGroupControl']//li/a/span[text()='Security']/.."));
		WebElement leftSub=driver.findElement(By.xpath("//*[@id='detailActionGroupControl_rightNavContainer']"));
		WebElement rightSub=driver.findElement(By.xpath("//*[@id='detailActionGroupControl_leftNavContainer']"));
		while(countsub==0){
		if(elementSub.isDisplayed()){
			elementSub.click();
			countsub++;
		}
		else if(rightSub.isDisplayed() && j==1){		
			leftSub.click();
			Thread.sleep(2000);
			}
		else{		
			j = 0;
			leftSub.click();
		}
		}
		
		driver.switchTo().frame("contentIFrame1");
		driver.findElement(By.xpath("//*[@id='_A02']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("ViewArea");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']")).sendKeys("Jordan");
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
		String BU=driver.findElement(By.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[2]//a")).getText();
		if(BU.matches("Jordan")){
			System.out.println("Jordan BU is available");
		}
		driver.switchTo().defaultContent();

		/***Import View*****/
		Thread.sleep(2000);
		
		/************Local Process--->>>>> Import Views (ShortCuts)*******************/	
		driver.findElement(By.xpath("//*[@id='crmMasthead']//span[@name='TabHome']")).click();
		int count1=0;
		int countsub1=0;
		int i1=1;
		int j1=1;
		Thread.sleep(2000);
		WebElement element1=driver.findElement(By.xpath("//*[text()='Local Process']/../.."));
		WebElement left1=driver.findElement(By.xpath("//*[@id='actionGroupControl_leftNavContainer']/a"));
		WebElement right1=driver.findElement(By.xpath("//*[@id='actionGroupControl_rightNavContainer']/a"));
		while(count1==0){
		if(element1.isDisplayed()){
			element1.click();
			count1++;
		}
		else if(right1.isDisplayed() && i1==1){		
			right1.click();
			Thread.sleep(2000);
			}
		else{		
			i1 = 0;
			left1.click();
		}
		}
		
		Thread.sleep(2000);
		WebElement elementSub1=driver.findElement(By.xpath("//*[@id='detailActionGroupControl']//li/a/span[text()='Import Views (ShortCuts)']/.."));
		WebElement leftSub1=driver.findElement(By.xpath("//*[@id='detailActionGroupControl_rightNavContainer']"));
		WebElement rightSub1=driver.findElement(By.xpath("//*[@id='detailActionGroupControl_leftNavContainer']"));
		while(countsub1==0){
		if(elementSub1.isDisplayed()){
			elementSub1.click();
			countsub1++;
		}
		else if(rightSub1.isDisplayed() && j1==1){		
			leftSub1.click();
			Thread.sleep(2000);
			}
		else{		
			j1 = 0;
			leftSub1.click();
		}
		}
		
			if(driver.findElement(By.xpath("//*[@id='navBarOverlay']")).isDisplayed()){
			driver.findElement(By.xpath("//*[@id='navBarOverlay']")).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='commandContainer3']//li//span[text()=' New ']/.././..")).click();
		driver.switchTo().frame("contentIFrame0");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='progres_entityid']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='progres_entityid_i']")).click();
		driver.findElement(By.xpath("//*[@id='progres_entityid_IMenu']//span[text()='Look Up More Records']/../../../..")).click();
		driver.switchTo().defaultContent();

		/*************EntityLookup*********************/
		driver.switchTo().defaultContent();
		driver.switchTo().frame("InlineDialog_Iframe");
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']")).click();
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']")).sendKeys("Child Protection Case");
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
		driver.findElement(By.xpath("//*[@id='butBegin']")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("contentIFrame0");
		driver.findElement(By.xpath("//*[@id='progres_fieldnameid']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='progres_fieldnameid_i']")).click();
		driver.findElement(By.xpath("//*[@id='progres_fieldnameid_IMenu']//span[text()='Look Up More Records']/../../../..")).click();
		driver.switchTo().defaultContent();

		/*************fieldlookup*********************/

		driver.switchTo().frame("InlineDialog_Iframe");
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
		
		//Select the different values like Child Protection Case GUID, etc.,
		WebElement grid= driver.findElement(By.xpath("//*[@id='tblFind']//tbody/tr//a[@title='Child Protection Case GUID' or @title='CP Case GUID']/../../preceding-sibling::td"));
		if(grid.isEnabled()){
			driver.findElement(By.xpath("//*[@id='butBegin']")).click();
		}
		else{
			grid.click();
			driver.findElement(By.xpath("//*[@id='butBegin']")).click();
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contentIFrame0");
		driver.findElement(By.xpath("//*[@id='progres_nolinkview']")).click();
		driver.findElement(By.xpath("//*[@id='progres_nolinkentity']")).click();
		driver.findElement(By.xpath("//*[@id='progres_nolinkentity_i']")).click();
		driver.findElement(By.xpath("//*[@id='progres_nolinkentity_IMenu']//span[text()='Look Up More Records']/../../../..")).click();

		/*************Nolinkpopup*********************/	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("InlineDialog_Iframe");
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
		driver.findElement(By.xpath("//*[@id='butBegin']")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("contentIFrame0");
		driver.findElement(By.xpath("//*[@id='progres_nolinkentityfield']")).click();
		driver.findElement(By.xpath("//*[@id='progres_nolinkentityfield_i']")).click();
		driver.findElement(By.xpath("//*[@id='progres_nolinkentityfield_IMenu']//span[text()='Look Up More Records']/../../../..")).click();

		/*************Nolinkpopup*********************/	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("InlineDialog_Iframe");
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
		driver.findElement(By.xpath("//*[@id='butBegin']")).click();
		driver.switchTo().defaultContent();

		driver.switchTo().frame("contentIFrame0");
		driver.findElement(By.xpath("//*[@id='progres_name']")).sendKeys("TestCP"); //add the test view name

		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='progres_startimport']"))).click().perform();
		WebElement wb = driver.findElement(By.xpath("//*[@id='Start Import when record is saved_label']"));
		System.out.println(wb.getText());
		if(wb.getText().equalsIgnoreCase("yes"))
		{
			driver.findElement(By.xpath("//*[@id='progres_startimport']/div[1]")).click();
		}
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='progres_importviewshortcut|NoRelationship|Form|Mscrm.Form.progres_importviewshortcut.Save']")).click();

		/**********start Handle popup*************/
		Thread.sleep(2000);
		boolean bool=true;
		try{
			driver.switchTo().alert();
			bool=true;
		}catch(NoAlertPresentException ex){
			bool=false;
		}
		if(bool){driver.switchTo().alert().dismiss();
		}
		else{System.out.println("problem to find alert");
		}

		/**********end Handle popup*************/
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("contentIFrame0");
		String savedimport=driver.findElement(By.xpath("//*[@id='FormTitle']/h1")).getText();
		System.out.println(savedimport);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='closeButton']")).click();
		/******Serach saved importview*********/
		driver.switchTo().frame("contentIFrame1");
		//  Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='crmGrid_quickFindContainer']//label")).click();
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']")).sendKeys(savedimport);
		driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
		String searchimportview=driver.findElement(By.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[2]//a")).getText();
		if(searchimportview.matches(savedimport)){
			System.out.println("Verified Import view saved");
		}
		Thread.sleep(5000);
		driver.close();

	}
}
