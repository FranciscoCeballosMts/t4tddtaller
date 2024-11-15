/**
 * com.example.dev Paquete de desarrollo de la solución
 */
package com.example.dev;
// -encoding UTF-8 -charset UTF-8 -docencoding UTF-8


import java.util.Arrays;

public class Main_Kaprekar {


    public static void main(String[] args) {
        

    }

    public static int ordenarMayor(){
        int b=0;
        return b ;

    }

    public static int kaprekarOp(int i) {
        String numeroStr = Integer.toString(Math.abs(i));
        char[] digitos = numeroStr.toCharArray();
        Arrays.sort(digitos);
        StringBuilder numero = new StringBuilder(new String(digitos));
        StringBuilder numeroMayor = new StringBuilder(new String(digitos));
        numeroMayor.reverse();
        int menor = Integer.parseInt(numero.toString());
        int mayor = Integer.parseInt(numeroMayor.toString());
        return mayor-menor;
    }
    public static int itKaprekar(int i){
        return 3;
    }

//aquí van sus funciones:

}
