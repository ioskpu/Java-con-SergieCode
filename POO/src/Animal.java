public class Animal {

    String nombre;
    int edad;
    int cantPatas;
    static int cantAnimales = 0;

    //constructor
    public Animal(String nombre, int edad, int cantPatas){
        this.nombre = nombre;
        this.edad = edad;
        this.cantPatas = cantPatas;
        cantAnimales++;
    }


    //metodo hacer sonido
    public String hacerSonido(){
        return "sonido generico";
    }

    //metodo para obtener la cantidad de animales
    public static int getCantAnimales(){
        return cantAnimales;
    }
}
