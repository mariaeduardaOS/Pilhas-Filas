import java.util.LinkedList;
import java.util.Queue;

public class Fila<T> {
    private Queue<T> elementos;
    private int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new LinkedList<>();
    }

    public void enfileirar(T elemento) {
        if (elementos.size() < capacidade) {
            elementos.add(elemento);
        } else {
            System.out.println("Fila cheia!");
        }
    }

    public T desenfileirar() {
        if (!estaVazia()) {
            return elementos.poll();
        } else {
            System.out.println("Fila vazia!");
            return null;
        }
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int tamanho() {
        return elementos.size();
    }
}
