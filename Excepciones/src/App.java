import Exceptions.CalculadoraExceptions;

public class App {
    public static void main(String[] args) throws Exception {
        //Excepciones: eventos que interrumpen el flujo normal de una aplicacion
        //Checked: deben ser manejadas por el programador
        //Unchecked: no son obligatorias
        //Error: no son obligatorias

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calculadora = new Calculadora();

        try {
            resultado =  calculadora.dividir(numero1, numero2);
            System.out.println("El resultado es: " + resultado);
        } catch (CalculadoraExceptions e) {
            e.printStackTrace();
        }finally{
            System.out.println("Fin del programa");
        }
    }
}
