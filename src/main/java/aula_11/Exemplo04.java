/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_11;

/**
 *
 * @author Jonas
 */
public class Exemplo04 {
    
  private static void aumentarLetras() throws Exception //lançando exceção
  {
    String frase = null;
    String novaFrase = null;
    try
    {
      novaFrase = frase.toUpperCase();
    }
    catch(NullPointerException e)
    {
      throw new Exception(e); // cria a exceção
    }
    System.out.println("Frase antiga: "+frase);
    System.out.println("Frase nova: "+novaFrase);
  }
  public static void main(String args[])
  {
    try
    {
      aumentarLetras();
    }
    catch(Exception e) //chamada da exceção
    {
      System.out.println("Ocorreu uma excecão ao executar o método aumentarLetras() "+e);
    }
  }
    
}
