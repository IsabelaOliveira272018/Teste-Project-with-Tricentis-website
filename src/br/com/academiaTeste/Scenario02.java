package br.com.academiaTeste;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import br.com.components.TabMotorCycle;


public class Scenario02 {

	static String ChromeWebDrive = "../academiaTeste/webdriver/ChromeDriver.exe";
	static ChromeDriver driver;
	static WebElement element;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ChromeWebDrive);
		driver = new ChromeDriver();
		Select optionsSelect = null;

		driver.get("http://sampleapp.tricentis.com/101/index.php");

		driver.manage().window().maximize();
		
		
		TabMotorCycle formulario = new TabMotorCycle();
		formulario.insertMotorCycle(driver, element);
		formulario.insertInsurant(driver, element);
		formulario.insertProducts(driver, element);
		formulario.insertOptionPrice(driver, element);
		formulario.insertEmailData(driver, element);



	}
}
