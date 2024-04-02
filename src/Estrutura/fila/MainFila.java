package Estrutura.fila;

public class MainFila {
    public static void main(String[] args) {
        Fila fila = new Fila(5);
        fila.inserirElementos(2004);
        fila.inserirElementos(2003);
        fila.inserirElementos(2001);
        fila.removerElemento();
        fila.inserirElementos(10);
        fila.inserirElementos(21);
        fila.inserirElementos(23);
        fila.inserirElementos(5);
        fila.destruirFila();
        fila.inserirElementos(3333);
        fila.inserirElementos(2334);
        fila.inserirElementos(33434);
        fila.inserirElementos(34343);
        fila.inserirElementos(3);
        fila.localizarElemento(2334);
    }
}
