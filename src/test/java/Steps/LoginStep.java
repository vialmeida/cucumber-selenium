package Steps;

import Pages.Utils;
import Runner.RunCucumberTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginStep extends RunCucumberTest {

    Utils utils = new Utils(driver);

    @Dado("^que estou no site da automation practice")
    public void acessar_site_da_automation_practice() throws InterruptedException  {
        utils.acessarAplicacao();
        utils.maximizarPage();
    }

    @Quando("^eu preencho meu e-mail e senha$")
    public void preencher_e_mail_e_senha() {
        utils.preencherInfos("vitorsax1997@hotmail.com","fau3575");
    }

    @Quando("^clico em sign in$")
    public void clicar_em_sign_in() {
        utils.clickLogin();
    }

    @Então("^eu vejo o meu perfil$")
    public void ver_perfil() {
        utils.checarPerfil();
    }
}
