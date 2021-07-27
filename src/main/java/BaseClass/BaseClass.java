package BaseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver Browser_Launch(String browser) 
	{
		try 
		{
			if (browser.equalsIgnoreCase("chrome"))
			{
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
						+("\\driver\\chromedriver.exe"));
				driver=new ChromeDriver();
			
				
			}
			else if (browser.equalsIgnoreCase("edge")) 
			{
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")
						+("\\driver\\msedgedriver.exe"));
				driver=new EdgeDriver();
				
			}
			else 
			{
				System.out.println("Invalid Browser.");
			}
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return driver;
	}
	public static void Get(String link) 
	{
		
		driver.get(link);
		driver.manage().window().maximize();
	}
	
	public static void Close() 
	{
		
		driver.close();
	}

	public static void Quit()
	{
		driver.quit();
	}
	
	public static void Navigateto(String url) 
	{
		driver.navigate().to(url);
	}
	
	public static void Navigateback()
	{
		driver.navigate().back();
	}
	
	public static void Navigateforward()
	{
		driver.navigate().forward();
	}
	
	public static void Navigaterefresh() 
	{
		driver.navigate().refresh();
	}
	
	public static void Alert(WebElement element)
	{
		element.click();
		driver.switchTo().alert().accept();
	}
	
	public static void Mouseover(WebElement element)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static void Draganddrop(WebElement element1,WebElement element2) 
	{
		Actions ac=new Actions(driver);
		ac.dragAndDrop(element1, element2).build().perform();
	}
	
	public static void Frames(int value)
	{
		driver.switchTo().frame(value);
	}
	
	public static void parentframe() 
	{
		driver.switchTo().parentFrame();
	}
	
	public static void Up() throws AWTException 
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_UP);
	}
	
	public static void Down() throws AWTException
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
	}
	
	public static void Enter() throws AWTException 
	{
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
	}
	
	public static String WindowHandles() 
	{
		String id= driver.getWindowHandle();
		return id;
	}
	
	public static void DropDown(WebElement element, int index) 
	{
		Select s = new Select(element);
		s.selectByIndex(index);
		
	}
	
	public static void Checkbox(WebElement element) 
	{
		element.click();
	}
	
	public static boolean Isenabled(WebElement element) 
	{
		boolean ans = element.isEnabled();
		return ans;
	}
	
	public static boolean Isdisplayed(WebElement element) 
	{
		boolean ans = element.isDisplayed();
		return ans;
	}
	
	public static boolean Isselected(WebElement element)
	{
		boolean ans = element.isSelected();
		return ans;
	}
	
	public static void Getoptions(WebElement element) 
	{
		
		Select s = new Select(element);
	    List <WebElement> option = s.getOptions();
	    int size = option.size();
	    
	    for(int i =0; i<size ; i++)
	    {
	    String options = option.get(i).getText();
	    System.out.println(options);
	    }
	}
	
	public static void Gettitle() 
	{
		 String title = driver.getTitle();
		 System.out.println("Page title is : "+title);
	}
	
	public static void Getcurrenturl() 
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static String Gettext(WebElement element) 
	{
		String text = element.getText();
		return text;
	}
	
	public static String Getattribute(WebElement element) 
	{
		String typeValue=element.getAttribute("type");
		return typeValue;
	}
	
	public static void Wait(int sec)
	{
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void Takescreenshot() throws IOException 
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\eclipse-workspace\\installationprocess\\screenshot\\img.png");
		
		FileUtils.copyFileToDirectory(source, destination);
	}
	
	public static void Scrolldown()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public static void Sendkeys(WebElement element,String keys) 
	{
		element.sendKeys(keys);
	}
	
	public static String Getfirstselectedoptions(WebElement element) 
	{
		Select select = new Select(element);
	    WebElement foption=select.getFirstSelectedOption();
	    String selectedoption=Gettext(foption);
	    return selectedoption;
	}
	
	public static void select(WebElement element,String value) 
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	
	public static void Getallsselectedoptions(WebElement element) 
	{
		Select select = new Select(element);
	    List<WebElement> foption=select.getAllSelectedOptions();
	    int size = foption.size();
	    
	    for(int i =0; i<size ; i++)
	    {
	    String options = foption.get(i).getText();
	    System.out.println(options);
	    }
	   
	}
	
	public static boolean Ismultiple(WebElement element)
	{
		Select listbox = new Select(element);
		boolean value = listbox.isMultiple();
		return value;
	}
	
	public static void Click(WebElement element)
	{
		element.click();
	}

}
