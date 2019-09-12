package component_Creation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CPS_Individual_1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();

		driver.get("https://Progres-uatr22.unhcr.org");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[contains(text(),'Partners')]"))
				.click();
		driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys(
				"Partners\\ptestuser333");
		driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys(
				"ProgV4.123");
		driver.findElement(By.xpath("//*[@id='submitButton']")).click();

		driver.findElement(By.xpath("//*[@id='Tabprogres_REG']")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='reg_individual']")).click();

		Thread.sleep(4000);
		
		WebElement Frame= driver.findElement(By.id("contentIFrame1")); //Switching to a frame.
		
		driver.switchTo().frame(Frame);
		
		Thread.sleep(3000);
		
		Actions actions = new Actions(driver); // Action class has been used to double click on an element. 
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By
						.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[3]/nobr/span")));
		
		actions.doubleClick(element).perform();

		driver.switchTo().defaultContent(); // Switched to the main page

		driver.findElement(
				By.xpath("//span[contains(text(),'Change Process Status')]"))
				.click();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath("//*[@id='progres_individual|NoRelationship|Form|HP.Form.progres_individual.ChangeProcessStatus.Erroneous']/span/a/span"))
				.click();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);


		Set<String> allWindows = driver.getWindowHandles();

		for (String currentWindow : allWindows) {
			driver.switchTo().window(currentWindow); //Switching to a child window

		}

		System.out.println("Current window title is " + driver.getTitle()); //Captured the title of that window

		Thread.sleep(3000);

		driver.switchTo().frame("InlineDialog_Iframe"); //Switching to frame

		Thread.sleep(3000);
		String processStatusDate = driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']")).getText();
		
		System.out.println(processStatusDate);
		
		driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='btnOk']")).click();
		String warningMessage = "You must provide a value for process status Date.";
		String warningMessageAlert = driver.switchTo().alert().getText();
		//System.out.println(driver.switchTo().alert().getText());
		
		
		boolean status=warningMessage.equalsIgnoreCase(warningMessageAlert);
	    System.out.println(status); //Printing the error message
	    
	    Thread.sleep(3000);
	    
	    driver.switchTo().alert().accept();
	    
	   
	    SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		Date date = new Date();
		String todaydate = sdf.format(date);
		
		System.out.println(todaydate);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']"))
				.sendKeys(todaydate);
		
		
		boolean futureDateEnabled = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/span")).isEnabled();
		
		System.out.println(futureDateEnabled); //Checking if the element is enabled/disabled
		
		//driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']")).click();
		
	//	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]")).click();
		
		WebElement PSCR_DropDown=driver.findElement(By.xpath("//*[@id='progres_ProcessDetail']"));
		
		{ 
	
			Select DropDown_Values=new Select(PSCR_DropDown);
		 
			List<WebElement> dropdown=DropDown_Values.getOptions();
		 
			for(int i=1;i<dropdown.size();i++)  //Fetching all the dropdown values
		 
		 {
		 
		 String drop_down_values=dropdown.get(i).getText();
		 
		 System.out.println("dropdown values are "  + drop_down_values); //Printing the values here
		 
		  	}

		}
		 
	}

}
