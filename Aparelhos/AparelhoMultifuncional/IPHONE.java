
package Aparelhos;

import Aparelhos.Iphode.Iphod;
import Aparelhos.Navegador.Navegador;
import Aparelhos.Fone.Phone;


public class IPHONE implements Iphod, Navegador, Phone {

    public void ligar (){
        System.ou.println("Ligando por Iphone");
    }

    public void tocar (){
        System.ou.println("tocando por Iphone");
    }

     public void exibirPagina (){
        System.ou.println("exibindo pagina por Iphone");
    }

}