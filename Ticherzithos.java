// Clase: Tutores

public abstract class Ticherzithos extends Pipoll {

    public Ticherzithos(String nombre, String identificacion) {
        super(nombre, identificacion);
    }
    
    private TingAkdemic[] materias;
    private String[] Horario;
    private int numeroMaterias;
    private int sueldo = 0;
    
    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public abstract void calcularSalario(int horas);

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
