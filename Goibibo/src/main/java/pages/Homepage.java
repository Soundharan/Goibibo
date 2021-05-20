package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.BaseClass;

public class Homepage extends BaseClass {
	public Homepage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public Homepage selectroundtrip() {
		driver.findElement(By.id("roundTrip")).click();
		return new Homepage(driver);
	}
	
	public Homepage from(String fromplace) {
		WebElement from = driver.findElement(By.id("gosuggest_inputSrc"));
		from.sendKeys(fromplace);
		WebElement visible = driver.findElement(By.id("react-autosuggest-1"));
		wait.until(ExpectedConditions.visibilityOf(visible));
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		return new Homepage(driver);
	}

	public Homepage to(String toplace) {
		WebElement to = driver.findElement(By.id("gosuggest_inputDest"));
		  to.sendKeys(toplace); 
		  WebElement visible1 = driver.findElement(By.id("react-autosuggest-1"));
		  wait.until(ExpectedConditions.visibilityOf(visible1));
		  to.sendKeys(Keys.ARROW_DOWN); 
		  to.sendKeys(Keys.ENTER);
		return new Homepage(driver);
	}
	
	public Homepage depaturedate() {
		driver.findElement(By.id("departureCalendar")).click();
		  driver.findElement(By.xpath("//div[text()='21']")).click();
		return new Homepage(driver);
		
	}
	public Homepage returndate() {
		 driver.findElement(By.id("returnCalendar")).click();
		  driver.findElement(By.xpath("//div[text()='22']")).click();
		return new Homepage(driver);	
	}
	public Flightpage clickSearchbutton() {
		driver.findElement(By.id("gi_search_btn")).click();
		return new Flightpage(driver);
		
	}
}
