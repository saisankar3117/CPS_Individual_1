package component_Creation;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

		public class SaiTC {
			
			public static void main(String[] args) throws InterruptedException 
		      
			{
		           
				System.setProperty("webdriver.chrome.driver","C:\\Users\\gudlasai.sankar\\Desktop\\chromedriver_win32\\chromedriver.exe");
		      WebDriver driver=new ChromeDriver();
		      driver.manage().deleteAllCookies();
		      driver.manage().window().maximize();
		      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		      driver.get("https://Progres-uatr22.unhcr.org");
		      driver.findElement(By.xpath("//*[text()='Partners']")).click();
		      driver.findElement(By.xpath("//*[@id='userNameInput']")).sendKeys("Partners\\ptestuser265");
		      driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("ProgV4.123");
		      driver.findElement(By.xpath("//*[@id='submitButton']")).click();
		      driver.switchTo().frame("InlineDialog_Iframe");
		      driver.findElement(By.xpath("//*[@id='butBegin']")).click();
		      
		      /********************************************* Step 2 Open Registration Group  ***************************************************************/

		      WebElement navButton=driver.findElement(By.xpath("//*[@id='Tabprogres_REG']"));
		      navButton.click();
		      Thread.sleep(2000);
		      WebElement regGroup=driver.findElement(By.xpath("//*[@id='progres_VOL']"));
		      regGroup.click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id='vol_repatriation']")).click();
		      
		      Thread.sleep(10000);
		      
		      driver.switchTo().frame("contentIFrame1");
		      Thread.sleep(4000);
		      driver.findElement(By.xpath("//*[@id='filterButtonImage']")).click();
		      Thread.sleep(2000);
		      WebElement registrationGroup=driver.findElement(By.xpath("//*[@id='gridBodyTable']//tr[1]/td[2]"));
		      Actions act=new Actions(driver);
		      Thread.sleep(3000);
		      act.doubleClick(registrationGroup).perform();
		      Thread.sleep(10000);
		      
		      driver.switchTo().defaultContent();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[contains(text(),'Remove Case Members')]")).click();
		      Thread.sleep(3000);    
		      
		     
		      
		      driver.switchTo().frame("InlineDialog_Iframe");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id='progres_repremovedreason']")).click();
		      Thread.sleep(3000);
		     
		      
		      
		      WebElement reasons = driver.findElement(By
		                  .xpath("//*[@id='progres_repremovedreason']"));

		      Select selDropDownValueReasons = new Select(reasons);

		      List<WebElement> dropdownLists = selDropDownValueReasons.getOptions();

		      Thread.sleep(4000);
		      
		      for (int i=0;i<dropdownLists.size();i++)
		      {
		    	  String value= dropdownLists.get(i).getText();
		    	  
		    	  
		    	  if (value.equalsIgnoreCase("Individual set to Inactive")|| value.equalsIgnoreCase("Individual set to Closed")|| value.equalsIgnoreCase("Individual set to Erroneous"))
			      {
		    		  System.out.println("Fail the test case"); 
			      }
		    	  
		    	  else {
		    		  System.out.println("Pass the test case");
		    		  
		    	  }
		      break;
		      }
		      

		      driver.findElement(By.xpath("//*[@id='btnCancel']")).click();
		      
		      driver.quit();
		      
		            
		      }
		      
		}	     

		