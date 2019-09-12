package component_Creation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bug_132361_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://Progres-uatr22.unhcr.org");
		driver.findElement(By.xpath("//*[text()='Partners']")).click();
		driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys(
				"Partners\\ptestuser265");
		driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys(
				"ProgV4.123");
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		driver.switchTo().frame("InlineDialog_Iframe");
		driver.findElement(By.xpath("//*[@id='butBegin']")).click();

		/********************************************* Step 2 Open Registration Group ***************************************************************/

		WebElement navButton = driver.findElement(By.xpath("//*[@id='Tabprogres_REG']"));
		navButton.click();
		Thread.sleep(2000);
		WebElement regGroup = driver.findElement(By.xpath("//*[@id='progres_VOL']"));
		regGroup.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='vol_repatriation']")).click();

		Thread.sleep(10000);

		driver.switchTo().frame("contentIFrame1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='filterButtonImage']")).click();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//li[@id='numberFilterPopupcrmGridprogres_repatriationcaseprogres_size']//img[@id='mnuDown']")).click();

		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//*[@id='_MIcrmGridprogres_repatriationcaseprogres_sizeCustomFilters']/a[2]/span/nobr")).click();

		Thread.sleep(2000);

			 for (String winHandle : driver.getWindowHandles())
			     {
			     driver.switchTo().window(winHandle);
			     }
			     String winHandleBefore = driver.getWindowHandle();
			     driver.switchTo().window(winHandleBefore);
			     Thread.sleep(2000);
			    WebElement frame1 = driver.findElement(By.id("InlineDialog_Iframe"));
			   driver.switchTo().frame(frame1);
			   
			   System.out.println("Frame is switched");
			       Thread.sleep(3000);
			     
			     Select operator = new Select(driver.findElement(By.xpath("//*[@id='primaryOperator']")));
			     operator.selectByVisibleText("Is Greater Than");
			     Thread.sleep(1000); 
			     
			     driver.findElement(By.xpath("//*[@id='primaryValue_num']")).sendKeys("2");
			     driver.findElement(By.xpath("//*[@id='butBegin']")).click();
			     
			     Thread.sleep(2000);
			     
			     driver.switchTo().defaultContent();
			     
			     Thread.sleep(2000);
			     
			     driver.switchTo().frame("contentIFrame1");
			     
			     Thread.sleep(2000);
			     
			     
			     
			     driver.findElement(By.xpath("//div[@class='ms-crm-grid-databodycontainer']//tr[1]//td[1]")).click();
			  
			   Actions actions = new Actions(driver);
					WebDriverWait wait1 = new WebDriverWait(driver, 30);
					
					WebElement element = wait1.until(ExpectedConditions
							.visibilityOfElementLocated(By
									.xpath("//div[@class='ms-crm-grid-databodycontainer']//tr[1]//td[1]")));
					
					element.click();

					actions.doubleClick(element).perform();
					
					Thread.sleep(4000);
					
					driver.switchTo().defaultContent();
					
					Thread.sleep(2000);
					
					driver.switchTo().frame("contentIFrame0");
					
					System.out.println("Iframe is switched");
					Thread.sleep(2000);
					WebElement ele=driver.findElement(By.xpath("//*[@id='FormSecNavigationControl-Icon']"));
					ele.click();
					driver.findElement(By.xpath("//a[contains(text(),'Case Members')]")).click();		
//					driver.findElement(By.xpath("//*[@class='ms-crm-LookupItem-Name'][contains(text(),'Principal Applicant')]")).click();

	}

}
