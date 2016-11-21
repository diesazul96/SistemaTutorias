// Clase: Tutores

public abstract class Ticherzithos extends Pipoll {

    public Ticherzithos(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    
    private TingAkdemic[] materias;
    private String[] Horario;
    private int numeroMaterias;

    public abstract void cantidadMaterias (int cantidad);

    public abstract double calcularSalario(int horas);

    public TingAkdemic[] getMaterias() {
        return materias;

    }

    public void setMaterias(TingAkdemic[] Materias) {
        this.materias = Materias;
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
