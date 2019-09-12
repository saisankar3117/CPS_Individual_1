package component_Creation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CPS_Registration_Group {

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

		Thread.sleep(2000);

		WebElement frame1 = driver.findElement(By.id("contentIframe0"));
		
		String S1 = frame1.getAttribute("id");

		if (S1.contains("0")) {

			driver.switchTo().frame(frame1); // used If condition as the frame
												// is not stable.
		}

		else {
			driver.switchTo().frame(frame1);

		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='filterButtonImage']")).click();

		driver.findElement(
				By.xpath("//*[@id='picklistFilterPopupcrmGridprogres_registrationgroupstatuscode']//img[@id='mnuDown']"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='_inputitem11']")).click();

		driver.findElement(By.xpath("//*[@id='_inputitem12']")).click();

		driver.findElement(
				By.xpath("//*[@id='grid-filter-OkbuttonpicklistFilterPopupcrmGridprogres_registrationgroupstatuscode']"))
				.click();

		driver.findElement(
				By.xpath("//*[@id='gridBodyTable']/tbody/tr[3]/td[1]")).click();

		driver.findElement(
				By.xpath("//*[@id='gridBodyTable']/tbody/tr[4]/td[1]")).click();

		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		driver.findElement(
				By.xpath("//span[contains(text(),'Change Process Status')]"))
				.click();

		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

		driver.findElement(
				By.xpath("//*[@id='progres_registrationgroup|NoRelationship|HomePageGrid|HP.HomepageGrid.progres_registrationgroup.ChangeProcessStatus.Inactive']/span/a/span"))
				.click();

			String parentWindow = driver.getWindowHandle();
			
			System.out.println(parentWindow);
	
			Set<String> allWindows = driver.getWindowHandles();
	
			for (String currentWindow : allWindows) {
				driver.switchTo().window(currentWindow);
			}

		System.out.println("Current window title is " + driver.getTitle());

		Thread.sleep(3000);

		WebElement frame2 = driver.findElement(By.id("InlineDialog_Iframe"));

		driver.switchTo().frame(frame2);

		Thread.sleep(3000);

		String processStatusDate = driver.findElement(
				By.xpath("//*[@id='progres_ProcessStatusDate']")).getText();

		System.out.println(processStatusDate);

		driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']"))
				.clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='btnOk']")).click();
		String warningMessage = "You must provide a value for process status Date.";
		String warningMessageAlert = driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());

		boolean status = warningMessage.equalsIgnoreCase(warningMessageAlert);

		System.out.println(status);

		driver.switchTo().alert().accept();

		WebElement ele = driver.findElement(By
				.xpath("//*[@id='progres_ProcessStatusDate']"));
		String processStatusDate1 = ele.getAttribute("value");

		DateFormat dateFormat = new SimpleDateFormat("M/dd/yyyy ");

		Date date = new Date();
		String date1 = dateFormat.format(date);
		System.out.println(date1);

		boolean futureDateEnabled = driver
				.findElement(
						By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/span"))
				.isEnabled();

		System.out.println(futureDateEnabled);

		// driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']")).click();
		//
		// driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]")).click();

		Thread.sleep(2000);
		Assert.assertEquals(date1, processStatusDate1);
		WebElement PSCR_DropDown = driver.findElement(By
				.xpath("//*[@id='progres_ProcessDetail']"));

		{

			Select DropDown_Values = new Select(PSCR_DropDown);

			List<WebElement> dropdown = DropDown_Values.getOptions();

			for (int i = 1; i < dropdown.size(); i++)

			{

				String drop_down_values = dropdown.get(i).getText();

				System.out.println("dropdown values are " + drop_down_values);

			}

		}

	}

}
