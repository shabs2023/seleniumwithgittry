package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddnewEmployee extends Base {
	
@Test
public void newemployee() throws Exception{
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	driver.findElement(By.name("firstName")).sendKeys("Anu");
	System.out.println("Entered firstName");
	driver.findElement(By.name("middleName")).sendKeys("Q");
	System.out.println("Entered middle Name");
	driver.findElement(By.name("lastName")).sendKeys("A");
	System.out.println("Entered last Name");
	driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	driver.manage().timeouts().implicitlyWait(43,TimeUnit.SECONDS);
	System.out.println("Clicked saved button");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
	System.out.println("Personal details displayed");
	driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
}
}
