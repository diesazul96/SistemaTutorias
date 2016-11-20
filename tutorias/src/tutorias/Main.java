package tutorias;

import java.util.Scanner;

/**
 * Created by santirogo on 19/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        Universidad u = new Universidad();
        String nombreEstudiante;
        boolean flag = false;
        System.out.println("Bienvenido al sistema de tutorias de la universidad Sergio Arboleda");
        System.out.println("Pulse 1 Para realizar la administración, pulse 2 para pedir una tutoría");
        int opcionIntro = lec.nextInt();
        if (opcionIntro == 1){
            do {
                System.out.println("Pulse: ");
                System.out.println("    1. Agregar profesor");
                System.out.println("    2. Agregar materia");
                int opcionAdm = lec.nextInt();
                if (opcionAdm == 1){
                    System.out.println("Digite el nombre del profesor a agregar");
                    String nombreProfesor = lec.next();
                    System.out.println("Digite el número de identificación del profesor a agregar");
                    String identificacion= lec.next();
                }

            } while(flag);
        }
    }
}
