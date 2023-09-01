public class ContaPoupanca extends ContaBancaria{
    private int diaDeRendimento;
    private double taxaDeRendimento;

    //GETTER E SETTER
    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        if(diaDeRendimento < 0){        //Verifica se o dia é positivo
            System.out.println("Dia inválido");
        }
        else{
            this.diaDeRendimento = diaDeRendimento;
        }
    }

    public double getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(double taxaDeRendimento) {
        if(taxaDeRendimento < 0){       //Não permite que a taxa seja um valor negativo
            System.out.println("Taxa inválida");
        }
        else{
            this.taxaDeRendimento = taxaDeRendimento;
        }
    }

    //CONSTRUTOR
    public ContaPoupanca(String nomeCliente, int numeroConta, int diaDeRendimento, double taxaDeRendimento) {
        super(nomeCliente, numeroConta);
        setDiaDeRendimento(diaDeRendimento);
        setTaxaDeRendimento(taxaDeRendimento);
    }

    //METODOS
    public void sacar(float valor){     //IMPLEMENTAÇÃO DO METODO SACAR
        if(valor > getSaldo()){     //Verifica se o saldo é maior que o saque
            System.out.println("Saque inválido");
        }
        else{
            setSaldo(getSaldo() - valor);
        }
    }
    public void calcularNovoSaldo(){
        float novoSaldo = 0;
        for(int i=0; i<getDiaDeRendimento(); i++){  //Calcula o valor do saldo de acordo com a taxa e o numero de dias
            novoSaldo = (float) (getSaldo() + (getSaldo()*getTaxaDeRendimento()));
        }
        if(novoSaldo < 0){      //O saldo não pode ser negativo
            System.out.println("Saldo inválido");
        }
        else{
            setSaldo(novoSaldo);
        }
    }
}

