public class Carrera {
    String nombre;
    int duracion;
    boolean estaEnCurso;

    //constructor
    public Carrera(String nombre, int duracion, boolean estaEnCurso){
        this.nombre = nombre;
        this.duracion = duracion;
        this.estaEnCurso = estaEnCurso;
    }

    //sobrecarga del constructor
    public Carrera(String nombre){
        this.nombre = nombre;
    }
}
