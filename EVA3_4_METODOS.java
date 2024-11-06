/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_metodos;

/**
 *
 * @author eddyi
 */
public class EVA3_4_METODOS {

    public static void main(String[] args) {
        System.out.println(encontrarMayor(100,100));
        System.out.println(regresarDia(12));
    }
    
    //VALOR MÁS GRANDE ENTRE DOS NÚMEROS ENTEROS 
    public static int encontrarMayor(int num1, int num2){
        
        /*int resu;
         if(num1 > num2){
         resu = num1;
         }else{
             resu = num2;
         }
         return resu;*/
        
        if(num1 > num2){
          return num1;
        }else{
          return num2;
        }
                   
    }
    
    //Método que regrese el día de la semana en texto. Pide el número 
    //(1 a 7) y regresa; Lunes, martes, miércoles
    
    public static String regresarDia(int día){
    
     switch (día){
     case 1:
     return "Domingo";
     
     case 2: 
         return "Lunes";
         
     case 3: 
         return "Martes";
         
     case 4:
             return "Miércoles";
             
     case 5:
         return "Jueves";
         
     case 6:
         return "Viernes";
         
     case 7: 
     return "Sábado";
                 
     default:
         return "Día no válido";
     
     }
             
    }
}
