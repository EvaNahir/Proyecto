/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentador.java;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Comentador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        String Nombre = sc.nextLine();
        System.out.println("Elija una opcion: ");
        String [] calificacion = {"Me gusta", "No me gusta"} ;
        System.out.println(calificacion[0]);
        String Reseña = sc.nextLine();
        System.out.println(Reseña);
        
        }
        
    }
    

