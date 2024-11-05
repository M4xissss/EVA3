/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {

        String nombre = capturarTexto("Introduce tu nombre:");
        String apellido = capturarTexto("Introduce tu apellido:");
        
        int edad = capturarEdad("Introduce tu edad:");
        double salario = capturarSalario("Introduce tu salario:");
        
        
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Edad = " + edad);
        System.out.println("Salario = " + salario);

        
        
                
    }
    
    //CAPTURAR TEXTO
    public static String capturarTexto(String mensaje){
    
    Scanner captu = new Scanner(System.in);
    System.out.println(mensaje);
    String texto = captu.nextLine();
    return texto;
    }
    
    //MÉTODO PARA CAPTURAR ENTEROS (LO USAREMOS PARA LA EDAD)
    
    public static int capturarEdad(String mensaje){
    Scanner captu = new Scanner(System.in);
    System.out.println(mensaje);
    int edad = captu.nextInt();
    captu.nextLine();
    return edad;
    }
    
    
    //MÉTODO PARA CAPTURAR DOBLUES (CAPTURAR EL SALARIO)
    public static double capturarSalario(String mensaje){
    Scanner captu = new Scanner(System.in);
    System.out.println(mensaje);
    double salario = captu.nextDouble();
    captu.nextLine();
    return salario;
    }
}
