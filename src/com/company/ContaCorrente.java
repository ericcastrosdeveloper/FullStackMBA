package com.company;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(String titular, double saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public double saque(double valor) {
            return saldo-=valor + 0.10;
    }

    @Override
    public String getTipo(){
        return super.getTipo() + "Corrente";
    }
}
