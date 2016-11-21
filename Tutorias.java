/**
 * Created by santirogo on 19/11/16.
 */
public class Tutorias {
    private Ticherzithos profesor;
    private TingAkdemic materia;
    private StudntBiutifulsito estudiantes [];
    private int cantidadLimiteEstudiantes;

    public Tutorias(Ticherzithos profe, TingAkdemic materia){
        this.profesor = profe;
        this.materia = materia;
        this.estudiantes = new StudntBiutifulsito[5];
        this.cantidadLimiteEstudiantes = 0;
    }

    public void agregarEstudiante(StudntBiutifulsito studiante){
        if (cantidadLimiteEstudiantes < 5){
            this.estudiantes[cantidadLimiteEstudiantes] = studiante;
            cantidadLimiteEstudiantes++;
        }
    }

    public Ticherzithos getProfesor() {
        return profesor;
    }

    public TingAkdemic getMateria() {
        return materia;
    }
}
