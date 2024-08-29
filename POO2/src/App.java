public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(3, 4);

        circulo.imprimirInformacion();
        System.out.println("El area del circulo es: " + circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("El area del rectangulo es: " + rectangulo.calcularArea());
    }
}
