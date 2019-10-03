package com.company;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(String titular, double saldo, int numeroConta) {
        super(titular, saldo, numeroConta);
    }

    @Override
    public String getTipo(){
        return super.getTipo() + "Poupança";
    }
}
