package Aparelhos.Navegador;

public class Navegacao implements Navegador {

    public void exibirPagina(String url){
        System.out.println("exibindo pagina"+ url + "...");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova Aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

}