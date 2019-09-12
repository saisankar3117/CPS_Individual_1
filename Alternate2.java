package component_Creation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import org.testng.Assert;

public class Alternate2 {

	public void test4() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Desktop\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//*[@id='Tabprogres_REG']/a/span/span"))
				.click();
		driver.findElement(By.xpath("//*[@id='reg_registrationgroup']/span[2]"))
				.click();
		Thread.sleep(4000);
		WebElement frame = driver.findElement(By.id("contentIFrame0"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);

		driver.findElement(By.xpath("//*[@id='filterButtonImage']")).click();
		driver.findElement(
				By.xpath("//*[@id='picklistFilterPopupcrmGridprogres_registrationgroupstatuscode']//img[@id='mnuDown']"))
				.click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.doubleClick(
				driver.findElement(By.xpath("//input[@id='_inputitem11']")))
				.build().perform();
		Thread.sleep(2000);
		act.doubleClick(
				driver.findElement(By.xpath("//input[@id='_inputitem12']")))
				.build().perform();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id='grid-filter-OkbuttonpicklistFilterPopupcrmGridprogres_registrationgroupstatuscode']"))
				.click();
		driver.findElement(
				By.xpath("//*[@id='gridBodyTable']/tbody/tr[1]/td[1]")).click();
		driver.findElement(
				By.xpath("//*[@id='gridBodyTable']/tbody/tr[2]/td[1]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id='progres_registrationgroup|NoRelationship|HomePageGrid|HP.HomepageGrid.progres_registrationgroup.MainTab.Actions.ChangeProcessStatus.Flyout']/span/a/span"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//*[@id='progres_registrationgroup|NoRelationship|HomePageGrid|HP.HomepageGrid.progres_registrationgroup.ChangeProcessStatus.Inactive']/span/a/span"))
				.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		String winHandleBefore = driver.getWindowHandle();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
		WebElement frame2 = driver.findElement(By.id("InlineDialog_Iframe"));
		driver.switchTo().frame(frame2);

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By
				.xpath("//*[@id='progres_ProcessStatusDate']"));
		String processStatusDate = ele.getAttribute("value");

		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		Date date = new Date();
		String todaydate = sdf.format(date);

		Thread.sleep(2000);
		Assert.assertEquals(todaydate, processStatusDate);

		driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']"))
				.clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='btnOk']")).click();
		String warningMessage = "You must provide a value for Process Status Date.";
		// String warningMessageAlert = driver.switchTo().alert().getText();

		String alertmsg = driver.switchTo().alert().getText();
		Assert.assertEquals(warningMessage, alertmsg);
		driver.switchTo().alert().accept();

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd");
		Date date1 = new Date();
		String todaydate1 = sdf1.format(date1);
		int todaydate2 = Integer.valueOf(todaydate1);
		int futuredate = (todaydate2) + 1;
		String futuredate1 = String.valueOf(futuredate);
		driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']"))
				.click();
		Thread.sleep(3000);
		boolean futureDateEnabled = driver
				.findElement(
						By.xpath("//*[@id='ui-datepicker-div' ]//span[contains(text(),'"
								+ futuredate1 + "')]")).isEnabled();

		Assert.assertEquals(true, futureDateEnabled);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id='progres_ProcessStatusDate']"))
				.sendKeys(todaydate);

		WebElement month_dropdown = driver.findElement(By
				.xpath("//*[@id='progres_ProcessDetail']"));

		{

			Select PSCR_DrpDwn = new Select(month_dropdown);

			List<WebElement> dropdown = PSCR_DrpDwn.getOptions();

			String drop_down_values1 = dropdown.get(1).getText();
			Assert.assertEquals("Relocation (departed)", drop_down_values1);

			String drop_down_values2 = dropdown.get(2).getText();
			Assert.assertEquals("Family Reunification (departed)",drop_down_values2);

			String drop_down_values3 = dropdown.get(3).getText();
			Assert.assertEquals("Readmission (departed)", drop_down_values3);

			String drop_down_values4 = dropdown.get(4).getText();
			Assert.assertEquals("Return (departed)", drop_down_values4);

			String drop_down_values5 = dropdown.get(5).getText();
			Assert.assertEquals("Humanitarian Visa", drop_down_values5);

			String drop_down_values6 = dropdown.get(6).getText();
			Assert.assertEquals("Labour Mobility", drop_down_values6);

			String drop_down_values7 = dropdown.get(7).getText();
			Assert.assertEquals("Private Sponsorship", drop_down_values7);

			String drop_down_values8 = dropdown.get(8).getText();
			Assert.assertEquals("Education (Complementary Pathways)",
					drop_down_values8);

			String drop_down_values9 = dropdown.get(9).getText();
			Assert.assertEquals("Resettlement (departed)", drop_down_values9);

			String drop_down_values10 = dropdown.get(10).getText();
			Assert.assertEquals("Voluntary Repatriation", drop_down_values10);

			String drop_down_values11 = dropdown.get(11).getText();
			Assert.assertEquals("Self-Organised Return", drop_down_values11);

			String drop_down_values12 = dropdown.get(12).getText();
			Assert.assertEquals("No Show", drop_down_values12);

			String drop_down_values13 = dropdown.get(13).getText();
			Assert.assertEquals("Spontaneous Departure", drop_down_values13);

			String drop_down_values14 = dropdown.get(14).getText();
			Assert.assertEquals("No Contact", drop_down_values14);

			String drop_down_values15 = dropdown.get(15).getText();
			Assert.assertEquals("Death", drop_down_values15);

			String drop_down_values16 = dropdown.get(16).getText();
			Assert.assertEquals("Other", drop_down_values16);

		}

	}

}
