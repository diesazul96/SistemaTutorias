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
                    System.out.println("Digite:");
                    System.out.println("    1. Agregar profesor de planta");
                    System.out.println("    2. Agregar profesor de cátedra");
                    int opcionTipoProfe = lec.nextInt();
                    if (opcionTipoProfe == 1){
                        System.out.println("Digite el nombre del profesor de planta a agregar");
                        String nombreProfesor = lec.next();
                        System.out.println("Digite el número de identificación del profesor de planta a agregar");
                        String identificacion= lec.next();
                        ProfesorPlanta pp = new ProfesorPlanta(nombreProfesor, identificacion);
                        System.out.println("Profesor de planta agregado correctamente");
                    }else{
                        System.out.println("Digite el nombre del profesor de cátedra a agregar");
                        String nombreProfesor = lec.next();
                        System.out.println("Digite el número de identificación del profesor de cátedra a agregar");
                        String identificacion= lec.next();
                        ProfesorCatedra pc = new ProfesorCatedra(nombreProfesor, identificacion);
                        System.out.println("Profesor de cátedra agregado correctamente");
                    }
                }else{
                    System.out.println("Digite el nombre de la materia a agregar");
                    String nombreMateria = lec.next();
                    TingAkdemic m = new TingAkdemic(nombreMateria);
                    System.out.println("materia "+nombreMateria+" agregada correctamente");
                }
                System.out.println("¿Desea continuar en con el menú de administración de tutorías? (Pulse 1.Sí, 2.No)");
                int ans = lec.nextInt();
                if (ans == 1) flag = true;
                else flag = false;
            } while(flag);
        }else if(opcionIntro == 2){
            do {


                System.out.println("¿Desea pedir otra tutoría (Pulse 1.Sí, 2.No)");
                int ans= lec.nextInt();
                if (ans == 1) flag = true;
                else flag = false;
            }while(flag);
        }
    }
}
