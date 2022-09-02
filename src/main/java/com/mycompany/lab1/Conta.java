package com.mycompany.lab1;

/**
 *
 * @author luciano.flopes
 */
public abstract class Conta {

    private String nomeCliente;
    private int numConta;
    private int numAgencia;
    private double saldo;

    public Conta(String nomeCliente, int numConta, int numAgencia) {

        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.numAgencia = numAgencia;

    }

    public void deposita(double valor, Conta c) {
        c.setSaldo(valor);
    }

    public void transfere(double valor, Conta c1, Conta c2) {

        if (verificaSaldo(valor, c1)) {
            c1.setSaldo(c1.getSaldo() - valor);
            c2.setSaldo(c2.getSaldo() + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    public boolean verificaSaldo(double valor, Conta c) {
        if (c.getSaldo() > valor) {
            return true;
        }
        return false;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
