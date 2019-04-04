package teste.com.br.testeAutomatizado;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio02 {
	private WebDriver driver = null;

	@Before
	public void inicioCadastro() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Desktop\\Vivian\\Joyce\\chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.coursera.org/");
	}

	@Test
	public void testeCadastroPlataforma() {

		driver.findElement(By.xpath("<a data-click-key=\"common.page_header.click.header_right_nav_button\" data-click-value=\"{&quot;namespace&quot;:{&quot;app&quot;:&quot;common&quot;,&quot;page&quot;:&quot;page_header&quot;,&quot;component&quot;:&quot;header_right_nav_button&quot;,&quot;action&quot;:&quot;click&quot;},&quot;name&quot;:&quot;signup&quot;,&quot;schema_type&quot;:&quot;FRONTEND&quot;,&quot;href&quot;:{&quot;pathname&quot;:&quot;/courses&quot;,&quot;query&quot;:{&quot;query&quot;:&quot;tdd&quot;,&quot;&quot;:&quot;&quot;,&quot;authMode&quot;:&quot;signup&quot;}}}\" data-track=\"true\" data-track-app=\"common\" data-track-page=\"page_header\" data-track-action=\"click\" data-track-component=\"header_right_nav_button\" data-track-href=\"[object Object]\" href=\"/courses?=&amp;authMode=signup&amp;query=tdd\" class=\"signup-btn link-button primary\" role=\"menuitem\" rel=\"nofollow\" data-reactid=\"139\">Inscreva-se gratuitamente</a>")).click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		driver.findElement(By.id("nameInput_27-input")).sendKeys("Vivian Costa");
		driver.findElement(By.id("emailInput_28-input")).sendKeys("Vivian@mailinator.com");
		driver.findElement(By.id("passwordInput_29-input")).sendKeys("12345678");

		assertEquals("Criar cadastro coursera", driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div[1]/div[1]/form/div/button/span")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div[1]/div[1]/form/div/button/span")).getText());
	}

	@After
	public void fimCadastro() throws Exception {
		// driver.quit();
	}

}
