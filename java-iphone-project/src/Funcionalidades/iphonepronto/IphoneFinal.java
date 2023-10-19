package Funcionalidades.iphonepronto;
import Funcionalidades.aparelhotelefonico.AparelhoTelefonico;
import Funcionalidades.navegadorinternet.NavegadorInternet;
import Funcionalidades.reprodutormusical.ReprodutorMusical;

public class IphoneFinal implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

    @Override
    public void telefonar() {
        System.out.println("TELEFONANDO VIA IPHONE");
    }

    @Override
    public void navegar() {
        System.out.println("NAVEGANDO NA INTERNET VIA IPHONE");
    }

    @Override
    public void reproduzir() {
        System.out.println("REPRODUZINDO MÚSICA VIA IPHONE");
    }
}
