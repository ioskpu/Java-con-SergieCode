public class Persona {
    // Atributos (estado/caracteristicas de un objeto)
    String nombre;
    String apellido;
    int edad;    
    //boolean esEstudiante;
    Carrera carrera;

    //constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean estaEnCurso){
        carrera = new Carrera(nombreCarrera, duracion, estaEnCurso);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;                
        carrera.nombre = nombreCarrera;
    }

    //sobrecarga del constructor
    public Persona(String nombre, String apellido, int edad, String nombreCarrera){
        carrera = new Carrera(nombreCarrera);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;                
    }

    //Metodos (comportamiento/acciones de un objeto)
    public String darNombreCompleto(){
        return nombre + " " + apellido;
    }
    
    public String enviarSaludo(String saludado){
        if(edad > 40) return "Buenos dias, querido " + saludado;
        return "Hola, ¿como estas " + saludado + "?";
    }
}
