/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_11;
/*Assim como qualquer objeto, em Java também é possível criar suas próprias exceções. 
Imagine um cenário em que nenhuma exceção existente faça sentido para ser lançada por você.*/

public class Exemplo05 {
    
  public static class SemLetraBException extends Exception {
  @Override
  public String getMessage(){
    return "Não existe letra B em sua frase";
  }
}
  
  
  public static void main(String args[]) throws SemLetraBException
  {
    String frase = "Sou um teste!";
    if(!frase.contains("b") || !frase.contains("B")) 
    throw new SemLetraBException();
  }

  
  
    
}
