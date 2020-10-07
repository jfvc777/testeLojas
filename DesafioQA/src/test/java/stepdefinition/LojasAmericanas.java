package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertEquals;

/**
 * @author Juan Castillo
 * @since 06/10/2020
 */
public class LojasAmericanas {

    public static WebDriver driver;
    String lblErro1, lblErro2, lblErro3, pagTitulo;

    public void inicializarWeb() {
        System.setProperty("webdriver.chrome.driver", "/DesafioQA/BrowserDriver/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void acessarWeb() {
        inicializarWeb();
        driver.get("https://www.americanas.com.br/");
        System.out.println(driver.getTitle());
    }

    public void clicarLogin() {
        driver.findElement(By.id("h_user")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clicarNovoCliente() {
        driver.findElement(By.className("usr-signup")).click();
    }

    public void preencherEmail(String email) {
        driver.findElement(By.id("email-input")).sendKeys(email);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void preencherPass(String senha) {
        driver.findElement(By.id("password-input")).sendKeys(senha);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void clicarRegistrar() {
        driver.findElement(By.xpath("//button[contains(text(),'Criar seu cadastro')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void validarMsgEmail() {
        lblErro1 = driver.findElement(By.xpath("//div[contains(text(),'E-mail já cadastrado')]")).getText();
        assertEquals("E-mail já cadastrado", lblErro1);
    }

    public void validarSenhaFraca() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        lblErro2 = driver.findElement(By.xpath("//span[contains(text(),'fraca')]")).getText();
        assertEquals("fraca", lblErro2);
    }

    public void preencherCPF(String cpf) {
        driver.findElement(By.id("cpf-input")).sendKeys(cpf);
    }

    public void validarCPFInvalido() {
        lblErro3 = driver.findElement(By.xpath("//div[contains(text(),'CPF inválido.')]")).getText();
        assertEquals("CPF inválido.", lblErro3);
    }

    public void preencherNome(String nome) {
        driver.findElement(By.id("name-input")).sendKeys(nome);
    }

    public void preencherData(String data) {
        driver.findElement(By.id("birthday-input")).sendKeys(data);
    }

    public void selecionarSexo(String sexo) {
        switch (sexo) {
            case "masculino":
                driver.findElement(By.id("gender_M")).click();
                break;
            case "feminino":
                driver.findElement(By.id("gender_F")).click();
                break;
        }
    }

    public void preencherTelefone(String telefone) {
        driver.findElement(By.id("phone-input")).sendKeys(telefone);
    }

    public void validarHome() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        pagTitulo = driver.getTitle();
        assertEquals("Americanas - Tudo. A toda hora. Em qualquer lugar.", pagTitulo);
    }

    public void selecionarEntrar(){
        driver.findElement(By.id("h_usr-signin")).click();
    }

    public void selecionarContinuarLogin(){
        driver.findElement(By.id("login-button")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void procurarProduto(String produto){
        driver.findElement(By.id("h_search-input")).sendKeys(produto);
        driver.findElement(By.id("h_search-btn")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }


}