/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabanco;

public class ContaCorrente {
    
    private int numConta;
    private String nomeCliente;
    private double limite=0;
    private double saldo=0;
    private int numAgencia;
    
    
    /** CONSTRUTOR */
    public ContaCorrente(String numConta, String numAgencia, String nomeCliente, String saldo, String limite){
        this.numConta = Integer.parseInt(numConta);
        this.numAgencia = Integer.parseInt(numAgencia);
        this.nomeCliente = nomeCliente;
        this.saldo = Double.parseDouble(saldo);
        this.limite = Double.parseDouble(limite);
    }
    
    
    /** METODOS */
   
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

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }
}