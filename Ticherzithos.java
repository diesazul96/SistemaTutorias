// Clase: Tutores
public abstract class Ticherzithos extends Pipoll{

    public Ticherzithos(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    
    private TingAkdemic[] Materias;
    private String[] Horario;
    private int numeroMaterias;

    public TingAkdemic[] getMaterias() {
        return Materias;
    }

    public void setMaterias(TingAkdemic[] Materias) {
        this.Materias = Materias;
    }

    public String[] getHorario() {
        return Horario;
    }

    public void setHorario(String[] Horario) {
        this.Horario = Horario;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }
    
}
