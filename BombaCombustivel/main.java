
/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        BombaCombustivel b1 = new BombaCombustivel('G', 0, 0, 0, 0);
        b1.setValorLitroG(5.49f);
        b1.setTipoComb('G');
        b1.setQtdComb(100f);
        b1.abastecerPorLitro();

        b1.valorLitro();
        b1.setTipoComb('A');
        b1.alterarValor(4.40f);
        b1.setTipoComb('G');
        b1.alterarValor(5.29f);
        b1.abastecerPorLitro();

        b1.setValorPagar(100f);
        b1.abastecerPorValor();
       

    }
}