package introduction;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_Case2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harad\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
			
		//implicit wait
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//Flipkart Scenario
		driver.get("https://www.flipkart.com/");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB) (6 GB RAM)");
		WebDriverWait wait = new WebDriverWait(driver,20000);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body>div>div>div>button")));
		driver.findElement(By.cssSelector("body>div>div>div>button")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#container>div>div:nth-Child(1)>div:nth-Child(1)>div:nth-Child(2)>div:nth-Child(2)>form>div>button")));
		driver.findElement(By.cssSelector("#container>div>div:nth-Child(1)>div:nth-Child(1)>div:nth-Child(2)>div:nth-Child(2)>form>div>button")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")));
		
		String FlipKartPrice = driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(FlipKartPrice);
		String price1 = FlipKartPrice.substring(1);
		System.out.println(price1);
		StringBuffer sb = new StringBuffer(price1);
		String priceFlipkart = sb.deleteCharAt(2).toString();
		Float priceFlipkart1 = Float.valueOf(priceFlipkart);
		System.out.println(priceFlipkart1);
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harad\\OneDrive\\Desktop\\chromedriver.exe");
		WebDriver driver2= new ChromeDriver();
		driver2.get("https://www.amazon.in/");
		WebDriverWait wait1 = new WebDriverWait(driver2,20000);
		wait1.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#twotabsearchtextbox")));
		driver2.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("REDMI Note 10 Pro (Dark Night, 128 GB) (6 GB RAM)");
		wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-search-submit.nav-sprite")));
		driver2.findElement(By.cssSelector(".nav-search-submit.nav-sprite")).click();
		Thread.sleep(4000);
		wait1.until(ExpectedConditions.elementToBeClickable(By.linkText("Redmi Note 10 Pro (Dark Night, 6GB RAM, 128GB Storage) -120hz Super Amoled Display|64MPwith 5mp Super Tele-Macro | 33W Charger Included")));
		driver2.findElement(By.linkText("Redmi Note 10 Pro (Dark Night, 6GB RAM, 128GB Storage) -120hz Super Amoled Display|64MPwith 5mp Super Tele-Macro | 33W Charger Included")).click();
		Thread.sleep(4000);
		ArrayList<String> tabs2 = new ArrayList<String> (driver2.getWindowHandles());
	    driver2.switchTo().window(tabs2.get(1));
	    wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".a-price.a-text-price.a-size-medium.apexPriceToPay>span:nth-Child(2)")));
	    String AmazonPrice = driver2.findElement(By.cssSelector(".a-price.a-text-price.a-size-medium.apexPriceToPay>span:nth-Child(2)")).getText();
	    System.out.println(AmazonPrice);
	    String price2 = AmazonPrice.substring(1);
	    System.out.println(price2);
	    StringBuffer sb2 = new StringBuffer(price2);
	    String priceAmazon = sb2.deleteCharAt(2).toString();
	    Float priceAmazon1 = Float.valueOf(priceAmazon);
	    System.out.println(priceAmazon1);
	    
	    if(Float.compare(priceAmazon1,priceFlipkart1)== 0){
	    	System.out.println("Same Prices");
	    }
	    else if(Float.compare(priceAmazon1,priceFlipkart1)<0) {
	    	System.out.println("Amazon Price is Higher");
	    }
	    else {
	    	System.out.println("Flipkart is Higher");
	    }
	    
	}

}
