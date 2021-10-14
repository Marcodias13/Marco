import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/inserir_conta.feature",
		tags = {"~@ignore"},
		plugin = "pretty",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class Runner {
	
	@BeforeClass
	public static void reset() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://seubarriga.wcaquino.me/");
		driver.findElement(By.id("email")).sendKeys("marcodias13@hotmail.com");
		driver.findElement(By.name("senha")).sendKeys("Cipp@2121");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}

}
