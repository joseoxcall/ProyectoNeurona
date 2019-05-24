/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neurona;
import java.util.Random;
import java.util.Scanner;


/**
 * @author Foxcal
 */
public class Neurona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] Tabla={{1,1,1},{1,-1,1},{-1,1,1},{-1,-1,-1}}; //table de verdad
        System.out.println("\nInicializar Pesos:\n");
        double w1=new Random().nextDouble()/2.5;
        double w2=new Random().nextDouble()/2.5;
        double θ= -0.4;
        
        double y=0;
        final double E= 0.6;  //factor de aprendizaje
        
        System.out.println("w1: " + w1);
        System.out.println("w2: "+ w2);
        System.out.println("θ:" + θ);
        
        System.out.println("\nIniciando Fase de aprendizaje puerta logica OR...\n");
        int i =0;
        int cout =1;
        while(i<Tabla.length && cout<100){
        y=Math.tan(E)}
        
        
        // TODO code application logic here
    }
    
}
