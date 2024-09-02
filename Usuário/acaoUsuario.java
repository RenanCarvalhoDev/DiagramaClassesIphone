package Usuário;

import Aparelhos.AparelhoMultifuncional.IPHONE;
import Aparelhos.Fone.Phone;
import Aparelhos.Iphode.Iphod;
import Aparelhos.Navegador.Navegador;

public class acaoUsuario {

    public static void main (String[] args ){
        AparelhoMultifuncional ip = new AparelhoMultifuncional();

        Phone phone = ip;
        Navegador navegador = ip;
        Iphod iphod = ip;

        phone.ligar();
        navegador.exibirPagina();
        iphod.tocar();
        
    }
}