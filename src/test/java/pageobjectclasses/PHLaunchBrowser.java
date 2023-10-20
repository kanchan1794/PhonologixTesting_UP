package pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PHLaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // Launch Website
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/dashboard");
        Thread.sleep(2000);
        
		/*
		 * driver.findElement(By.id("login_username_input")).sendKeys(
		 * "superadmin@myorganization");
		 * driver.findElement(By.id("loging_password_input")).sendKeys("Admin@123");
		 * driver.findElement(By.id("login_submit_button")).click();
		 */


		

	}

}

