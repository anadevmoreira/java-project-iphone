import Funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import Funcionalidades.aparelhotelefonico.Atendimento;
import Funcionalidades.aparelhotelefonico.CorreioVoz;
import Funcionalidades.aparelhotelefonico.Ligacao;
import Funcionalidades.iphonepronto.IphoneFinal;
import Funcionalidades.navegadorinternet.Atualiza;
import Funcionalidades.navegadorinternet.Exibicao;
import Funcionalidades.navegadorinternet.NavegadorInternet;
import Funcionalidades.navegadorinternet.NovaAba;
import Funcionalidades.reprodutormusical.Pausa;
import Funcionalidades.reprodutormusical.Reproducao;
import Funcionalidades.reprodutormusical.ReprodutorMusical;
import Funcionalidades.reprodutormusical.Selecao;

public class LojaIphone {
    public static void main(String[] args) {
        IphoneFinal ip = new IphoneFinal();

        //AparelhoTelefonico
            Atendimento atendimento = new Atendimento();
            CorreioVoz correiovoz = new CorreioVoz();
            Ligacao ligacao = new Ligacao();

        //NavegadorInternet
            Atualiza atualiza = new Atualiza();
            Exibicao exibicao = new Exibicao();
            NovaAba novaAba = new NovaAba();

        //ReprodutorMusical
            Pausa pausa = new Pausa();
            Reproducao reproducao = new Reproducao();
            Selecao selecao = new Selecao();


        AparelhoTelefonico aparelhoTelefonico = ip;
        NavegadorInternet navegadorInternet = ip;
        ReprodutorMusical reprodutorMusical = ip; 


        aparelhoTelefonico.telefonar();
        navegadorInternet.navegar();
        reprodutorMusical.reproduzir();
    }
}
