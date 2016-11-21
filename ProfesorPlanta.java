/**
 * Created by santirogo on 19/11/16.
 */
public class ProfesorPlanta extends Ticherzithos implements Topics{

    public ProfesorPlanta(String nombre, String id){
        super(nombre, id);
    }

    @Override
    public void cantidadMaterias(int cantidad) {

    }

    @Override
    public double calcularSalario(int horas) {
        return 0;
    }
}
