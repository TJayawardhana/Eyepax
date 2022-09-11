import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class tc_CheckoutProducts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open Browser
        System.setProperty("webdriver.chrome.driver", "D:\\Eyepax\\driver\\chromedriver.exe");
        driver = new ChromeDriver();

        // Open URL
        driver.get("http://automationpractice.com/index.php");

        // Maximise the Browser
        driver.manage().window().maximize();

        //Click on Sign In Button
        driver.findElement(By.xpath("//a[@class='login']")).click();

        //Enter Email
        driver.findElement(By.id("email_create")).clear();
        driver.findElement(By.id("email_create")).sendKeys("timalkajayawardhana@gmail.com");

        //Click on Create an Account Button
        driver.findElement(By.xpath("//i[@class=\"icon-user left\"]")).click();

        Thread.sleep(5000);

        //Click on Gender Checkbox
        driver.findElement(By.id("id_gender2")).click();

        Thread.sleep(5000);

        //Enter First Name
        driver.findElement(By.id("customer_firstname")).clear();
        driver.findElement(By.id("customer_firstname")).sendKeys("Timalka");

        //Enter Last Name
        driver.findElement(By.id("customer_lastname")).clear();
        driver.findElement(By.id("customer_lastname")).sendKeys("Jayawardhana");

        //Enter Password
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("Timalka123");

        //Select Birthday
        Select select = new Select(driver.findElement(By.id("days")));
        select.deselectAll();
        select.selectByVisibleText("12");

        Select select1 = new Select(driver.findElement(By.id("months")));
        select.deselectAll();
        select.selectByVisibleText("May ");

        Select select2 = new Select(driver.findElement(By.id("years")));
        select.deselectAll();
        select.selectByVisibleText("1995  ");


        //Add Company
        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys("Eyepax");

        //Enter Address
        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys("Eyepax Col 3");

        //Enter City
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("Col 3");

        //Enter State
        Select select3 = new Select(driver.findElement(By.id("id_state")));
        select.deselectAll();
        select.selectByVisibleText("California");

        //Enter Postal Code
        driver.findElement(By.id("postcode")).clear();
        driver.findElement(By.id("postcode")).sendKeys("10380");

        //Enter Country
        driver.findElement(By.id("postcode")).clear();
        driver.findElement(By.id("postcode")).sendKeys("10380");

        //Additional Information
        driver.findElement(By.id("other")).clear();
        driver.findElement(By.id("other")).sendKeys("Test Comment");

        //Add Phone Number
        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys("0112854236");

        //Add Mobile Phone Number
        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys("0772854236");

        //Click on Register Button
        driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[3]")).click();

        //Click on Women Tab
        driver.findElement(By.xpath("(//a[@class=\"sf-with-ul\"])[1]")).click();

        //Click on Subcategory (Tops)
        driver.findElement(By.xpath("(//a[@class=\"subcategory-name\"])[1]")).click();

        //Click on Selected Item
        driver.findElement(By.xpath("(//a[@class=\"product-name\"])[2]")).click();

        //Select Size
        Select select4 = new Select(driver.findElement(By.id("group_1")));
        select.deselectAll();
        select.selectByVisibleText("L");

        //Select Colour
        driver.findElement(By.id("color_14")).click();

        //Click on Add to Cart Button
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

        //Click on Proceed to Checkout Button
        driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[2]")).click();

        //Sign Out
        driver.findElement(By.xpath("//a[@class=\"logout\"]")).click();

        driver.quit();
    }
}
