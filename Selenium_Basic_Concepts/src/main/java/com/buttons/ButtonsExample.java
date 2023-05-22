package com.buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonsExample {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate()
				.to("https://www.leafground.com/button.xhtml;jsessionid=node01mk13iw83i7zr1ncjkvv3akwbh266715.node0");
		// 1.Get XY Position
		WebElement getPosition = driver.findElement(By.name("j_idt88:j_idt94"));
		Point xyPoint = getPosition.getLocation();
		int x = xyPoint.getX();
		int y = xyPoint.getY();
		System.out.println("X Valie is : " + x + " Y Value is : " + y);
		// 2.Find Colour
		WebElement colourBtn = driver.findElement(By.name("j_idt88:j_idt96"));
		String Colout = colourBtn.getCssValue("background-color");
		System.out.println("Button Colour is : " + Colout);
		// 3. Find Button Size
		WebElement sizeBtn = driver.findElement(By.name("j_idt88:j_idt98"));
		int height = sizeBtn.getSize().getHeight();
		int width = sizeBtn.getSize().getWidth();
		System.out.println("Height is : " + height + " Widht is : " + width);
		// 4.Click Button
		WebElement clickBtn = driver.findElement(By.name("j_idt88:j_idt90"));
		clickBtn.click();

	}

}
