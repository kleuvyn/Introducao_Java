import java.util.HashMap;
import java.util.Map;

public class Mapas {
/*
 * Maps):

    Um mapa é uma coleção de pares chave-valor, onde cada chave é única.
    As implementações comuns incluem HashMap, LinkedHashMap, TreeMap.
 */

    Map<String, Integer> idadePorNome = new HashMap<>();
idadePorNome.put("Alice", 30);
idadePorNome.put("Bob", 25);
idadePorNome.put("Alice", 35); // substituirá a idade de Alice para 35

}
