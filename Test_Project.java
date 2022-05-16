package introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.github.javafaker.Faker;

public class Test_Project {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harad\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		//implicit wait
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//Flipkart Scenario
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("iphone13");
		WebDriverWait wait = new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body>div>div>div>button")));
		driver.findElement(By.cssSelector("body>div>div>div>button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#container>div>div:nth-Child(1)>div:nth-Child(1)>div:nth-Child(2)>div:nth-Child(2)>form>div>button")));
		driver.findElement(By.cssSelector("#container>div>div:nth-Child(1)>div:nth-Child(1)>div:nth-Child(2)>div:nth-Child(2)>form>div>button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#container>div>div:nth-Child(3)>div:nth-Child(1)>div:nth-Child(2)>div>div>div>div>a>div:nth-Child(2)>div:nth-Child(1)>div:nth-Child(1)")));
		driver.findElement(By.cssSelector("#container>div>div:nth-Child(3)>div:nth-Child(1)>div:nth-Child(2)>div>div>div>div>a>div:nth-Child(2)>div:nth-Child(1)>div:nth-Child(1)")).click();
		//(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]")));
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/input")).sendKeys("533003");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span")));
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[7]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
		driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='+']")));
		driver.findElement(By.xpath("//button[text()='+']")).click();
		Thread.sleep(4000);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='container']/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span")));
		String price =driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span")).getText();
		System.out.println(price);
		
		
		
		////*[@id="container"]/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[4]/div/span/div/div/span
		//		List <WebElement> links = driver.findElements(By.cssSelector("#container>div>div:nth-Child(3)>div:nth-Child(1)>div:nth-Child(2)>div>div>div>div>a>div:nth-Child(2)>div:nth-Child(1)>div:nth-Child(1)"));
//		System.out.println(links.size());
//		if(links.size()>0)
//		{
//		links.get(0).click();
//		}
		//		for(int i=0;i<links.indexOf(links);i++) {
//			if(i==1) {
//				links.get(i).click();
//			}
			
		//}
		
		
		
		
		
//		
//		Faker faker = new Faker();
//		
//		//Register User
//		
//		driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(faker.name().firstName());
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='Surname']")).sendKeys(faker.name().lastName());
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='E_post']")).sendKeys(faker.address().countryCode());
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='Mobile']")).sendKeys(faker.phoneNumber().cellPhone());
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys(faker.name().title());
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("1234");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='submit']")).click();
//		String validation = driver.findElement(By.cssSelector("body>div>form>div>div:nth-child(11)>div>label")).getText();
//		Assert.assertEquals(validation,"Registration Successful");
//		
//		//Login
//		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("Haradeep");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).click();
//		Thread.sleep(4000);
//		String loginValidtion = driver.findElement(By.cssSelector("body>div>div>h3")).getText();
//		Assert.assertEquals(loginValidtion,"Welcome Haradeep" );
//		
//		//LogOut
//		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
//		Thread.sleep(4000);
//		String login_URL=driver.getCurrentUrl();
//		Assert.assertEquals(login_URL,"https://itera-qa.azurewebsites.net/Login");
//		Thread.sleep(4000);
//		
//		
//		   
//		//Text Area Practice
//		driver.findElement(By.xpath("//a[contains(text(),'Test Automation')]")).click();
//		String Url = driver.getCurrentUrl();
//		Assert.assertEquals(Url,"https://itera-qa.azurewebsites.net/home/automation");
//		driver.findElement(By.id("name")).sendKeys(faker.name().fullName());
//		driver.findElement(By.id("phone")).sendKeys(faker.phoneNumber().cellPhone());
//		driver.findElement(By.cssSelector("#email")).sendKeys(faker.internet().emailAddress());
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(faker.friends().toString());
//		driver.findElement(By.id("address")).sendKeys(faker.address().fullAddress());
//		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
//		
//		//Scroll
//		
//				JavascriptExecutor scroll = (JavascriptExecutor)driver; 
//				   scroll.executeScript("window.scrollBy(0,250)","");
//		
//		//Handling Radio Buttons
//		
//		List<WebElement>list = driver.findElements(By.cssSelector(".card.border-success >.card-body>.form-check>label>input[type='radio']"));
//		list.get(0).click();
//		list.get(1).click();
//		
//		WebElement element = driver.findElement(By.cssSelector(".form-check.disabled"));		
//		if(element.isDisplayed()) {
//			System.out.println("Could not click on the radio button");
//		}
//		
//		//Handling Check Boxes
//		
//		List<WebElement> checkBoxes = driver.findElements(By.cssSelector(".card.border-success >.card-body>.form-check>label>input[type='checkbox']"));
//		for(WebElement elements : checkBoxes ) {
//			if(!elements.isSelected())
//				elements.click();
//		}
//		
//		
//		//Handling Drop Downs
//		
//		WebElement dropdown =driver.findElement(By.cssSelector(".card.border-success.mb-3>div>div>select"));
//		Select listOfElements = new Select(dropdown);
//		List<WebElement> elements = listOfElements.getOptions();
//		for(int i=0;i<elements.size();i++) {
//			String place_name = elements.get(i).getText();
//			System.out.println(place_name);
//			if(place_name.contentEquals("Spain")) {
//				elements.get(i).click();
//			}
//		}
//		
//		//Uploading a file
//		
//		WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
//		upload.sendKeys("C:\\Users\\harad\\OneDrive\\Pictures\\Screenshots\\uploadSample.png");
//		driver.findElement(By.cssSelector(".input-group-text")).click();
//	
		
		
		
		
	}
	
}
