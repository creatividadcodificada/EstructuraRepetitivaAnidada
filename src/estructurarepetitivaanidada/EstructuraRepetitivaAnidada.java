/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarepetitivaanidada;
/**
 *
 * @author Creatividad Codificada
 */
public class EstructuraRepetitivaAnidada {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte tamanio = 9; //cambia el tamaño del Rombo
        byte aux = tamanio;
        String impresion=" ";  
        //Parte superior del triangulo
        for (byte i = 1; i <= tamanio; i++) { 
            for (byte j = aux; j>=1; j--) 
            { 
                impresion = impresion + " "; 
            } 
            byte acum = i; 
            acum = (byte) (2*acum-1); 
            for(int j=1; j<=acum;j++) 
            { 
                impresion += "@"; 
            } 
            System.out.println(impresion); 
            impresion = " "; 
            aux --; 
        }
            // Parte inferior del triangulo
        for (byte i = (byte) (tamanio+1); i >= 0; i--) { 
            for (byte j = 1; j<=aux; j++) 
            { 
                impresion = impresion + " "; 
            } 
            byte acum = i; 
            acum = (byte) (2*acum-1); 
            for(byte j=acum; j>=1;j--) 
            { 
                impresion += "@"; 
            } 
            System.out.println(impresion); 
            impresion = " "; 
            aux ++; 
        }	
    } 
}
    

