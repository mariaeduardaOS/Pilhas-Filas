class Documento {
    private String nome;
    private int tamanho;

    public Documento(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Documento{" + "nome='" + nome + '\'' + ", tamanho=" + tamanho + '}';
    }
}

public class FilaImpressao {
    private Fila<Documento> fila;

    public FilaImpressao(int capacidade) {
        fila = new Fila<>(capacidade);
    }

    public void adicionarDocumento(Documento doc) {
        fila.enfileirar(doc);
    }

    public void imprimirProximo() {
        if (!fila.estaVazia()) {
            Documento doc = fila.desenfileirar();
            System.out.println("Imprimindo: " + doc);
        } else {
            System.out.println("Nenhum documento na fila.");
        }
    }

    public void mostrarFila() {
        System.out.println("Documentos na fila: " + fila.tamanho());
    }

    public static void main(String[] args) {
        FilaImpressao impressora = new FilaImpressao(5);

        impressora.adicionarDocumento(new Documento("Doc1", 10));
        impressora.adicionarDocumento(new Documento("Doc2", 15));
        impressora.adicionarDocumento(new Documento("Doc3", 20));

        impressora.mostrarFila();

        impressora.imprimirProximo();
        impressora.imprimirProximo();

        impressora.mostrarFila();
    }
}