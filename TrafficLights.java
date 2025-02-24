import java.util.Scanner;
public class TrafficLights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el color del semáforo: ");
        //Escribe un programa que basado en el color del semáforo verde, amarillo o rojo determine las acciones de un conductor 
        
        //Si es verde imprime en la terminal: Puedes seguir
        //Si es amarillo imprime en la terminal: Ten cuidado
        //Si es rojo imprime en la terminal: ¡¡¡Para!!!
        //Si es otro color imprime en la terminal: El semáforo está dañado
        String color = scanner.nextLine().toLowerCase();

        if (color.equals("verde")) {
            System.out.println("\nPuedes seguir");
        } else if (color.equals("amarillo")) {
            System.out.println("\nTen cuidado");
        } else if (color.equals("rojo")) {
            System.out.println("\n¡¡¡Para!!!");
        } else {
            System.out.println("\nEl semáforo está dañado");
        }


        //Cambia el valor de la variable, corre el programa y mira el resultado 
    scanner.close();

    }
    
}
