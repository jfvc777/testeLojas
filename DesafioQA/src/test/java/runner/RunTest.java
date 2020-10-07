package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Juan Castillo
 * @since 06/10/2020
 */



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features",
        glue = {"stepdefinition","hooks"},
        tags = {"@Teste_Lojas_Americanas","@Parte_01_Validar_Email_Cadastrado"},
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
        }
)

public class RunTest {



}
