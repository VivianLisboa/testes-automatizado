package teste.com.br.testeAutomatizado;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercicio01 {

	private WebDriver driver = null;

	@Before
	public void buscaInicial() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tecnico\\Desktop\\Vivian\\Joyce\\chromedriver_win32//chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.coursera.org/");
	}

	@Test
	public void testeBusca() {
		driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/input")).click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));

		driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/input")).sendKeys("tdd");

		assertEquals("Busca conteudo", driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/button[2]/div/svg")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/div/span/div/header/div[3]/div/div[1]/div/div/div[2]/div/div[2]/form/div/div/div[1]/button[2]/div/svg")).getText());

	}

	@After
	public void fimBusca() throws Exception {

	}

}
