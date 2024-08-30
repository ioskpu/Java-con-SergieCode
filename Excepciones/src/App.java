public class App {
    public static void main(String[] args) throws Exception {
        //Excepciones: eventos que interrumpen el flujo normal de una aplicacion
        //Checked: deben ser manejadas por el programador
        //Unchecked: no son obligatorias
        //Error: no son obligatorias

        double numero1 = 10;
        int numero2 = 0;
        int resultado;

        try {
            resultado = (int) numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
