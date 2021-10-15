import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class telaCadastroShopping {
	
	private WebDriver driver;
	
	@Dado("^acesso o link de compras online$")
	public void acessoOLinkDeComprasOnline() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("http://advantageonlineshopping.com/#/");
	}

	@Quando("^clico no ícone de user$")
	public void clicoNoÍconeDeUser() throws Throwable {
		Thread.sleep(5000);
	    driver.findElement(By.id("menuUser")).click();
	}

	@Então("^tela de login é exibida com sucesso$")
	public void telaDeLoginÉExibidaComSucesso() throws Throwable {
	    driver.findElement(By.id("signInResultMessage"));
	    
	    Assert.assertEquals("", driver.findElement(By.id("signInResultMessage")).getText());
	}
	
	@Quando("^informo o usuário \"([^\"]*)\"$")
	public void informoOUsuário(String arg1) throws Throwable {
	    driver.findElement(By.name("username")).sendKeys(arg1);
	}

	@Quando("^a senha \"([^\"]*)\"$")
	public void aSenha(String arg1) throws Throwable {
		driver.findElement(By.name("password")).sendKeys(arg1);
	}

	@Quando("^clico em sign in$")
	public void clicoEmSignIn() throws Throwable {
	    driver.findElement(By.tagName("button")).click();
	    
	}

	@Então("^sou notificado de que o nome e senha estão incorretos$")
	public void souNotificadoDeQueONomeESenhaEstãoIncorretos() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id("signInResultMessage"));
	    
	    Assert.assertEquals("Incorrect user name or password.", driver.findElement(By.id("signInResultMessage")).getText());
	}
	
	
	@Quando("^clico em criar nova conta$")
	public void clicoEmCriarNovaConta() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class = 'create-new-account ng-scope']")).click();
	}

	@Quando("^preencho Username \"([^\"]*)\"$")
	public void preenchoUsername(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("usernameRegisterPage")).sendKeys(arg1);

	}

	@Quando("^preencho email \"([^\"]*)\"$")
	public void preenchoEmail(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("emailRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho password \"([^\"]*)\"$")
	public void preenchoPassword(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("passwordRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho confirm password \"([^\"]*)\"$")
	public void preenchoConfirmPassword(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys(arg1);
	}
	
	@Quando("^preencho first name \"([^\"]*)\"$")
	public void preenchoFirstName(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("first_nameRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho last name \"([^\"]*)\"$")
	public void preenchoLastName(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("last_nameRegisterPage")).sendKeys(arg1);
	}

	@Quando("^preencho phone number \"([^\"]*)\"$")
	public void preenchoPhoneNumber(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("phone_numberRegisterPage")).sendKeys(arg1);
	}

}
