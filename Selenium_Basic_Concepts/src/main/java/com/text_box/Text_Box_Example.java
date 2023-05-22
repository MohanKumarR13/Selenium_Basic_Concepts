package com.text_box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_Box_Example {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate()
				.to("https://www.leafground.com/input.xhtml;jsessionid=node01mk13iw83i7zr1ncjkvv3akwbh266715.node0");

		WebElement getTextBox = driver.findElement(By.name("j_idt88:j_idt91"));
		String textValue = getTextBox.getAttribute("value");
		System.out.println(textValue);
		WebElement appendBox = driver.findElement(By.name("j_idt88:j_idt91"));
		appendBox.sendKeys("Kumar");
		WebElement message = driver.findElement(By.name("j_idt106:thisform:age"));
		message.sendKeys("Text Message");

		driver.findElement(By.name("j_idt88:j_idt95")).clear();
		WebElement isDisabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean enabled = isDisabledBox.isEnabled();
		System.out.println("Selected Input Box is Enabled or Disabled ? : " + enabled);

	}

}
