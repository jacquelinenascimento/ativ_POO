/**
 * main
 */
public class main {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(0, null, 0);
        ContaCorrente c2 = new ContaCorrente(0, null, 0);
        c1.alterarNome("Jacque");
        c1.depositar(50);
        c1.sacar(30);

        c2.alterarNome("Ueslei");
        c2.depositar(2000);
        c2.sacar(12);
        
    }
}
