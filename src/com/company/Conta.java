package com.company;

public class Conta {

    public static void main(String[] args) {

        System.out.println("Conta 1");
        System.out.println();
        ContaBancaria conta1 = new ContaBancaria("Eric", 5000.00, 1);
        conta1.saque(2000.00);
        conta1.deposita(10000.00);

        System.out.println("Saldo: "+ conta1.getSaldo());
        System.out.println("Titular: "+ conta1.getTitular());
        System.out.println("Numero: "+ conta1.getNumeroConta());

        System.out.println();

        System.out.println("Conta 2");
        System.out.println();
        ContaBancaria conta2 = new ContaBancaria("Danilo", 8000.00, 2);
        conta2.saque(2000.00);
        conta2.deposita(5000.00);

        System.out.println("Saldo: "+ conta2.getSaldo());
        System.out.println("Titular: "+ conta2.getTitular());
        System.out.println("Numero: "+ conta2.getNumeroConta());

    }
}
