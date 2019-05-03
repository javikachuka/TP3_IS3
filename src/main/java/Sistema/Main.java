/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import Modelo.Alumno;
import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author kachu
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;
        System.out.print("Ingrese el tamanio del arreglo: ");
        int val = entrada.nextInt() ;
    
        Alumno [] array = new Alumno[val] ; 
        
        Scanner en = new Scanner(System.in) ;

        for (int i = 0 ; i < val ; i++){
            System.out.print("Ingrese leg: ");
            String leg = en.nextLine();
            System.out.print("ingrese nom: ");
            String nom = en.nextLine();
            System.out.print("ingrese ape: ");
            String ape = en.nextLine();
            System.out.print("ingrese nota: ");
            int not = entrada.nextInt();
            System.out.println("");
            array[i] = new Alumno(leg,nom,ape,not) ;
        }
        
        for (int i = 0 ; i<val ; i++){
           // System.out.println("Alu: "+array[i].getLegajo() + " "+ array[i].getNota() + " " + array[i].getApellido());
            System.out.println("Alumno: " + array[i]);
        }
    }
    
}
