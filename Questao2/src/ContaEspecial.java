public class ContaEspecial extends ContaBancaria {
    private float limite;

    //GETTER E SETTER
    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if (limite < 0) {          //Verifica se o limite é positivo
            System.out.println("Limite inválido");
        } else {
            this.limite = limite;
        }
    }

    //CONSTRUTOR
    public ContaEspecial(String nomeCliente, int numeroConta, float limite) {
        super(nomeCliente, numeroConta);
        setLimite(limite);
    }

    //METODOS
    public void sacar(float saque){     //Implementação no metodo sacar
        if(getSaldo()-saque < -limite){     //Verifica se o saque ultrapassa o valor limite
            System.out.println("Ultrapassou o limite");
        }
        else{
            setSaldo(getSaldo() - saque);
        }
    }
}

