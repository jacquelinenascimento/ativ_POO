/**
 * BombaCombustivel
 */
public class BombaCombustivel {

    private char tipoComb;
    private float valorLitroG;
    private float valorLitroA;
    private float qtdComb;
    private float valorPagar;


    //métodos especiais
    
    public BombaCombustivel(char t, float g, float a, float q, float v) {
        this.tipoComb = t;
        this.valorLitroG = g;
        this.valorLitroA = a;
        this.qtdComb = q;
        this.valorPagar = v;

    }


    public char getTipoComb() {
        return this.tipoComb;
    }


    public void setTipoComb(char tipoComb) {
        this.tipoComb = tipoComb;
    }


    public float getValorLitroG() {
        return this.valorLitroG;
    }


    public void setValorLitroG(float valorLitroG) {
        this.valorLitroG = valorLitroG;
    }


    public float getValorLitroA() {
        return this.valorLitroA;
    }


    public void setValorLitroA(float valorLitroA) {
        this.valorLitroA = valorLitroA;
    }


    public float getQtdComb() {
        return this.qtdComb;
    }


    public void setQtdComb(float qtdComb) {
        this.qtdComb = qtdComb;
    }


    public float getValorPagar() {
        return this.valorPagar;
    }


    public void setValorPagar(float valorPagar) {
        this.valorPagar = valorPagar;
    }

    //métodos personalizados

    public void valorLitro() {
        System.out.println("Valor do combustível atualizado!");
        System.out.println(" Valor Álcool: " + this.valorLitroA + "Valor Gasolina: " + this.valorLitroG);
    }

    public void abastecerPorValor() {
        if (this.getTipoComb() == 'G') {
            this.setQtdComb(this.getValorPagar() / this.valorLitroG);
        } else if (this.getTipoComb() == 'A') {
            this.setQtdComb(this.getValorPagar() / this.valorLitroA);
        }
        System.out.println("Quantidade de litros: " + this.qtdComb);
        
    }

    public void abastecerPorLitro() {
        if (this.getTipoComb() == 'G') {
            this.setValorPagar(this.getQtdComb() * this.valorLitroG);
        } else if (this.getTipoComb() == 'A') {
            this.setValorPagar(this.getQtdComb() * this.valorLitroA);
        }
        System.out.println("Valor a pagar: " + this.valorPagar);
    
    }


    public void alterarValor(float v) {
        if (this.getTipoComb() == 'G') {
            this.setValorLitroG(v);
        } else if (this.getTipoComb() == 'A') {
            this.setValorLitroA(v);
        }
        System.out.println("Valor do combustível atualizado! Valor Álcool: " + this.valorLitroA + "Valor Gasolina: " + this.valorLitroG);
    }

}