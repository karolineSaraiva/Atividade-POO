package Questao1;

import java.util.ArrayList;

public class Biblioteca {
    private String local;
    private String nome;
    private ArrayList<Livro> acervo;

    //get e set
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        if(local == null){
            System.out.println("local não informado");
            this.local = "local não informado";
        }
        else {
            if (local.equals(" ")) {
                System.out.println("local não informado");
                this.local = "local não informado";
            } else {
                this.local = local;
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            System.out.println("nome não informado");
            this.nome = "nome não informado";
        }
        else {
            if (nome.equals(" ")) {
                System.out.println("nome não informado");
                this.nome = "nome não informado";
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

    // Construtor
    public Biblioteca(String local, String nome) {
        setLocal(local);
        setNome(nome);
        setAcervo(acervo);
    }

    //Metodos
    Livro livro;
    public void addLivro(Livro livro) {
        if(acervo.size() > 150) {
            System.out.println("O acervo atingiu a quantidade maxima");
        }
        else{
            acervo.add(livro);
        }
    }

    public void emprestarLivro(Livro livro) {
        if(livro.getStatus().equals("Disponivel") && acervo.contains(livro)){
            livro.setStatus("Emprestado");
        }
        else{
            System.out.println("Livro não esta disponível");
        }
    }

    public void devolverLivro(Livro livro) {
        if(livro.getStatus().equals("Emprestado") && acervo.contains(livro)){
            livro.setStatus("Disponivel");
        }
        else{
            System.out.println("Livro não emprestado");
        }
    }

    public void mostrarAcervo(){
        System.out.println("Livros disponiveis na "+nome+": ");
        for(Livro livro: acervo){
            System.out.println(livro.getTitulo()+" do Autor "+livro.getNomeAutor()+". Status: "+livro.getStatus());
        }
    }
}
