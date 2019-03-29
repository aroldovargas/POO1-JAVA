/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

public class ContaPoupanca {
    
    private int numConta;
    private int numAgencia;
    private double saldo=0;
    private String nomeCliente;
    
    public ContaPoupanca(String numConta, String numAgencia, String saldo, String nomeCliente){
        this.numAgencia = Integer.parseInt(numAgencia);
        this.saldo = Double.parseDouble(saldo);
        this.nomeCliente = nomeCliente;
        this.numConta = Integer.parseInt(numConta);
    }
    public void imprimeSaldo(){
        System.out.println("Prezado,"+ nomeCliente);
        System.out.println("Seu saldo é:"+ saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
}
