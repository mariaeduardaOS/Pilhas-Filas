import java.util.EmptyStackException;

public class Pilha<T> {
    private T[] elementos;
    private int topo;

    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        topo = -1;
    }

    public void empilhar(T elemento) {
        if (topo == elementos.length - 1) {
            throw new StackOverflowError("Pilha cheia");
        }
        elementos[++topo] = elemento;
    }

    public T desempilhar() {
        if (estaVazia()) {
            throw new EmptyStackException();
        }
        return elementos[topo--];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public T topo() {
        if (estaVazia()) {
            throw new EmptyStackException();
        }
        return elementos[topo];
    }
}