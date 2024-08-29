public class Animal {

    String nombre;
    int edad;
    int cantPatas;

    //constructor
    public Animal(String nombre, int edad, int cantPatas){
        this.nombre = nombre;
        this.edad = edad;
        this.cantPatas = cantPatas;
    }


    //metodo hacer sonido
    public String hacerSonido(){
        return "sonido generico";
    }
}
