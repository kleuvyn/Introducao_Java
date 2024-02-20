import java.util.LinkedList;
import java.util.Queue;

public class Filas {
/*
 * (Queues):

    Uma fila é uma coleção que segue o princípio FIFO (First In, First Out), onde o primeiro elemento adicionado é o primeiro a ser removido.
 */

    Queue<String> fila = new LinkedList<>();
fila.add("Elemento 1");
fila.add("Elemento 2");
String primeiroElemento = fila.poll(); // remove e retorna "Elemento 1"

}
