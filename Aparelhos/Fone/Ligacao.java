package Aparelhos.Fone;

public class Ligacao implements Phone {

    public void ligar(String numero){
        System.out.println("ligando"+ numero + "...");
    }

    public void atender(){
        System.out.println("atendendo");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }

}
