public class Main {
    public static void main(String[] args){
        Livro livro = new Livro("banana", "joao", 2000, 400);
        Livro livro1 = new Livro("manga", "joao", 2000, 400);
        Livro livro2 = new Livro("manga", "joao", 2000, 400);
        Biblioteca b = new Biblioteca("Centro", "Biblioteca central");

        b.addLivro(livro);
        b.addLivro(livro1);
        b.addLivro(livro2);
        b.mostrarAcervo();
        b.emprestarLivro(livro2);
        b.emprestarLivro(livro1);
        b.mostrarAcervo();
        b.emprestarLivro(livro1);
        b.devolverLivro(livro);

        //System.out.println(livro.getNumPag());
    }
}
