public class App {
    public static void main(String[] args) throws Exception {
        //instanciar un objeto persona
        Persona persona1 = new Persona("Luis", "Corales", 50);
        //imprimir el nombre completo de la persona
        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años");
    }
}