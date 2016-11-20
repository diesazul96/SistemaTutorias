package tutorias;

/**
 * Created by santirogo on 19/11/16.
 */
public class Tutorias {
    private Ticherzithos profesores [];
    private TingAkdemic materias;

    public Tutorias(Ticherzithos profe, TingAkdemic materias){
        this.profesores = new Ticherzithos[5];
        this.materias = new TingAkdemic();
    }

    public Ticherzithos[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Ticherzithos[] profesores) {
        this.profesores = profesores;
    }

    public TingAkdemic getMaterias() {
        return materias;
    }

    public void setMaterias(TingAkdemic materias) {
        this.materias = materias;
    }
}
