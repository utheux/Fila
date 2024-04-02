package Estrutura.fila;

public class Fila {
    int tamanho = 0;
    int[] elementos;
    int inicio;
    int fim;
    int quantidade;



    public Fila(int tamanhoMaximo){
        this.tamanho = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }

    public void destruirFila(){
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }

    public boolean filaCheia(){
        return this.tamanho == this.quantidade;
    }

    public boolean filaVazia(){
        return this.quantidade == 0;
    }

    public void inserirElementos(int elemento){
        if (filaCheia()){
            System.out.println("Erro: A fila está cheia");
        } else {
            this.fim = (this.fim +1)%tamanho;
            this.elementos[this.fim] = elemento;
            this.quantidade = quantidade+1;
            System.out.println("ultimo elemento: " + this.elementos[this.fim]);
        }


    }
    public void removerElemento(){
        if (filaVazia()){
            System.out.println("Erro: A fila está vazia");
        } else {
            int elementoRemovido = elementos[this.inicio];
            this.inicio = (this.inicio+1)%this.tamanho;
            this.quantidade = this.quantidade-1;
            System.out.println("Elemento removido: " + elementoRemovido);
        }
    }


    public void localizarElemento(int elemento){
        int posicao = -1;
        for (int i = 0; i < tamanho-1; i++) {
            if (elementos[i] == elemento){
                posicao = i;
                System.out.println("Posição do elemento: "+posicao);
                break;
            }
        }
    }







}
