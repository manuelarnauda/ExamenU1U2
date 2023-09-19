
package examenu1u2;
import java.util.Scanner;

public class ExamenU1U2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double producto1 = 30;
        double producto2 = 65;
        double producto3 = 15;
        
        System.out.println("Escriba el nombre del primer videojuego ");
        String juego1 = scanner.nextLine();
        System.out.println("Escriba el nombre del segundo videojuego ");
        String juego2 = scanner.nextLine();
        System.out.println("Escriba el nombre del tercer videojuego ");
        String juego3 = scanner.nextLine();
        
        
        System.out.println("Ingrese el precio del primer producto ");
        double primerproducto = scanner.nextDouble();
        System.out.println("Ingrese el precio del segundo producto ");
        double segundoproducto = scanner.nextDouble();
        System.out.println("Ingrese el precio del tercer producto");
        double tercerproducto = scanner.nextDouble();
        
        double preciofinal1 = primerproducto * producto1/100;
        double preciofinal2 = segundoproducto * producto2/100;
        double preciofinal3 = tercerproducto * producto3/100;
        
        double total1 = primerproducto - preciofinal1;
        double total2 = segundoproducto - preciofinal2;
        double total3 = tercerproducto - preciofinal3;
         
         System.out.println("El precio final de " + juego1 + " es de " + total1);
         System.out.println("El precio final de " + juego2 + " es de " + total2);
         System.out.println("El precio final de " + juego3 + " es de " + total3);
         
         scanner.close();
        
         
        
      
        
        
        
    }
    
}
