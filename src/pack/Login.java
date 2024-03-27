package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends Base{
	@Test
	public void Launcher () throws Exception
	{
driver.get("http://localhost/orangehrm/orangehrm-5.6/web/index.php/auth/login");
	System.out.println("Launching Website");
	}	
	
@Test
public void LoginPage () throws Exception{
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
driver.findElement(By.name("username")).sendKeys("anjualban");
driver.findElement(By.name("password")).sendKeys("anju123@A");
driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
System.out.println("Click on Login Button");
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a")).click();
System.out.println("Reached Dashboard");

}}