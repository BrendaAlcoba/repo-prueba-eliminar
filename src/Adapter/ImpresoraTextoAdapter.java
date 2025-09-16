package Adapter;
//Adaptador para ImpresoraTexto
class ImpresoraTextoAdapter implements Impresora {
    private ImpresoraTexto impresoraTexto;

    public ImpresoraTextoAdapter() {
        impresoraTexto =  new ImpresoraTexto();
    }

    @Override
    public void imprimir(String documento) {
        impresoraTexto.imprimirTexto(documento);
    }
}

