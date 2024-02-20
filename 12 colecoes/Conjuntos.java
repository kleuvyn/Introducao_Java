import java.util.HashSet;
import java.util.Set;

public class Conjuntos {
/*
 * (Sets):

    Um conjunto é uma coleção que não permite elementos duplicados e não possui ordem definida.
    As implementações comuns incluem HashSet, LinkedHashSet, TreeSet.
 */

    Set<Integer> numeros = new HashSet<>();
numeros.add(10);
numeros.add(20);
numeros.add(10); // não adicionará, pois 10 já está presente

}
