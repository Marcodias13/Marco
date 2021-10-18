import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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
		Thread.sleep(10000);
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
		Thread.sleep(5000);
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
	
	@Quando("^preencho country \"([^\"]*)\"$")
	public void preenchoCountry(String arg1) throws Throwable {
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select combo = new Select(element);
		combo.selectByVisibleText(arg1);
	}

	@Quando("^preencho city \"([^\"]*)\"$")
	public void preenchoCity(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("cityRegisterPage")).sendKeys(arg1);    
	}

	@Quando("^preencho adress \"([^\"]*)\"$")
	public void preenchoAdress(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("addressRegisterPage")).sendKeys(arg1); 
	}

	@Quando("^preencho state \"([^\"]*)\"$")
	public void preenchoState(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("state_/_province_/_regionRegisterPage")).sendKeys(arg1); 
	}

	@Quando("^preencho postal code \"([^\"]*)\"$")
	public void preenchoPostalCode(String arg1) throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("postal_codeRegisterPage")).sendKeys(arg1);
	}
	
	@Quando("^aceito os termos de condições de uso e privacidade$")
	public void aceitoOsTermosDeCondiçõesDeUsoEPrivacidade() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("i_agree")).click();
	}

	@Então("^botão para registrar conta é exibido com sucesso$")
	public void botãoParaRegistrarContaÉExibidoComSucesso() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("register_btnundefined"));
	    
	    Assert.assertEquals("REGISTER", driver.findElement(By.id("register_btnundefined")).getText());
	}
	
	@Quando("^clico no botão para registrar conta$")
	public void clicoNoBotãoParaRegistrarConta() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("register_btnundefined")).click();
	}

	@Então("^conta logada com sucesso$")
	public void contaRegistradaComSucesso() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("menuUserLink"));
	    
	    Assert.assertEquals("testemarco1", driver.findElement(By.id("menuUserLink")).getText());
	}
	
	@Quando("^clico em algum produto$")
	public void clicoEmAlgumProduto() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.id("tabletsTxt")).click();
	}

	@Então("^opção de compra é exibida com sucesso$")
	public void opçãoDeCompraÉExibidaComSucesso() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.name("buy_now"));
	    
	    Assert.assertEquals("BUY NOW", driver.findElement(By.name("buy_now")).getText());
	}
	
	
	@Before
	public void inicializa() {
		System.out.println("Começando aqui");
	}
	
	@After(order = 1)
	public void screenshot(Scenario cenario) {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("target/screenshot/"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@After(order = 0)
	public void fecharBrowser() {
		driver.quit();
	}
	

}
