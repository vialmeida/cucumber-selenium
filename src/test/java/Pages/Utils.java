package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utils {

    WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        Thread.sleep(4000);
    }

    public void maximizarPage() {
        driver.manage().window().maximize();
    }

    public void preencherInfos(String email,String senha) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(senha);
    }

    public void clickLogin() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    public void checarPerfil() {
        Assert.assertEquals(true, driver.findElement(By.cssSelector("#center_column > h1")).isDisplayed());
    }

    public void acessarHome() {
        driver.findElement(By.id("header_logo")).click();
    }

    public void clicarTshirt() {
        driver.findElement(By.cssSelector("#homefeatured > li:first-child > .product-container > .right-block > h5 > a")).click();
    }

    public void verModelo() {
        Assert.assertEquals("Model demo_1", driver.findElement(By.id("product_reference")).getText());
    }
}
