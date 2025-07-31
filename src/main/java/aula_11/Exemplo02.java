
package aula_11;
/*Imagine a seguinte situação: foi aberta uma conexão com o banco de dados para realizar determinada ação, 
e no meio deste processo seja lançada alguma exceção, como por exemplo, NullPointerException ao tentar 
manipular um determinado atributo de um objeto. Neste caso seria necessário que mesmo sendo lançada uma 
exceção no meio do processo a conexão fosse fechada. Um outro exemplo bom seria a abertura de determinado 
arquivo para escrita no mesmo, e no meio deste processo é lançada uma exceção por algum motivo, o arquivo 
não seria fechado, o que resultaria em deixar o arquivo aberto.*/

public class Exemplo02 {
    public static void main(String[] args) {
    String frase = null;
    String novaFrase = null;
    try
    {
      novaFrase = frase.toUpperCase();
    }
    catch(NullPointerException e)
    {
      System.out.println("O frase inicial está nula, para solucionar tal o problema, foi lhe atribuito um valor default.");
      frase = "Frase vazia";
    }
    finally
    {
      novaFrase = frase.toUpperCase();
    }
    System.out.println("Frase antiga: "+frase);
    System.out.println("Frase nova: "+novaFrase);
  }
}
   
