package U.tasquesFetes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WebDriver navi = new FirefoxDriver();
        navi.navigate().to("http://moodle.iescendrassos.net/");
        navi.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        navi.findElement(By.linkText("CF INF")).click();
        navi.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        navi.findElement(By.linkText("CFGS Desenvolupament d'Aplicacions per a Webs")).click();
        navi.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        navi.findElement(By.linkText("MÒDUL 3: PROGRAMACIÓ 2")).click();
        navi.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        navi.findElement(By.id("username")).sendKeys("Enter ur user");
        navi.findElement(By.id("password")).sendKeys("Enter ur pass");
        navi.findElement(By.id("loginbtn")).submit();
        navi.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        List <WebElement> aaaaa = (List<WebElement>) navi.findElements(By.partialLinkText("Tasca"));
        int b = aaaaa.size();
        System.out.println(b+"!!!!!");
        
    }
}
