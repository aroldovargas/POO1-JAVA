/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;


import javax.swing.JOptionPane;
        
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numContaCC = JOptionPane.showInputDialog("Digite o numero da conta corrente:");
        String numAgenciaCC = JOptionPane.showInputDialog("Digite a agência:");
        String nomeClienteCC = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String limiteCC = JOptionPane.showInputDialog("Digite o limite inicial:");
        String saldoInicialCC = JOptionPane.showInputDialog("Digite o saldo inicial:");
        
        ContaCorrente CC_cliente = new ContaCorrente(numContaCC,numAgenciaCC,nomeClienteCC,limiteCC,saldoInicialCC);
        CC_cliente.imprimeSaldo();
        
        String numContaCP = JOptionPane.showInputDialog("Digite o numero da conta poupanca");
        String numAgenciaCP = JOptionPane.showInputDialog("Digite a agência:");
        String nomeClienteCP = JOptionPane.showInputDialog("Digite o nome do cliente:");
        String saldoInicialCP = JOptionPane.showInputDialog("Digite o saldo inicial:");
        
        ContaPoupanca CP_cliente = new ContaPoupanca(numAgenciaCP,nomeClienteCP,saldoInicialCP,numContaCP);
        CP_cliente.imprimeSaldo();
        
        PersistenciaArquivo salvar = new PersistenciaArquivo();
        salvar.salvarContaCC(CC_cliente);
        salvar.salvarContaCP(CP_cliente);
        
        
    }
    
}
