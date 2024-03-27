package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PIM extends Base{
@Test
public void navigation() throws Exception{
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	System.out.println("Clicked to PIM button");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	System.out.println("Clicked to addemployee button");
	
}
}
