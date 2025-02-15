/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcsimplificada;
import java.util.Scanner;

public class CalcSimplificada {
public static double mutiplicador(double a, double b, int c){
   switch(c){
       case 1:
           System.out.println(a*b);
        return a*b;
        
       case 2:
           System.out.println(a+b);
         return a+b;
       case 3: 
           System.out.println(a-b);
           return a-b;
       case 4:
           System.out.println(a/b);
           return a/b;
       default:
           return 0;
   }
   }
    public static void main(String[] args) {
    double a=35;
    double b= 46;
        System.out.println("escolha  qual operacao vc quer realizar");
        System.out.println("1-mutiplicacao"+ "2-soma "+ "3-subtracao"+ "4-divisao");
       Scanner op= new Scanner(System.in);
       int operacao= op.nextInt();
        System.out.println("agora escolha os numeros da operacao");
        double numA= op.nextDouble();
        double numB= op.nextDouble();
        mutiplicador(numA, numB, operacao);    }
}