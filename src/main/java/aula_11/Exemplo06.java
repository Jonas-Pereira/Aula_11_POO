/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_11;

import java.util.Scanner;
public class Exemplo06 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    try {
      System.out.print("Digite um valor inteiro..:");
      int numero1 = s.nextInt();
      System.out.print("Digite um valor inteiro..:");
      int numero2 = s.nextInt();

      System.out.println(numero1+ " + " + numero2 + " = " + (numero1+numero2));
    } catch (Exception ex) {
      System.out.println("ERRO - Valor digitado nao e um numero inteiro!");
    }
  }
    
}
