public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("DIÁRIO DE UM BANANA", "João", 2000, 400);
        Livro livro1 = new Livro("O ALQUIMISTA", "Maria", 2000, 400);
        Livro livro2 = new Livro("DIÁRIO DE UM BANANA", "João", 2000, 400);
        Biblioteca b = new Biblioteca("Centro", "Biblioteca central");

        //ADICIONANDO LIVROS AO ACERVO
        b.addLivro(livro);
        b.addLivro(livro1);
        b.addLivro(livro2);

        b.mostrarAcervo(); // MOSTRA O ACERVO

        //EMPRESTA LIVROS
        b.emprestarLivro(livro2);
        b.emprestarLivro(livro1);

        b.mostrarAcervo(); //MOSTRA NO ACERVO

        b.emprestarLivro(livro1); //TENTA EMPRESTAR NOVAMENTE O MESMO LIVRO

        b.devolverLivro(livro); //METODO DE DEVOLUÇÃO

    }
}
