import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testeProva {



@Test
public void teste() {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://advantageonlineshopping.com/#/");
	driver.findElement(By.id("menuUser")).click();
	
//	driver.findElement(By.name("username")).sendKeys("Teste");
//	driver.findElement(By.name("password")).sendKeys("123");
	
//	Assert.assertEquals("Teste de escrita", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));	

	
//	driver.quit();
	}

}
