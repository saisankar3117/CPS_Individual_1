package component_Creation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class T_131832_139619 {

      public static void main(String[] args) throws InterruptedException {

            try {
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
                  Thread.sleep(10000);
                  driver.switchTo().frame("InlineDialog_Iframe");
                  driver.findElement(By.xpath("//*[@id='butBegin']")).click();
                  driver.switchTo().defaultContent();
      
                  WebElement navButton=driver.findElement(By.xpath("//*[@id='Tabprogres_REG']"));
                  navButton.click();
                  Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='actionGroupControl_rightNavContainer']")).click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='progres_LOC']")).click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='loc_importshortcut']")).click();
                  Thread.sleep(6000);
                  
                  
            driver.findElement(By.xpath("//*[@id='progres_importviewshortcut|NoRelationship|HomePageGrid|Mscrm.HomepageGrid.progres_importviewshortcut.NewRecord']")).click();
                  Thread.sleep(4000);
                  
                  
                  driver.switchTo().frame("contentIFrame0");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='progres_entityid']")).click();
                  driver.findElement(By.xpath("//*[@id='progres_entityid_i']"))
                              .click();
                  Thread.sleep(2000);
                  driver.findElement(
                              By.xpath("//*[@id='progres_entityid_IMenu']//span[text()='Look Up More Records']/../../../.."))
                              .click();
                  Thread.sleep(6000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(3000);
                  driver.switchTo().frame("InlineDialog_Iframe");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']"))
                              .click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']"))
                              .sendKeys("RSD Case");
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']"))
                              .click();
                  Thread.sleep(3000);
                  driver.findElement(By.xpath("//*[@id='butBegin']")).click();
                  Thread.sleep(3000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(2000);
              
                  
                  
              driver.switchTo().frame("contentIFrame0");
              Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='progres_fieldnameid']")).click();
                  driver.findElement(By.xpath("//*[@id='progres_fieldnameid_i']")).click();
                  Thread.sleep(2000);
                 driver.findElement(By.xpath("//*[@id='progres_fieldnameid_IMenu']//span[text()='Look Up More Records']/../../../..")).click();
                  Thread.sleep(6000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(3000);
                  driver.switchTo().frame("InlineDialog_Iframe");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']"))
                              .click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']"))
                        .sendKeys("RSD Case ID");
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteriaImg']"))
                              .click();
                  Thread.sleep(3000);
                  driver.findElement(By.xpath("//*[@id='butBegin']")).click();
                  Thread.sleep(3000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(2000);
                  
                  
                  driver.switchTo().frame("contentIFrame0");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='progres_nolinkview']")).click();
                  Thread.sleep(2000);
                  
                  
                  driver.findElement(By.xpath("//*[@id='progres_nolinkentity']")).click();
                  driver.findElement(By.xpath("//*[@id='progres_nolinkentity_i']")).click();
                  Thread.sleep(1000);
                driver.findElement(By.xpath("//*[@id='progres_nolinkentity_IMenu']//span[text()='Look Up More Records']/../../../..")).click();
                  Thread.sleep(6000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(3000);
                  driver.switchTo().frame("InlineDialog_Iframe");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']"))
                              .click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='butBegin']")).click();
                  Thread.sleep(3000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(2000);
                  
                  driver.switchTo().frame("contentIFrame0");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='progres_nolinkentityfield']")).click();
                  driver.findElement(By.xpath("//*[@id='progres_nolinkentityfield_i']")).click();
                  Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='progres_nolinkentityfield_IMenu']//span[text()='Look Up More Records']/../../../..")).click();
                  Thread.sleep(6000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(3000);
                  driver.switchTo().frame("InlineDialog_Iframe");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='crmGrid_findCriteria']"))
                              .click();
                  Thread.sleep(1000);
                  driver.findElement(By.xpath("//*[@id='butBegin']")).click();
                  Thread.sleep(3000);
                  driver.switchTo().defaultContent();
                  Thread.sleep(2000);
                  
                  driver.switchTo().frame("contentIFrame0");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//*[@id='progres_name']")).sendKeys("Regis"); 
                  
                  
                  Actions action=new Actions(driver);
                  action.moveToElement(driver.findElement(By.xpath("//*[@id='progres_startimport']"))).click().perform();
                  WebElement wb = driver.findElement(By.xpath("//*[@id='Start Import when record is saved_label']"));
                  System.out.println(wb.getText());
                  if(wb.getText().equalsIgnoreCase("yes"))
                  {
                        driver.findElement(By.xpath("//*[@id='progres_startimport']/div[1]")).click();
                  }
                  
                  String ViewName=driver.findElement(By.xpath("//*[@id='progres_name']")).getText();
                  System.out.println(ViewName);
                  
                  driver.switchTo().defaultContent();
            driver.findElement(By.xpath("//*[@id='progres_importviewshortcut|NoRelationship|Form|Mscrm.Form.progres_importviewshortcut.Save']")).click();
                  Thread.sleep(10000);
                  
                  driver.switchTo().frame("contentIFrame0");
                  Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='messages_openAssociatedGridViewImageButton']")).click();
                  Thread.sleep(2000);
                  
                  
                  String savedimport=driver.findElement(By.xpath("//*[@id='FormTitle']/h1")).getText();
                  System.out.println(savedimport);
                  if(ViewName.matches(savedimport)){
                        System.out.println("Verified Import view saved");
                  }
                  driver.switchTo().defaultContent();
                  //driver.findElement(By.xpath("")).click();

            } catch (Exception e) {

            }
      }

}

