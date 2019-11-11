/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg1;

import static java.time.Clock.system;

/**
 *
 * @author AA-LABB7PC03
 */
public class Ejercicio31 {
    public static void main(String[] args) {
   //raiz cuadrada
        int x = 2209;
    double r=Math.sqrt(x);
    System.out.println("la raiz cuadrada es:");
    System.out.println(r);
    
    //valor absoluto 
     int l = 2015;
     double k =Math.abs(l);
     System.out.println("el valor absoluto es:");
     System.out.println(k);
    
     //seno de a
    int a= 5;
    double j= Math.sin(a);
    System.out.println("el sen de:");
    System.out.println(j);
    
      //coseno de a
     a = 15;
     j = Math.cos(a);
    System.out.println("el cos de:");
    System.out.println(j);
    
    // potencia
     int d= 5;
    double f= Math.exp(a);
    System.out.println("la potencia es:");
    System.out.println(f);
    
    
   
     // logaritmo neperiano de X
     int t= 5;
    double g= Math.exp(t);
    System.out.println(" El potencia es:");
    System.out.println(g);
    
        // logaritmo decimal de X
        int h = 47;
        double c = Math.log(h);
        System.out.println(" El potencia es:");
        System.out.println(c);
        
        
         // redondea el numero x al valor entero mas maximo
     int m= 5;
    double n= Math.round(m);
    System.out.println(" El potencia es:");
    System.out.println(n);
    
     // b exponente de E
     int s= 5;
   double z = Math.pow(s,3);
    System.out.println(" El potencia es:");
    System.out.println(z);
    
     // gen era un numero al azar entre 0 y 1
     int f1 = 0;
    double v= Math.random();
    System.out.println(" El potencia es:");
    System.out.println(v);
    
   
   double subtotal = 50.55;
     System.out.println(" el valor del IVA es:");
   double iva = subtotal*0.12;
   System.out.println(iva);
   double total = subtotal+iva;
   System.out.println("total");
   System.out.println(total);
   
   
   
  
   
    }
    
}
