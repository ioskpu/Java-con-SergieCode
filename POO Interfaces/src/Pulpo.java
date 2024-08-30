import interfaces.Alimentable;
import interfaces.Comunicable;

public class Pulpo extends CriaturasMarinas implements Comunicable, Alimentable{
    int cantTentaculos;
    
    //constructor
    public Pulpo(String nombre, int cantTentaculos) {
        super(nombre);
        this.cantTentaculos = cantTentaculos;
    }

    //metodo
    @Override
    void nadar() {
        System.out.println(nombre + " Esta sumergido con " + cantTentaculos + " tentaculos");
    }

    @Override
    public void comunicarse() {
        System.out.println("El " + nombre + " saluda con sus " + cantTentaculos + " tentaculos");
    }

    @Override
    public void alimentar() {
        System.out.println("El " + nombre + " se alimenta de peces");
    }
}