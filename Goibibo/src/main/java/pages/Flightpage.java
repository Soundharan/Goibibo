package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import baseclass.BaseClass;

public class Flightpage extends BaseClass {
	public Flightpage(ChromeDriver driver) {
		this.driver=driver;
	}

	public Flightpage sortdurrationondepart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='DURATION']")).click();
		return new Flightpage(driver);

	}
	public Flightpage sortdurrationonreturn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='DURATION'])[2]")).click();
		return new Flightpage(driver);

	}

	public Flightpage filterbyIndiGo() {
		driver.findElement(By.xpath("//span[@class='filtersstyles__AirlineWrap-sc-1hyeel5-23 cQCxGn']//span[text()='Air India']")).click();
		return new Flightpage(driver);

	}
	//Clicking on first flight from chennai which is lowest in price and has a short travel duration
	public Flightpage clickfirstflightfromMAA(String fromplace) throws InterruptedException {
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='flexCol']//span[text()='MAA'])[1]")));
		driver.findElement(By.xpath("(//div[@class='flexCol']//span[text()='"+fromplace+"'])[1]")).click();

		return new Flightpage(driver);

	}

	//Clicking on first flight from Delhi which is lowest in price and has a short travel duration
	public Flightpage clickfirstflightfromDEL(String toplace){
		 driver.findElement(By.xpath("(//div[@class='flexCol']//span[text()='"+toplace+"'])[1]")).click();

		return new Flightpage(driver);

	}
	 
	public Flightpage clickbooking() {
		driver.findElement(By.xpath("//input[@class='srp-card-uistyles__Fltbook-sc-3flq99-35 iglaTg fb quicksand widthF105']")).click();

			return new Flightpage(driver);
	}


}
