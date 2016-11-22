/**
 * Created by santirogo on 19/11/16.
 */
public class ProfesorPlanta extends Ticherzithos implements Topics{

    public ProfesorPlanta(String nombre, String id){
        super(nombre, id);
    }

    @Override
    public void calcularSalario(int horas) {
        this.setSueldo(this.getSueldo() + (horas*60000));
    }
}
