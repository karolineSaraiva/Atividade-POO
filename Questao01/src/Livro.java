public class Livro {
    private String titulo;
    private String nomeAutor;
    private int anoPubli;
    private int numPag;
    private String status;

    //GETTER E SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null){             //Verificar se o título está vazio
            System.out.println("Título não informado.");
            this.titulo = "Sem titulo";
        }
        else{
            if(titulo.equals(" ")){
                System.out.println("Título não informado.");
                this.titulo = "Sem titulo";
            }
            else{
                this.titulo = titulo;
            }
        }
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        if(nomeAutor == null){              //Verificar se o nome está vazio
            System.out.println("Autor não informado");
            this.nomeAutor = "Autor não informado";
        }
        else {
            if (nomeAutor.equals(" ")) {
                System.out.println("Autor não informado");
                this.nomeAutor = "Autor não informado";
            } else {
                this.nomeAutor = nomeAutor;
            }
        }
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        if(anoPubli < 0){                   //Não permitir um set de ano negativo
            System.out.println("Ano inválido!");
        }
        else{
            this.anoPubli = anoPubli;
        }
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        if(numPag < 150 || numPag > 1000){ //Verificar se o número de páginas está entre 150 e 1000
            System.out.println("Número de páginas fora do intervalo esperado.");
        }
        else{
            this.numPag = numPag;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String attStatus) {
        this.status = attStatus;
    }

    //CONSTRUTOR
    public Livro(String titulo, String nomeAutor, int anoPubli, int numPag) {
        setTitulo(titulo);
        setNomeAutor(nomeAutor);
        setAnoPubli(anoPubli);
        setNumPag(numPag);
        setStatus("Disponivel");
    }
}
