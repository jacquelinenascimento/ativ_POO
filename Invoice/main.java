public class main {
    public static void main(String[] args) {
        Invoice i1 = new Invoice(001, "Sabonete", 10, 3.75f);
        Invoice i2 = new Invoice(002, "Biscoito", 50, 2.75f);

        i1.PrintFatura();
        i2.PrintFatura();
        
        System.out.println("Valor total = " + i1.getInvoiceAmount());
        System.out.println("Valor total = " + i2.getInvoiceAmount());
    }
}
