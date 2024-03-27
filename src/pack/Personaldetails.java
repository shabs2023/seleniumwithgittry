package pack;

import java.util.concurrent.TimeUnit;

import javax.management.relation.RoleStatus;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Personaldetails extends Base {
	@Test
	public void details() throws Exception{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input")).sendKeys("KL5240043367");
		System.out.println("Entered licence number");
		driver.manage().timeouts().implicitlyWait(48,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2024-03-07");
		System.out.println("Entered Licence expiry date");
	//	driver.manage().timeouts().implicitlyWait(43,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/i")).sendKeys("Afghan");
	//	System.out.println("Selected Nationality");
	//	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	//	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")).sendKeys("Single");
		System.out.println("Selected Marital status");
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).sendKeys("2002-03-07");
		System.out.println("Ented DOB");
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span")).click();
		System.out.println("Selected gender");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
		//System.out.println("Successfully saved");
		//String fill = driver.getCurrentUrl();
		//System.out.println("current url: "+fill);
		//Assert.assertTrue(fill.contains("contactDetails"));
		//Test.log(LogStatus.PASS,"url verified");
		
	}

}
