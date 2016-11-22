import java.util.Scanner;

/**
 * Created by santirogo on 19/11/16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        Universidad u = new Universidad();
        boolean flag = false;
        int resSalir = 0;
        do {
            System.out.println("Bienvenido al sistema de tutorias de la universidad Sergio Arboleda");
            System.out.println("Pulse: ");
            System.out.println("    1. Crear una tutoría");
            System.out.println("    2. Pedir una tutoría");
            System.out.println("    3. Listar todas las tutorías");
            int opcionIntro = lec.nextInt();
            if (opcionIntro == 1) {
                do {
                    System.out.println("Digite:");
                    System.out.println("    1. Agregar profesor de planta");
                    System.out.println("    2. Agregar profesor de cátedra");
                    int opcionTipoProfe = lec.nextInt();
                    if (opcionTipoProfe == 1) {
                        System.out.println("Digite el nombre del profesor de planta a agregar");
                        String nombreProfesor = lec.next();
                        System.out.println("Digite el número de identificación del profesor de planta a agregar");
                        String identificacionProfesor = lec.next();
                        Ticherzithos pp = new ProfesorPlanta(nombreProfesor, identificacionProfesor);
                        System.out.println("Digite el nombre de la materia a agregar");
                        String nombreMateria = lec.next();
                        System.out.println("Digite el numero de horas de la tutoria");
                        String horas = lec.next();
                        int salario = pp.calcularSalario(horas);
                        System.out.println("El pago que se debe hacer por esta tutoria es de " + salario);
                        TingAkdemic m = new TingAkdemic(nombreMateria);
                        Tutorias tut = new Tutorias(pp, m);
                        System.out.println("Tutoría de "+m.getNombre()+" con el profesor(a) "+pp.getNombre()+" creada correctamente");
                        u.agregarTutoria(tut);
                    } else {
                        System.out.println("Digite el nombre del profesor de cátedra a agregar");
                        String nombreProfesor = lec.next();
                        System.out.println("Digite el número de identificación del profesor de cátedra a agregar");
                        String identificacionProfesor = lec.next();
                        Ticherzithos pc = new ProfesorCatedra(nombreProfesor, identificacionProfesor);
                        System.out.println("Profesor de cátedra agregado correctamente");
                        System.out.println("Digite el nombre de la materia a agregar");
                        String nombreMateria = lec.next();
                        System.out.println("Digite el numero de horas de la tutoria");
                        String horas = lec.next();
                        int salario = pc.calcularSalario(horas);
                        System.out.println("El pago que se debe hacer por esta tutoria es de " + salario);
                        TingAkdemic m = new TingAkdemic(nombreMateria);
                        System.out.println("materia " + nombreMateria + " agregada correctamente");
                        Tutorias tut = new Tutorias(pc, m);
                        System.out.println("Tutoría de "+m.getNombre()+" con el profesor(a) "+pc.getNombre()+" creada correctamente");
                        u.agregarTutoria(tut);
                    }

                    System.out.println("¿Desea continuar en el menú de administración de tutorías? (Pulse 1.Sí, 2.No)");
                    int ans = lec.nextInt();
                    if (ans == 1) flag = true;
                    else flag = false;
                } while (flag);
            } else if (opcionIntro == 2) {
                do {
                    System.out.println("Escriba su name");
                    String nameStudiante = lec.next();
                    System.out.println("Digite su documento de identificación");
                    String idEstudiante = lec.next();
                    StudntBiutifulsito estudiante = new StudntBiutifulsito(nameStudiante, idEstudiante);
                    System.out.println("Escriba el nombre de la materia");
                    String nombreMateria = lec.next();
                    Tutorias t [] = u.buscarTutoria(nombreMateria);
                    System.out.println("total : "+t.length);
                    System.out.println("Se encontraron las siguientes tutorías para la materia "+nombreMateria);
                    for (int i = 0; i < t.length; i++){
                        System.out.println(i+1+". "+t[i].getProfesor().getNombre());
                    }
                    System.out.println("Por favor digite el número correspondiente para la inscripción");
                    int numExcogido = lec.nextInt();
                    numExcogido--;
                    u.inscribirEstudiante(estudiante, t[numExcogido]);
                    System.out.println("el imbécil "+nameStudiante+", se ha inscrito a "+t[numExcogido].getMateria().getNombre());

                    System.out.println("¿Desea pedir otra tutoría (Pulse 1.Sí, 2.No)");
                    int ans = lec.nextInt();
                    if (ans == 1) flag = true;
                    else flag = false;
                } while (flag);
            }else if(opcionIntro == 3){
                Tutorias aux [] = u.getTutorias();
                for (int i = 0; i < aux.length; i++) {
                    System.out.println(aux[i].getMateria().getNombre() + " Profesor: " + aux[i].getProfesor().getNombre());
                    System.out.println("    Estudiantes:");
                    StudntBiutifulsito auxEs[] = aux[i].getEstudiantes();

                    for (int j = 0; j < auxEs.length; j++) {
                        System.out.println("        Nombre: " + auxEs[j].getNombre() + ", id: " + auxEs[j].getIdentificacion());
                    }

                }

            }
            System.out.println("¿Desea volver al menú principal? (1.Sí, 2.Salir)");
            resSalir = lec.nextInt();
        }while(resSalir == 1);
    }
}
