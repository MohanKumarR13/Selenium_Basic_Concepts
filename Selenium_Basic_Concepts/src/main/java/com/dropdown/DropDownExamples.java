package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownExamples {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate()
				.to("https://www.leafground.com/select.xhtml;jsessionid=node0wbyehe6bf5hqudvwhykx6zzq266823.node0");
		//1.Select Dropdown Value
		WebElement dropdown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		select.selectByVisibleText("Cypress");
		//2.Get Dropdown Options
		List<WebElement> listOfOptions=select.getOptions();
		int size=listOfOptions.size();
		System.out.println("Number Of Elements : " +size);
		//3. Change Dropdown value
		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		dropdown2.sendKeys("Playwright");
		

	}

}
