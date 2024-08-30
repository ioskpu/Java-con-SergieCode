import java.util.ArrayList;
import java.util.List;

public class AppList {
    public static void main(String[] args) throws Exception {
        List<String> superHeroes = new ArrayList<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Green Lantern");

        if (superHeroes.contains("Superman")) {
            System.out.println("Superman esta en la fiesta");
        }

        System.out.println("Hay un super herore borrachon en la fiesta, y este es " + superHeroes.get(3));

        //modificar super heroe
        superHeroes.set(0, "Clark Kent");
        System.out.println("Superman se a quitado la capa para convertirse en: " + superHeroes.get(0));
        
        superHeroes.remove(2);

        if (!superHeroes.contains("Wonder Woman")) {
            System.out.println("Wonder Woman no esta en la fiesta");
        }

        //superHeroes.add("Superman");

        if (superHeroes.isEmpty()) {
            System.out.println("No hay super heroes en la fiesta");
        } else {
            System.out.println("Hay " + superHeroes.size() + " super heroes en la fiesta");
        }

        System.out.println("Los super heroes que estan en la fiesta son:");
        for (String superHeroe : superHeroes) {
            System.out.println(superHeroe);
        }
    }
}
