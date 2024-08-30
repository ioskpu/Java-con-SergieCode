import java.util.HashMap;
import java.util.Map;

public class AppMaps {
    public static void main(String[] args) throws Exception {
        Map<String, String> superHeroes = new HashMap<>();
        superHeroes.put("Superman", "Clark Kent");
        superHeroes.put("Batman", "Bruce Wayne");
        superHeroes.put("Wonder Woman", "Diana Prince");
        superHeroes.put("Flash", "Barry Allen");

        System.out.println("Super Heroes: " + superHeroes);

        superHeroes.put("Batman", "Bruce Wayne");
        System.out.println("Super Heroes: " + superHeroes);

        superHeroes.remove("Flash");
        System.out.println("Super Heroes: " + superHeroes);
    }
}
