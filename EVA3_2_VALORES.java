/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_valores;

/**
 *
 * @author eddyi
 */
public class EVA3_2_VALORES {

    public static void main(String[] args) {

        //NECESITAMOS RECUPERAR EL VALOR, PARA HACER ALGO CON ÉL.
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("Resultado = " + resu);
        //segunda alternativa 
        System.out.println("Resultado = " + sumarDosNumeros(5, 10));
        //NO LES INTERESA EL RESULTADO 

    }
    
    public static int sumarDosNumeros(int num1, int num2){
     
        int suma;
        suma = num1 + num2;
        return num1 + num2;
        
    }
}
