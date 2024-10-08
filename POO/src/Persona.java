public class Persona {
    // Atributos (estado/caracteristicas de un objeto)
    private String nombre;
    private String apellido;
    private int edad;    
    

    //constructor
    public Persona(String nombre, String apellido, int edad){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;                
        
    }    

    //Metodos (comportamiento/acciones de un objeto)
    public String darNombreCompleto(){
        return this.nombre + " " + this.apellido;
    }
    
    public String enviarSaludo(String saludado){
        if(edad > 40) return "Buenos dias, querido " + saludado;
        return "Hola, ¿como estas " + saludado + "?";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
