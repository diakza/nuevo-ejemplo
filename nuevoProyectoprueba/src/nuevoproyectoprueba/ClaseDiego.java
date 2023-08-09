/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nuevoproyectoprueba;

import java.util.Scanner;

/**
 *
 * @author diakz
 */
public class ClaseDiego {

    public void menu() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido al menú del repositorio ");
        System.out.println("1. puto el que lee ");
        System.out.println("2. que es lo que haces culeado? ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. Salir");

        System.out.print("Ingrese la opción que desea: ");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("weiyurgiouwer");

                break;
            case 2:
                System.out.println(" son unos genios");

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;

        }
    
    
     Scanner input = new Scanner(System.in);
        // Get the three numbers from the user.
        System.out.println("Enter three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        // Find the largest number.
        int largest = Math.max(num1, Math.max(num2, num3));
        // Find the smallest number.
        int smallest = Math.min(num1, Math.min(num2, num3));
        // Print the results.
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
