 License Headers in Project Properties/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comentador;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class Comentador {

    /**
     * @param args the command line arguments
     */
    Scanner opcion = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Elija una opcion: ");
        System.out.println("A) Me gusta");
        System.out.println("B) No me gusta");
        System.out.println("S) Salir");
        Scanner opcion = new Scanner(System.in);
        Scanner resena = new Scanner(System.in);
        String resultado=opcion.nextLine();
        
        switch (resultado) {
            case "A":
                System.out.println("Me gusta");
                System.out.println("Puede dejar una breve reseña para conocer su opinion. Le pedimos que la misma sea expresada en forma respetable: ");
                System.out.println(resena.nextLine());
                break;
                
            case "B":
                System.out.println("No me gusta");
                System.out.println("Puede dejar una breve reseña para conocer su opinion. Le pedimos que la misma sea expresada en forma respetable: ");
                System.out.println(resena.nextLine());
                break;
                
            case "S":
                break;
                
            default :
                System.out.println("Opcion invalida");
            }    
        }
    
    }    

