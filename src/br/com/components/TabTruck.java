package br.com.components;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabTruck {

	public void insertTruck(WebDriver driver, WebElement element) {

		Select optionsSelect = null;

		// Aba AutoMobile
		element = driver.findElement(By.id("nav_truck"));
		element.click();

		// Selection the option
		optionsSelect = new Select(driver.findElement(By.id("make")));
		optionsSelect.selectByValue("Volkswagen");
		System.out.println("Inseriu o dado");

		// Send the value of KM
		element = driver.findElement(By.name("[kW]"));
		element.sendKeys("800");
		System.out.println("KM do motor");

		// Date of manufacture
		element = driver.findElement(By.id("dateofmanufacture"));
		element.sendKeys("08/15/2018");
		System.out.println("Imprime a data da fatura");

		// Number of seats
		element = driver.findElement(By.id("numberofseats"));
		element.sendKeys("5");
		System.out.println("Insere o numero de assentos");

		// type of fuel
		element = driver.findElement(By.id("fuel"));
		element.sendKeys("Diesel");
		System.out.println("Imprime o tipo de combustivel");

		// Charge in Kilograms
		element = driver.findElement(By.id("payload"));
		element.sendKeys("500");
		System.out.println("Imprime a carga em KG");

		// Setting List of elements
		element = driver.findElement(By.id("totalweight"));
		element.sendKeys("10000");
		System.out.println("Carrega as listas");

		// Setting the price list
		element = driver.findElement(By.id("listprice"));
		element.sendKeys("1000");
		System.out.println("Imprime a lista de precos");

		// Quantity of KM per year
		element = driver.findElement(By.id("annualmileage"));
		element.sendKeys("40000");
		System.out.println("Quantidade de KM rodados por ano");

		//Next page
		element = driver.findElement(By.id("nextenterinsurantdata"));
		element.click();

	}

	public void insertInsurant(ChromeDriver driver, WebElement element) {
		// TODO Auto-generated method stub

		//Input the First Name
		element = driver.findElement(By.id("firstname"));
		element.sendKeys("Isabela");
		System.out.println("Imprime o primeiro nome");
		
		//Input the Last Name
		element = driver.findElement(By.id("lastname"));
		element.sendKeys("Oliveira");
		System.out.println("Imprime o ultimo nome");
		
		//Input the Date of Birth
		element = driver.findElement(By.id("birthdate"));
		element.sendKeys("09/21/1991");
		System.out.println("preenche a data de aniversário ");


		//Selecting Country
		element = driver.findElement(By.id("country"));
		element.sendKeys("Brasil");
		System.out.println("Seleciona o país");


		//Input the CODEZONE
		element = driver.findElement(By.id("zipcode"));
		element.sendKeys("00000000");
		System.out.println("preenche o CEP da rua");

		

		//Input the Occupation
		element = driver.findElement(By.id("occupation"));
		element.sendKeys("Farme");
		System.out.println("preenche a ocupação");

		WebElement element2 = driver.findElement(By.id("other"));
		JavascriptExecutor jse2 = (JavascriptExecutor) driver;
		jse2.executeScript("arguments[0].click();", element2);
		System.out.println("seleciona o hobbie do cadastro ");


		element = driver.findElement(By.id("nextenterproductdata"));
		element.click();

		//Set the initial date
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
		WebElement element1 = driver.findElement(By.id("EuroProtection"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].click();", element1);
		System.out.println("Seleciona produtos opcionais");


		//Loading the next page
		element = driver.findElement(By.id("nextselectpriceoption"));
		element.click();

	}

	public void insertProducts(WebDriver driver, WebElement element) {

		// Selecting Hobbies Option
		WebElement element3 = driver.findElement(By.id("selectultimate"));
		JavascriptExecutor jse3 = (JavascriptExecutor) driver;
		jse3.executeScript("arguments[0].click();", element3);
		System.out.println("Seleciona os hobbies escolhidos");


		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextsendquote")));

		//Loading the next page
		element = driver.findElement(By.id("nextsendquote"));
		element.click();

	}

	public void insertDatas(WebDriver driver, WebElement element) {

		// Setting the email
		element = driver.findElement(By.id("email"));
		element.sendKeys("isa.oliver20@gmai.com");
		System.out.println("preenche o email escolhido");

		
		// Setting the telephone
		element = driver.findElement(By.id("phone"));
		element.sendKeys("558196326019");
		System.out.println("preenche o telefone digitado");


		// Login
		element = driver.findElement(By.id("username"));
		element.sendKeys("isaoliver");
		System.out.println("preenche o login");


		// Setting password
		element = driver.findElement(By.id("password"));
		element.sendKeys("8755@Io");
		System.out.println("preenche a senha escolhida");


		// Confirm the password
		element = driver.findElement(By.id("confirmpassword"));
		element.sendKeys("8755@Io");
		System.out.println("preenche a confirmação de senha");


		// Finally
		element = driver.findElement(By.id("sendemail"));
		element.click();

		element = driver.findElement(By.className("icon"));

		// Loading the conditions
		if (element.isDisplayed()) {
		System.out.println("Dados incorretos");

		} else {
			System.out.println("Tudo correto");

			driver.close();

			driver.quit();
		}

	}

}
