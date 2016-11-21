import java.util.ArrayList;

public class Pipoll {
    protected String nombre;
    protected String identificacion;

    public Pipoll(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
}
