/**
 * Created by santirogo on 19/11/16.
 */
public class ProfesorCatedra extends Ticherzithos implements Topics{

    public ProfesorCatedra(String nombre, String id){
        super(nombre, id);
    }

    @Override
    public void calcularSalario(int horas) {
        this.setSueldo(this.getSueldo() + (horas*80000));
    }
}
