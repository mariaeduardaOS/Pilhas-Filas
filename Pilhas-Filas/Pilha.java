
import java.util.ArrayList;

public class Pilha<T> {
   private ArrayList<T> elementos;
   private int capacidade;

   public Pilha(int var1) {
      this.capacidade = var1;
      this.elementos = new ArrayList(var1);
   }

   public void empilhar(T var1) {
      if (this.elementos.size() < this.capacidade) {
         this.elementos.add(var1);
      } else {
         System.out.println("Pilha cheia! Não é possível empilhar mais elementos.");
      }

   }

   public T desempilhar() {
      if (!this.estaVazia()) {
         return this.elementos.remove(this.elementos.size() - 1);
      } else {
         System.out.println("Pilha vazia! Não há elementos para desempilhar.");
         return null;
      }
   }

   public boolean estaVazia() {
      return this.elementos.isEmpty();
   }

   public int getCapacidade() {
      return this.capacidade;
   }

   public void limpar() {
      this.elementos.clear();
   }
}
