/**
 * Invoice
 */
public class Invoice {

    private int numItem;
    private String descr;
    private int qtd;
    private float precoUnt;


    //Métodos especiais


    public Invoice(int n, String d, int q, float p) {
        this.setNumItem(n);
        this.setDescr(d);
        this.setQtd(q);
        this.setPrecoUnt(p);

    }

    public int getNumItem() {
        return this.numItem;
    }
    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }
    public String getDescr() {
        return this.descr;
    }
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public int getQtd() {
        return this.qtd;
    }
    public void setQtd(int qtd) {
        if (qtd >= 0) {
            this.qtd = qtd;
        } else {
            this.qtd = 0;
        }
    }
    public float getPrecoUnt() {
        return this.precoUnt;
    }
    public void setPrecoUnt(float precoUnt) {
        if (precoUnt >= 0) {
            this.precoUnt = precoUnt;
        } else {
            this.precoUnt = 0.0f;
        }
        
    }



    //Métodos personalizados

    

    public void PrintFatura() {
        System.out.println("Número do item: " + this.numItem);
        System.out.println("Descrição: " + this.descr);
        System.out.println("Quantidade de itens: " + this.qtd);
        System.out.println("Preço unitário: " + this.precoUnt);
        
    }

    public double getInvoiceAmount() {
        return qtd * precoUnt;
    }
    
}