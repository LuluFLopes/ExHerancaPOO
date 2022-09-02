package com.mycompany.lab1;

/**
 *
 * @author luciano.flopes
 */
public class Main {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("Lucats", 111, 1111);
        ContaPoupanca cp = new ContaPoupanca("Stevart", 222, 2222);
        Saca saca = new Saca();

        // Depositando valores nas contas.
        cc.deposita(400.0, cc);
        cp.deposita(500.0, cp);
        
        System.out.println("Saldo inicial da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo inicial da conta poupança: " +cp.getSaldo());

        // Transferindo valores entre as contas.
        cc.transfere(100.00, cc, cp);

        // Sacando com polimorfismo.
        saca.saca(cp, 200.0, "Stevart");

        cc.extrato(cc);
        cp.extrato(cp);
        
    }
}
