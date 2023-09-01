import java.util.ArrayList;

public class Biblioteca {
    private String local;
    private String nome;
    private ArrayList<Livro> acervo;

    //GETTER E SETTER
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if(local == null){          //Verificar se o local está vazio
            System.out.println("Local não informado.");
            this.local = "Local não informado";
        }
        else {
            if (local.equals(" ")) {
                System.out.println("local não informado.");
                this.local = "Local não informado";
            } else {
                this.local = local;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){           //Verificar se o nome está vazio
            System.out.println("Nome não informado.");
            this.nome = "Sem nome";
        }
        else {
            if (nome.equals(" ")) {
                System.out.println("Nome não informado.");
                this.nome = "Sem nome";
            } else {
                this.nome = nome;
            }
        }
    }

    public ArrayList<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(ArrayList<Livro> acervo) {
        this.acervo = new ArrayList<>();
    }

    // CONSTRUTOR
    public Biblioteca(String local, String nome) {
        setLocal(local);
        setNome(nome);
        setAcervo(acervo);
    }

    //METODOS
    public void addLivro(Livro livro) {
        if(acervo.size() > 150) {     //Adiciona livros ao acervo até que ele atinja sua capacidade máxima
            System.out.println("O acervo atingiu a quantidade maxima");
        }
        else{
            acervo.add(livro);
        }
    }

    public void emprestarLivro(Livro livro) {   //Verifica se um livro pertence ao acervo e muda seu status
        if(livro.getStatus().equals("Disponivel") && acervo.contains(livro)){
            livro.setStatus("Emprestado");
        }
        else{
            System.out.println("Livro não esta disponível");
        }
    }

    public void devolverLivro(Livro livro) {    //Verifica se um livro pertence ao acervo e muda seu status
        if(livro.getStatus().equals("Emprestado") && acervo.contains(livro)){
            livro.setStatus("Disponivel");
        }
        else{
            System.out.println("Livro não emprestado");
        }
    }

    public void mostrarAcervo(){        //Lista os livros que pertencem ao acervo
        System.out.println("Livros presentes no acervo na "+nome+": ");
        for(Livro livro: acervo){
            System.out.println(livro.getTitulo()+" do Autor "+livro.getNomeAutor()+". Status: "+livro.getStatus());
        }
    }
}
