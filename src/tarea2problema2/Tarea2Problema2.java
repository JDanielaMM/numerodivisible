/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2problema2;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Tarea2Problema2 {
    /**
     * Johanna Daniela Macias Martinez
     * A01411534
     * IIS
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner key = new Scanner (System.in);
        int a,b;
        a=pedirdatos("menor");
        b=pedirdatos("mayor");
      
        System.out.println("Numeros pares:");
ciclo(2,a,b);

        System.out.println("Numeros divisibles entre 3:");
        ciclo(3,a,b);
        
        System.out.println("Numeros divisibles entre 5:");
        ciclo(5,a,b);

           
       }
    
    static void ciclo (int numero, int a, int b)
    {
        Scanner key = new Scanner (System.in);
        int i,x=0;      
        
       for (i=a;i<=b;i++){
           if(i%numero==0){
               System.out.println(i);
           }
           else
               {
                x++;
               }
           
           }
       if (x==0)
       {
               System.out.println("Ninguno");
       }
    }
    
    
    
    static int pedirdatos(String var){
        Scanner key= new Scanner (System.in);
        int a=0;
        boolean flag=true;
        while (flag==true){
       try{
        System.out.println("Teclea el "+var+" número: ");
        a=key.nextInt();
        flag=false;
       }
       catch(Exception e){
           System.out.println("No tecleaste un número entero");
       key.next();
       }
        }
        return a;    
    }
    
    
}
