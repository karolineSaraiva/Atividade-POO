public abstract class ContaBancaria {
    private String nomeCliente;
    private int numeroConta;
    protected float saldo;

    // GETTER E SETTER
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if(nomeCliente == null){        //Verificar se o campo está vazio
            System.out.println("Nome do cliente não informado");
            this.nomeCliente = "Cliente não informado";
        }
        else {
            if (nomeCliente.equals(" ")) {
                System.out.println("Nome do cliente não informado");
                this.nomeCliente = "Cliente não informado";
            } else {
                this.nomeCliente = nomeCliente;
            }
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta < 0){            //Verificar se o numero informado é negativo
            System.out.println("Número de conta inválido.");
        }
        else {
            this.numeroConta = numeroConta;
        }
    }

    public float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //CONSTRUTOR
    public ContaBancaria(String nomeCliente, int numeroConta) {
        setNomeCliente(nomeCliente);
        setNumeroConta(numeroConta);
        this.saldo = 0;
    }

    // METODOS
    abstract void sacar(float valor);   //Abstrato para ser implementado pelas sub

    public void depositar(float valor){
        if(valor <= 0){         //Verifica se o valor do deposito é positivo
            System.out.println("Deposito inválido");
        }
        else{
            this.saldo = getSaldo() + valor;
        }
    }
}
