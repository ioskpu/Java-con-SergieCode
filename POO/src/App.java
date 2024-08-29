public class App {
    public static void main(String[] args) throws Exception {
        /*//instanciar un objeto persona
        Persona persona1 = new Persona("Luis", "Corales", 50);
        //imprimir el nombre completo de la persona
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años");*/

        //instanciar animal
        Animal animal1 = new Animal("Caballo", 5, 4);

        //instanciar gato
        Gato gato1 = new Gato("Gato", 3, 4);

        //instanciar perro
        Perro perro1 = new Perro("Perro", 4, 4);

        System.out.println("El animal llamado " + animal1.nombre + " hace " + animal1.hacerSonido());

        System.out.println("El gato llamado " + gato1.nombre + " hace " + gato1.hacerSonido());

        System.out.println("El perro llamado " + perro1.nombre + " hace " + perro1.hacerSonido());
    }
}