package component_Creation;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Bug_132361 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Desktop\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		driver.get("https://Progres-uatr22.unhcr.org");

		driver.findElement(By.xpath("//*[@id='bySelection']/div[3]/div/span"))
				.click();

		driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys(
				"partners\\ptestuser265");
		driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys(
				"ProgV4.123");
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();

		Thread.sleep(4000);

		driver.switchTo().frame("InlineDialog_Iframe");
		System.out.println("1 " + driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement Element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id='butBegin']")));

		Element.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='Tabprogres_REG']")).click();

		driver.findElement(By.xpath("//*[@id='progres_VOL']/span[2]")).click();

		driver.findElement(By.xpath("//*[@id='vol_repatriation']")).click();

		Thread.sleep(3000);
		
		
	WebElement Frame= driver.findElement(By.id("contentIFrame0")); //Switching to a frame.
		
	driver.switchTo().frame(Frame);
//		try{
//		driver.findElement(By.xpath("//*[@id='navBarOverlay']")).click();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Overlay Block Issue");
//		}
		Thread.sleep(2000);
		WebElement wb = driver.findElement(By.xpath("//*[@id='navBarOverlay']"));
		if(wb.isEnabled()){
		driver.findElement(By.xpath("//*[@id='navBarOverlay']")).click();
		}
		WebElement frame1 = driver.findElement(By.id("contentIframe0"));
		
		String S1 = frame1.getAttribute("id");

		if (S1.contains("0")) {

			driver.switchTo().frame(frame1); // used If condition as the frame
												// is not stable.
		}

		else {
			
			driver.switchTo().frame(frame1);

		Thread.sleep(2000);

		Actions actions = new Actions(driver); 
		
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		WebElement element = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[2]/nobr")));				

		actions.doubleClick(element).perform();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//*[contains(text(),'Remove Case Members')]")).click();
				
				

		//String mainWindow = driver.getWindowHandle();
		for (String selectIndividual : driver.getWindowHandles()) 
		{

			driver.switchTo().window(selectIndividual);
			Thread.sleep(3000);
		}
		
		driver.switchTo().frame("InlineDialog_Iframe");

		WebElement reasons = driver.findElement(By
				.xpath("//*[@id='progres_repremovedreason']"));

		Select selDropDownValueReasons = new Select(reasons);

		List<WebElement> dropdwonsLists = selDropDownValueReasons.getOptions();

		Thread.sleep(2000);

		selDropDownValueReasons.selectByIndex(9);
		dropdwonsLists.contains("Individual set to Inactive");
		System.out.println("Individual set to Inactive is present");

		selDropDownValueReasons.selectByIndex(10);
		dropdwonsLists.contains("Individual set to Closed");
		System.out.println("Individual set to Closed");

		selDropDownValueReasons.selectByIndex(11);
		dropdwonsLists.contains("Individual set to Erroneous");
		System.out.println("Individual set to Erroneous");

		System.out.println("The above values should not be displayed");

		
		String drop_down_values9 = dropdwonsLists.get(9).getText();
		Assert.assertEquals("Individual set to Inactive", drop_down_values9);
	
		String drop_down_values10 = dropdwonsLists.get(9).getText();
		Assert.assertEquals("Individual set to Closed", drop_down_values10);
		
		String drop_down_values11 = dropdwonsLists.get(9).getText();
		Assert.assertEquals("Individual set to Erroneous", drop_down_values11);
		
	}
}
}