/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String numConta = JOptionPane.showInputDialog("Digite o numero da conta:");
        String numAgencia = JOptionPane.showInputDialog("Digite a agência:");
        String nomeCliente = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String limiteInicial = JOptionPane.showInputDialog("Digite o limite");
        String saldoInicial = JOptionPane.showInputDialog("Digite o saldo");
        
        Conta contaCliente = new Conta(numConta,nomeCliente,saldoInicial,limiteInicial,numAgencia);
        contaCliente.imprimirSaldo();
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvarConta(contaCliente);
    }
    
}
