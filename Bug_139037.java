package component_Creation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Bug_139037 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://Progres-uatr22.unhcr.org");

		driver.findElement(By.xpath("//*[@id='bySelection']/div[3]/div/span")).click();

		driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys("partners\\ptestuser265");
		
		driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("ProgV4.123");
		
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();

		Thread.sleep(4000);

		driver.switchTo().frame("InlineDialog_Iframe");
		
	
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement Element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='butBegin']")));

		Element.click();

		Thread.sleep(2000);

		WebElement frame = driver.findElement(By.id("contentIFrame0"));

		// System.out.println(frame);

		driver.switchTo().frame(frame);
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);

		WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='filterButtonImage']")));

		element.click();
		
		
		WebElement scroll=driver.findElement(By.xpath("//*[@id='crmGrid_gridBar']/tbody/tr/th[19]/table/tbody/tr/td[1]")); //Modified on
		JavascriptExecutor jse = (JavascriptExecutor) driver;  
		jse.executeScript("arguments[0].scrollIntoView();",scroll );
		driver.findElement(By.xpath("//*[@id='crmGrid_gridBar']/tbody/tr/th[17]/table/tbody/tr/td[2]")).click(); //BU dropdown
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[contains(text(),'Filter by specific Business Unit...')]")).click();
		
		
		String mainWindowBusinessUnit = driver.getWindowHandle();
	
			System.out.println(mainWindowBusinessUnit);
				for (String lookUpRecordWindow : driver.getWindowHandles()) {
				// switch to child window
					driver.switchTo().window(lookUpRecordWindow);
					Thread.sleep(3000);
				}
				
				
				driver.switchTo().frame("InlineDialog_Iframe");
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@id='crmGrid_findCriteria' and @tabindex='3']")).sendKeys("Cameroon");
				
			Thread.sleep(1000);
				
				driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaButton' and @tabindex='3']")).click();
			
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@class='ms-crm-List-NonDataCell' and @tabindex='6']")).click();
				
				driver.findElement(By.id("btnAdd")).click();
			
			driver.findElement(By.xpath("//*[@id='butBegin']")).click();
			
			Thread.sleep(2000);
			
			
			driver.switchTo().frame("contentIFrame0");
			
			Thread.sleep(2000);
		
			WebElement registrationGroup=driver.findElement(By.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[1]"));
	      
		Actions act=new Actions(driver);
		      
		Thread.sleep(3000);
	      
			act.doubleClick(registrationGroup).perform();
	      
		Thread.sleep(4000);
			
			driver.switchTo().defaultContent();
			
		Thread.sleep(2000);
		
		driver.switchTo().frame("contentIFrame1");
		
		Thread.sleep(2000);
		
		boolean status = driver.findElement(By.xpath("//*[@id='progres_assistancelocation']/div[1]")).isDisplayed();
	
		System.out.println(status);
		
		driver.findElement(By.xpath("//*[@id='progres_assistancelocation']/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='progres_assistancelocation_i']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@title='Look Up More Records']")).click();
		
		Thread.sleep(2000);
		
		String LookUpRecord = driver.getWindowHandle();
		
		System.out.println(LookUpRecord);
			for (String lookUpRecordWindow : driver.getWindowHandles()) {
			// switch to child window
				driver.switchTo().window(lookUpRecordWindow);
				Thread.sleep(3000);
			}
			
			driver.switchTo().frame("InlineDialog_Iframe");
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria' and @tabindex='3']")).sendKeys("Extreme");
			
			driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
			
			String AssistanceLocation1=driver.findElement(By.xpath("//a[@title='Extreme-Nord Hors camp']")).getText();
			
			System.out.println(AssistanceLocation1 + " is available");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='crmGrid_clearCriteriaImg']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria' and @tabindex='3']")).sendKeys("Maroua");
			
			driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']")).click();
			
			String AssistanceLocation2=driver.findElement(By.xpath("//a[@title='Maroua']")).getText();
			
			System.out.println(AssistanceLocation2 + " is available");
			
		}
}