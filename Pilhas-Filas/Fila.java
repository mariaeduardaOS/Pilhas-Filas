import java.util.ArrayList;

public class Pilha<T> {
    private ArrayList<T> elementos;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new ArrayList<>(capacidade);
    }

    public void empilhar(T elemento) {
        if (elementos.size() < capacidade) {
            elementos.add(elemento);
        } else {
            System.out.println("Pilha cheia! Não é possível empilhar mais elementos.");
        }
    }

    public T desempilhar() {
        if (!estaVazia()) {
            return elementos.remove(elementos.size() - 1);
        } else {
            System.out.println("Pilha vazia! Não há elementos para desempilhar.");
            return null;
        }
    }

    public boolean estaVazia() {
        return elementos.isEmpty();
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void limpar() {
        elementos.clear();
    }
}
