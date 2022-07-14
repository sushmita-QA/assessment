//UI Automation
package com.Assessment;


import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;



public class Amazon_Home {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://automationintesting.online/#/admin");
     driver.manage().window().maximize();
		String title = driver.getTitle();
		Assert.assertEquals(Actualtext, "Restful-booker-platform demo");
		
		
	 driver.findElement(By.id("username")).sendKeys("admin");
     driver.findElement(By.id("password")).sendKeys("password");
     driver.findElement(By.id("doLogin")).click();
		
     
       Thread.sleep(2000);
		driver.findelement(By.id("frontPageLink")).isDisplayed();
       for(int i =0; i<=1;i++) {
       
       driver.findElement(By.id("roomName")).sendKeys("102");
       Select type = new Select(driver.findElement(By.id("type")));
       type.selectByValue("Double");
       Select accessible = new Select(driver.findElement(By.id("accessible")));
        accessible.selectByValue("true");
        driver.findElement(By.id("roomPrice")).sendKeys("90");
        driver.findElement(By.id("wifiCheckbox")).click();
        driver.findElement(By.id("safeCheckbox")).click();
        driver.findElement(By.id("radioCheckbox")).click();
        driver.findElement(By.id("createRoom")).click();
        Thread.sleep(2000);
       }
        driver.quit();
      
         
        
        
        
        }}







//API Automation Excercise

pm.test("Status test", function () {
    pm.response.to.have.status(200);
    var jsonData = pm.response.json();

  pm.test("Response is ok", () => {
    var IdIndex = jsonData.map(
            function(filter) {
                return filter.id; 
            }
        ).indexOf(2); 

    var id = jsonData[IdIndex];

  pm.expect(id.completed).to.eq(false);

})
});

