/**
 * Elevador
 */
public class Elevador {

    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas;

    
    //Métodos especiais

    public Elevador(int aa, int ta, int c, int q) {
        this.andarAtual = aa;
        this.totalAndares = ta;
        this.capacidade = c;
        this.qtdPessoas = q;
    }


    public int getAndarAtual(int andarAtual) {
        return this.andarAtual;
    }



    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }


    public int getTotalAndares() {
        return this.totalAndares;
    }


    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }


    public int getCapacidade(int capacidade) {
        return this.capacidade;
    }


    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }


    public int getQtdPessoas() {
        return this.qtdPessoas;
    }


    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    
    //Métodos personalizados

    public void Inicializa() {

        this.getCapacidade(8);
        this.getAndarAtual( 0);
        System.out.println("Capacidade do elevador: " + this.capacidade);
        System.out.println("Andar atual do elevador: " + this.andarAtual);
        
    }

    


    public void Entra() {
        if (this.getQtdPessoas() < this.capacidade) {
            this.setQtdPessoas(this.getQtdPessoas() + 1);
        } else {
            System.out.println("Elevador lotado.");
        }

        System.out.println("O elevador tem " + this.qtdPessoas + " pessoas.");
        
    }

    
    public void Sai() {
        if (this.getQtdPessoas() > 0) {
            this.setQtdPessoas(this.getQtdPessoas() - 1);
        } else {
            System.out.println("Elevador está vazio.");
        }

        System.out.println("O elevador tem " + this.qtdPessoas + " pessoas.");
        
    }

    
    public void Sobe() {
        if (this.andarAtual < this.getTotalAndares()) {
            this.setAndarAtual(this.getAndarAtual(andarAtual) + 1);
        } else {
            System.out.println("O elevador está no último andar.");
        }

        System.out.println("O elevador está no andar " + this.andarAtual);
    }

    
    public void Desce() {
        if (this.getAndarAtual(andarAtual) > 0) {
            this.setAndarAtual(this.getAndarAtual(andarAtual) - 1);
        } else {
            System.out.println("O elevador está no térreo.");
        }

        System.out.println("O elevador está no andar " + this.andarAtual);
    }
}