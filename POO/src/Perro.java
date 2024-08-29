public class Perro extends Animal{

    public Perro(String nombre, int edad, int cantPatas){
        super(nombre, edad, cantPatas);
    }

    // con el decorador @Override sobreescribimos el metodo hacerSonido de la clase padre
    @Override
    public String hacerSonido(){
        return "Guau";
    }
}
