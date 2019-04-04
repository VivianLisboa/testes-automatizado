package teste.com.br.testeAutomatizado;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercico03 {
	private WebDriver driver = null;
	
	@Before
	public void iniciologin() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Desktop\\Vivian\\Joyce\\chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.coursera.org/");
	}
	@Test
	public void testeCadastroPlataforma() {

		driver.findElement(By.xpath("//*[@id=\"c-ph-right-nav\"]/ul/li[4]/a")).click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		
		driver.findElement(By.id("emailInput_27-input")).sendKeys("Vivian@mailinator.com");
		driver.findElement(By.id("passwordInput_28-inputt")).sendKeys("12345678");

		assertEquals("Criar login coursera", driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div/div[1]/form/div[1]/button/span")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"authentication-box-content\"]/div/div[2]/div/div[1]/form/div[1]/button/span")).getText());
	}

	@After
	public void fimlogin() throws Exception {
		// driver.quit();
	}


}
