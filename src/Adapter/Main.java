package Adapter;
//clase principal con main para ejecutar
public class Main {
    public static void main(String[] args) {
        //impresora de pdf existente
        Impresora impresoraPDF = new ImpresoraPDF();
        impresoraPDF.imprimir("documento.pdf");
        //impresora de texto plano, nueva
        Impresora impresoraTexto = new ImpresoraTextoAdapter();
        impresoraTexto.imprimir("texto.txt");
    }
}
