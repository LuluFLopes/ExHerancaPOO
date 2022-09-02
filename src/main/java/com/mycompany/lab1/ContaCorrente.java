package com.mycompany.lab1;

/**
 *
 * @author luciano.flopes
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeCliente, int numConta, int numAgencia) {
        super(nomeCliente, numConta, numAgencia);
    }

    @Override
    public void deposita(double valor, Conta c) {
        super.deposita(valor, c);
    }

    @Override
    public void transfere(double valor, Conta c1, Conta c2) {
        super.transfere(valor, c1, c2);

    }

    @Override
    public boolean verificaSaldo(double valor, Conta c1) {
        return super.verificaSaldo(valor, c1);
    }

}
