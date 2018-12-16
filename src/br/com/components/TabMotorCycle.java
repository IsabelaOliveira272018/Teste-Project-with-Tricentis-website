package br.com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabMotorCycle {

	public void insertMotorCycle(WebDriver driver, WebElement element) {

		Select optionsSelect = null;

		// Enter on the MotoCycle Navigation
		element = driver.findElement(By.id("nav_motorcycle"));
		element.click();

		// Choosing make option
		optionsSelect = new Select(driver.findElement(By.id("make")));
		optionsSelect.selectByValue("Honda");
		System.out.println("Seleciona a marca da moto");

		// Choosing the model
		element = driver.findElement(By.id("model"));
		element.sendKeys("Moped");
		System.out.println("Seleciona o modelo");

		// Set the capacity of Cylinder
		element = driver.findElement(By.id("cylindercapacity"));
		element.sendKeys("500");
		System.out.println("Preenche a capacidade de cilindradas");

		// Set the performance
		element = driver.findElement(By.id("engineperformance"));
		element.sendKeys("200");
		System.out.println("Seleciona a performance");

		// Date of manufacture
		element = driver.findElement(By.id("dateofmanufacture"));
		element.sendKeys("12/25/2014");
		System.out.println("Preenche a data da fatura");

		// Set the Number of Seats
		element = driver.findElement(By.id("numberofseatsmotorcycle"));
		element.sendKeys("1");
		System.out.println("Seleciona o numero de assentos");

		// Set the price list
		element = driver.findElement(By.id("listprice"));
		element.sendKeys("1000");
		System.out.println("Seleciona a lista de precos");

		// KM for year
		element = driver.findElement(By.id("annualmileage"));
		element.sendKeys("100");
		System.out.println("preenche quilometragem anual");

		// Loading the next page
		element = driver.findElement(By.id("nextenterinsurantdata"));
		element.click();

	}

	public void insertInsurant(ChromeDriver driver, WebElement element) {
		// TODO Auto-generated method stub

		// Input the first name
		element = driver.findElement(By.id("firstname"));
		element.sendKeys("Isabela");
		System.out.println("preenche o primeiro nome ");

		// Input the last name
		element = driver.findElement(By.id("lastname"));
		element.sendKeys("Oliveira");
		System.out.println("preenche o segundo nome ");

		// Set the date of Birth
		element = driver.findElement(By.id("birthdate"));
		element.sendKeys("09/21/1990");
		System.out.println("preenche a data de aniversário ");

		// Choose your Country
		element = driver.findElement(By.id("country"));
		element.sendKeys("Brazil");
		System.out.println("Seleciona o país");

		// Input your ZIPCODE
		element = driver.findElement(By.id("zipcode"));
		element.sendKeys("53150470");
		System.out.println("preenche o CEP da rua");

		// Choosing the Occupation
		element = driver.findElement(By.id("occupation"));
		element.sendKeys("Farme");
		System.out.println("Seleciona a ocupação ");

		// Insert your Hobbies
		WebElement element5 = driver.findElement(By.id("other"));
		JavascriptExecutor jse5 = (JavascriptExecutor) driver;
		jse5.executeScript("arguments[0].click();", element5);
		System.out.println("seleciona o hobbie do cadastro ");

		// Loading the next page
		element = driver.findElement(By.id("nextenterproductdata"));
		element.click();

	}

	public void insertProducts(ChromeDriver driver, WebElement element) {
		// TODO Auto-generated method stub

		// Set the initial date
		element = driver.findElement(By.id("startdate"));
		element.sendKeys("09/21/2020");
		System.out.println("preenche a data de inicio");

		// Select sum of insurance
		element = driver.findElement(By.id("insurancesum"));
		element.sendKeys("30.000.000,00");
		System.out.println("Seleciona soma do seguro");

		// Selecting the damage Insurance
		element = driver.findElement(By.id("damageinsurance"));
		element.sendKeys("Full Coverage");
		System.out.println("Seleciona o seguro contra danos");

		// Selecting Aditional Products
		WebElement element6 = driver.findElement(By.id("EuroProtection"));
		JavascriptExecutor jse6 = (JavascriptExecutor) driver;
		jse6.executeScript("arguments[0].click();", element6);
		System.out.println("Seleciona produtos opcionais");

		// Change to the next page
		element = driver.findElement(By.id("nextselectpriceoption"));
		element.click();

	}

	public void insertOptionPrice(ChromeDriver driver, WebElement element)

	{

		// Selecting Hobbies Option
		WebElement element4 = driver.findElement(By.id("selectgold"));
		JavascriptExecutor jse4 = (JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].click();", element4);
		System.out.println("Seleciona os hobbies escolhidos");

		WebDriverWait wait = new WebDriverWait(driver, 14);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextsendquote")));

		//Next page
		element = driver.findElement(By.id("nextsendquote"));
		element.click();

	}

	public void insertEmailData(ChromeDriver driver, WebElement element)

	{

		// Setting the email
		element = driver.findElement(By.id("email"));
		element.sendKeys("isabela.oliver@gmail.com");
		System.out.println("preenche o email escolhido");

		// Setting the telephone
		element = driver.findElement(By.id("phone"));
		element.sendKeys("81996326019");
		System.out.println("preenche o telefone digitado");

		// Login
		element = driver.findElement(By.id("username"));
		element.sendKeys("IOBNS");
		System.out.println("preenche o login");

		// Setting password
		element = driver.findElement(By.id("password"));
		element.sendKeys("IoB@8755");
		System.out.println("preenche a senha escolhida");

		// Confirm the password
		element = driver.findElement(By.id("confirmpassword"));
		element.sendKeys("IoB@8755");
		System.out.println("preenche a confirmação de senha");

		// Finally
		element = driver.findElement(By.id("sendemail"));
		element.click();

		element = driver.findElement(By.className("icon"));

		//Loading the conditions
		if (element.isDisplayed()) {
		System.out.println(" Dados incorretos ");

		} else {
			System.out.println("Todos os dados foram inseridos corretamente ");
		}
		driver.close();

		driver.quit();
	}

}
