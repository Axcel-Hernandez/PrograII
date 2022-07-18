import java.util.Scanner;

public class Pregunta_nombres {

    public static void main (String [] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println ("Ingrese su nombre: " );
        String nom;
        nom = leer.next();
        System.out.println ("Bienvenido a Progra 2 2022 " + nom);
    }

}
