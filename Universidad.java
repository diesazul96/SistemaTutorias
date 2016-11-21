/**
 * Created by santirogo on 19/11/16.
 */
public class Universidad {
    private int informacion [][];
    private Tutorias tutorias [];
    private int cantidadTutorias;

    public Universidad(){
        this.informacion =new int[10][10];
        this.tutorias = new Tutorias[10];
        this.cantidadTutorias = 0;
    }

    public void agregarTutoria(Tutorias tutoria){
        if (this.cantidadTutorias < 10){
            this.tutorias [cantidadTutorias] = tutoria;
            cantidadTutorias++;
        }
    }

    public void inscribirEstudiante(StudntBiutifulsito studiante, Tutorias tutoria){
        for (int i = 0; i < this.tutorias.length; i++){
            if (this.tutorias[i] == tutoria){
                this.tutorias[i].agregarEstudiante(studiante);
            }
        }
    }

    public Tutorias [] buscarTutoria (String nombreTutoria){
        int cantidadPedida = 0;
        for (int i = 0; i < cantidadTutorias; i++){
            if (this.tutorias[i].getMateria().getNombre().equalsIgnoreCase(nombreTutoria)){
                cantidadPedida++;
            }
        }
        int cont = 0;
        Tutorias aux [] = new Tutorias[cantidadPedida];
        for (int i = 0; i < cantidadTutorias; i++){
            if (this.tutorias[i].getMateria().getNombre().equalsIgnoreCase(nombreTutoria)){
                aux [cont] = this.tutorias[i];
                cont++;
            }
        }
        return aux;
    }

    public Tutorias[] getTutorias() {
        Tutorias tu [] = new Tutorias[cantidadTutorias];
        for (int i = 0; i < tu.length; i++) {
            tu[i] = this.tutorias [i];
        }
        return tu;
    }

    public void setTutorias(Tutorias[] tutorias) {
        this.tutorias = tutorias;
    }
}
