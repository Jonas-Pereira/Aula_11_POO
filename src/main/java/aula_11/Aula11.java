
package aula_11;

// TRATAMENTO DE EXCEÇÕES

public class Aula11 {

    public static void main(String[] args) {
        
        exemplo01();
        //solucao();
    }
    
    /*Quando este código for executado, o mesmo lançará uma NullPointerException, 
    como poder ser visto na saída do console quando executamos tal programa.*/
    
    public static void exemplo01(){
    String frase = null;
    String novaFrase = null;
    novaFrase = frase.toUpperCase();
    System.out.println("Frase antiga: "+frase);
    System.out.println("Frase nova: "+novaFrase);
    }
    
   // resolvendo o problema usando o try/catch.
   public static void solucao(){
    String frase = null;
    String novaFrase = null;
    try
    {
      novaFrase = frase.toUpperCase();
    }
    catch(NullPointerException e) //CAPTURA DA POSSÍVEL exceção.
    {
      //TRATAMENTO DA exceção
      System.out.println("O frase inicial está nula,para solucional tal o problema, foi lhe atribuito um valor default.");
      frase = "Frase vazia";
      novaFrase = frase.toUpperCase();
    }
    System.out.println("Frase antiga: "+frase);
    System.out.println("Frase nova: "+novaFrase);
     }
    
}
