package Adapter;
//Clase existente que imprime documentos en formato pdf
class ImpresoraPDF implements Impresora {
    public void imprimir(String documento) {
        System.out.println("Imprimiendo documento pdf: " + documento);
    }
}

