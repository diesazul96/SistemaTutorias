package tutorias;

/**
 * Created by santirogo on 19/11/16.
 */
public class Universidad {
    private Tutorias tutorias [];

    public Universidad(){
        this.tutorias = new Tutorias[10];
    }

    public Tutorias[] getTutorias() {
        return tutorias;
    }

    public void setTutorias(Tutorias[] tutorias) {
        this.tutorias = tutorias;
    }
}
