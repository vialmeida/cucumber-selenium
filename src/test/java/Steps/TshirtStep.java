package Steps;

import Pages.Utils;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TshirtStep extends RunCucumberTest {

    Utils utils = new Utils(driver);

    @Dado("^eu retorno à Home Page$")
    public void retornar_a_home()  {
        utils.acessarHome();
    }

    @Quando("^clico em visualizar a t-shirt$")
    public void clicar_em_visualizar() {
        utils.clicarTshirt();
    }

    @Então("^visualizo o modelo desejado$")
    public void ver_perfil() {
        utils.verModelo();
    }
}
