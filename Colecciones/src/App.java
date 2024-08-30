//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        
        //HashSet
        /*System.out.println("Bienvenido a la fiesta de Suepr Heroes");

        Set<String> superHeroes = new HashSet<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Green Lantern");
        superHeroes.add("Supergirl");
        superHeroes.add("Batgirl");
        superHeroes.add("Wonder Woman");

        if (superHeroes.contains("Superman")) {
            System.out.println("Superman esta en la fiesta");
        }

        superHeroes.remove("Batman");

        if (!superHeroes.contains("Batman")) {
            System.out.println("Batman no esta en la fiesta");
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
        }*/

        //TreeSet
        /*System.out.println("Bienvenido a la fiesta de Suepr Heroes");

        Set<String> superHeroes = new TreeSet<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Green Lantern");
        superHeroes.add("Supergirl");
        superHeroes.add("Batgirl");
        superHeroes.add("Wonder Woman");

        if (superHeroes.contains("Superman")) {
            System.out.println("Superman esta en la fiesta");
        }

        superHeroes.remove("Batman");

        if (!superHeroes.contains("Batman")) {
            System.out.println("Batman no esta en la fiesta");
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
        }*/

        //LinkedHashSet
        System.out.println("Bienvenido a la fiesta de Suepr Heroes");

        Set<String> superHeroes = new LinkedHashSet<>();
        superHeroes.add("Superman");
        superHeroes.add("Batman");
        superHeroes.add("Wonder Woman");
        superHeroes.add("Flash");
        superHeroes.add("Aquaman");
        superHeroes.add("Green Lantern");
        superHeroes.add("Supergirl");
        superHeroes.add("Batgirl");
        superHeroes.add("Wonder Woman");

        if (superHeroes.contains("Superman")) {
            System.out.println("Superman esta en la fiesta");
        }

        superHeroes.remove("Batman");

        if (!superHeroes.contains("Batman")) {
            System.out.println("Batman no esta en la fiesta");
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