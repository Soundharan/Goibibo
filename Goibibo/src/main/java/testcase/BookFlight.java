package testcase;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.Homepage;


public class BookFlight extends BaseClass{
	@Test(dataProvider = "senddata")
	public void bookticket(String fromplace,String toplace) throws InterruptedException {
		new Homepage(driver).selectroundtrip().from(fromplace)
		.to(toplace).depaturedate().returndate().clickSearchbutton()
		.sortdurrationondepart().sortdurrationonreturn().clickfirstflightfromMAA(fromplace).clickfirstflightfromDEL(toplace).clickbooking();
		
	}

}
