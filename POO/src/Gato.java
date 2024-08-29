// con esto especificamos que la clase Gato hereda de la clase Animal
public class Gato extends Animal{

    public Gato(String nombre, int edad, int cantPatas){
        //con la palabra super estamos asignando la informacion heredada de la clase padre
        super(nombre, edad, cantPatas);
    }

    //sobreescribimos el metodo hacer Sonido de la clase padre
    @Override
    public String hacerSonido(){
        return "Miau";
    }

}
