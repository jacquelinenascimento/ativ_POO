/**
 * ContaCorrente
 */
public class ContaCorrente {

    private int numConta;
    private String nome;
    private int saldo;

    
    //métodos especiais

    public ContaCorrente(int c, String n, int s) {
        this.setNumConta(c);
        this.setNome(n);
        this.setSaldo(0);
    }


    public int getNumConta() {
        return this.numConta;
    }


    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }


    public String getNome() {
        return this.nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getSaldo() {
        return this.saldo;
    }


    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    //métodos personalizados

    public void alterarNome(String n) {
        this.setNome(n);
        System.out.println("O titular da conta é: " + this.getNome());
    }

    public void depositar(int v) {
        this.setSaldo(this.getSaldo() + v);
        System.out.println("O saldo da conta é: " + this.getSaldo());
    }

    public void sacar(int v) {
        this.setSaldo(this.getSaldo() - v);
        System.out.println("O saldo da conta é: " + this.getSaldo());
        
    }
    
}