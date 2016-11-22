
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

    public StudntBiutifulsito[] getEstudiantes() {
        StudntBiutifulsito es [] = new StudntBiutifulsito[cantidadLimiteEstudiantes];
        for (int i = 0; i < es.length; i++){
            es[i] = estudiantes[i];
        }
        return es;
    }

    public Ticherzithos getProfesor() {
        return profesor;
    }

    public TingAkdemic getMateria() {
        return materia;
    }
}
