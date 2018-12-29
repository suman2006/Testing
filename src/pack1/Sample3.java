package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "E:\\workspace\\DB123\\JJJ\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		
		String str=driver.findElement(By.xpath("//*[@id='SearchForm']/h1")).getText();
		if(str.equals("Searchflights")){
			System.out.println("Iam in to the home page");
		}else{
			System.out.println("Iam not in  to the home page");
		}
		
		String str12=driver.findElement(By.id("RoundTrip")).getAttribute("name");
		System.out.println(str12);
		
		
		if (driver.findElement(By.id("OneWay1")).isSelected()) {
			System.out.println("one Way is already selected");
		}
		
		if (driver.findElement(By.xpath("//*[@id='GlobalNav']/div/div[1]/a/span")).isDisplayed()) {
			System.out.println("Cleartrip is Displayed");
			
		}
		
		if (driver.findElement(By.xpath("//*[@id='Home']/div/div/ul/li/div/div[2]/aside[1]/nav/ul[1]/li[2]/a[1]")).isEnabled()) {
			System.out.println("Home is Enabled");
			
		}
		
		driver.findElement(By.id("OneWay1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("RoundTrip1")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FromTag1")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		Thread.sleep(3000);
		driver.findElement(By.id("ToTag1")).sendKeys("Visakhapatnam, IN - Vishakhapatnam (VTZ)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ReturnDateContainer']/dd/div/a/i")).click();
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[6]/td[1]/a")).click();
		Select s=new Select(driver.findElement(By.id("Adults")));
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("3");
		Thread.sleep(3000);
		s.selectByValue("4");
		Thread.sleep(3000);
		
		driver.findElement(By.id("SearchBtn")).click();
		
		driver.close();

	}

}
