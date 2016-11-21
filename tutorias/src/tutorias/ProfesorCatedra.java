package tutorias;

/**
 * Created by santirogo on 19/11/16.
 */
public class ProfesorCatedra extends Ticherzithos {

    public ProfesorCatedra(String nombre, String id){
        super(nombre, id);
    }

    @Override
    public void cantidadMaterias(int cantidad) {

    }

    @Override
    public double calcularSalario(int horas) {
        return horas * 10000;
    }
}
