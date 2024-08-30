import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la tienda de Verduras");

        Map<String, Double> inventario = new HashMap<>();
        inventario.put("Tomate", 1.5);
        inventario.put("Lechuga", 2.0);
        inventario.put("Zanahoria", 1.0);
        inventario.put("Pimiento", 2.5);
        inventario.put("Pepino", 1.8);

        System.out.println("Inventario de productos");

        for(String fruta : inventario.keySet()){
            System.out.println(fruta + " - $" + inventario.get(fruta));
        }

        String frutaBuscada = "Palta";
        if(inventario.containsKey(frutaBuscada)){
            System.out.println("El precio de " + frutaBuscada + " es de $" + inventario.get(frutaBuscada));
        }else{
            System.out.println("El producto " + frutaBuscada + " no se encuentra en el inventario.");
        }

        String sinStock = "Zanahoria";
        inventario.remove(sinStock);
        System.out.println("Inventario actualizado de productos");
        for(String fruta : inventario.keySet()){
            System.out.println(fruta + " - $" + inventario.get(fruta));
        }

        System.out.println("Inventario despues de la venta es: " + inventario.size());
        
    }
}
