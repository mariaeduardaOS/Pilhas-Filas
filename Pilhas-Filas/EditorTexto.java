public class EditorTexto {
    private Pilha<String> pilhaDesfazer;
    private Pilha<String> pilhaRefazer;
    private String textoAtual;

    public EditorTexto(int capacidade) {
        pilhaDesfazer = new Pilha<>(capacidade);
        pilhaRefazer = new Pilha<>(capacidade);
        textoAtual = "";
    }

   
   public void inserirTexto(String novoTexto) {
    pilhaDesfazer.empilhar(textoAtual);
    textoAtual = novoTexto;
    pilhaRefazer = new Pilha<>(pilhaDesfazer.getCapacidade()); 
}

    public void desfazer() {
        if (!pilhaDesfazer.estaVazia()) {
            pilhaRefazer.empilhar(textoAtual);
            textoAtual = pilhaDesfazer.desempilhar();
        }
    }

    public void refazer() {
        if (!pilhaRefazer.estaVazia()) {
            pilhaDesfazer.empilhar(textoAtual);
            textoAtual = pilhaRefazer.desempilhar();
        }
    }

    public String getTextoAtual() {
        return textoAtual;
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto(10);

        editor.inserirTexto("Texto inicial");
        System.out.println("Texto atual: " + editor.getTextoAtual());

        editor.inserirTexto("Texto adicionado");
        System.out.println("Texto atual: " + editor.getTextoAtual());

        editor.desfazer();
        System.out.println("Após desfazer: " + editor.getTextoAtual());

        editor.refazer();
        System.out.println("Após refazer: " + editor.getTextoAtual());

        editor.inserirTexto("Novo texto");
        System.out.println("Texto atual: " + editor.getTextoAtual());

        editor.desfazer();
        editor.desfazer();
        System.out.println("Após desfazer múltiplas vezes: " + editor.getTextoAtual());
    }
}
