package runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/registroDeUsuario.feature",
glue = "src/test/java/stepDefinitions/RegistroDefinition")
public class RegistroRunner {
}
