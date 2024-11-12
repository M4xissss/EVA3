/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author eddyi
 */
public class EVA3_6_EXAMEN_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;
    

    public static void main(String[] args) {
     int jugadaUsu;
     int jugadaComp;
     int resuJugada;
    do{
         jugadaUsu = capturarJugada("Introduce tu jugada (1-PIEDRA, 2-PAPEL, 3-TIJERAS, 0-SALIR);");
         jugadaComp = generarJugadaComp();
         System.out.println(jugadaComp);
         resuJugada = evaluarJugadas(jugadaUsu, jugadaComp);
       }while(jugadaUsu != 0);//mientras no quiera salir (opción 0)

    }
    //PEDIR LOS DATOS AL USUARIO
    public static int capturarJugada(String mensaje){
    Scanner captu = new Scanner(System.in);
    System.out.println(mensaje);
    int resu = captu.nextInt();
    return resu;
    
     jugadaComp = generarJugadaComp();
     System.out.println(jugadaComp);
    }
    //GENERAR JUGADA DE LA COMPUTADORA
    public static int generarJugadaComp(){
    int resu;
    double valor = Math.random();
    if((valor >= 0) && (valor < 0.3))
        resu = 1; //PIEDRA
    else if((valor >= 0.3) && (valor <= 0.6))
        resu = 2; //PAPEL
    else 
        resu = 3;//TIJERA
    return resu;
    
    }
    
    //EVALUAR JUGADAS: 0-EMPATE, 1-GANÓ, 2-PERDIÓ
    public static int evaluarJugadas(int jugadaU, int jugadaC){
    //9 POSIBLES COMBINACIONES
    int resu;
    if((jugadaU == PIEDRA) && (jugadaC == PIEDRA))
        resu = 0;
    else if((jugadaU == PIEDRA) && (jugadaC == PAPEL))
        resu = 2;
    else if((jugadaU == PIEDRA) && (jugadaC == TIJERA))
        resu = 3;
        else if((jugadaU == PAPEL) && (jugadaC == PIEDRA))
        resu = 2;
        else if((jugadaU == PAPEL) && (jugadaC == PAPEL))
        resu = 0;
        else if((jugadaU == PAPEL) && (jugadaC == TIJERA))
        resu = 3;
        else if((jugadaU == TIJERA) && (jugadaC == PIEDRA))
        resu = 1;
        else if((jugadaU == TIJERA) && (jugadaC == PAPEL))
        resu = 3;
        else if((jugadaU == TIJERA) && (jugadaC == TIJERA))
        resu = 0;
        return 0;
    }
}
