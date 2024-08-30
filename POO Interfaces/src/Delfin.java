import interfaces.Alimentable;
import interfaces.Comunicable;

public class Delfin extends CriaturasMarinas implements Comunicable, Alimentable{
    //constructor
    public Delfin(String nombre) {
        super(nombre);
    }

    //metodo
    @Override
    void nadar() {
        System.out.println(nombre + " esta nadando");
}

    @Override
    public void comunicarse() {
        System.out.println("El " + nombre + " emite sonidos para comunicarse");
    }

    @Override
    public void alimentar() {
       System.out.println("El " + nombre + " se alimenta de peces y moluscos");
    }
}