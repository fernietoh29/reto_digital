import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;


public class digital {

    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://creditodigitalpruebas.crezcamos.com:9341/aliado/GAHm2HmWKxfYsY5PSjG5hw%3D%3D/SOyOc6ozUURo9FA%2BCpvbnw%3D%3D");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        //Metodo de autenticacion
        WebElement adjunto = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-desembolso-digital/div/div/div/div[2]/div[2]/div"));
        JavascriptExecutor a = (JavascriptExecutor) driver;
        a.executeScript("arguments[0].click()",adjunto);
        Thread.sleep(2500);

        //Boton crear solicitud//
        WebElement nuevasoli = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-desembolso-digital/div/div/div/div[2]/div[4]/button"));
        Thread.sleep(100);
        nuevasoli.sendKeys(ENTER);


        //Seleccionar cc
        WebElement selectpersona = driver.findElement(By.xpath("//*[@id=\"DBTIPD\"]/div/div[2]"));
        JavascriptExecutor l = (JavascriptExecutor) driver;
        l.executeScript("arguments[0].click()", selectpersona);
        Thread.sleep(1000);

        //Boton crear
        WebElement envio = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/img"));
        Thread.sleep(1000);
        envio.sendKeys(ENTER);

        //Llamado de la cedula
        WebElement cedula = driver.findElement(By.id("numero_documento"));
        cedula.sendKeys("1100337087");

        //Boton crear soli
        WebElement enviodoc = driver.findElement(By.xpath("/html/body/app-root/app-flujo-digital/app-chat/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div/div/div[2]/div/img"));
        Thread.sleep(1000);
        envio.sendKeys(ENTER);






//*[@id="numero_documento"]


    }
}
