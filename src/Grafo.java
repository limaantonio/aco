public class Grafo {

    private int vertice;
    private int aresta;
    private double[][]matrizDeDistancia;

    public Grafo(){}

    public Grafo(int numVertice ){
        this.matrizDeDistancia = new double[numVertice][numVertice];
    }

    public int getVertice() {
        return vertice;
    }

    public void setVertice(int vertice) {
        this.vertice = vertice;
    }

    public int getAresta() {
        return aresta;
    }

    public void setAresta(int aresta) {
        this.aresta = aresta;
    }

    public void gerarMatrizAdjacencia(int origem, int destino, double peso) {
        origem--;
        destino--;
        int num = this.matrizDeDistancia.length;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(i == origem && j == destino)
                    matrizDeDistancia[i][j] =  peso;
            }
        }
    }

    public void imprimir() {
        int num = this.matrizDeDistancia.length;


        for (int i = 0; i < num; i++) {
            System.out.print("| ");
            for (int j = 0; j < num; j++) {
                System.out.print(matrizDeDistancia[i][j]+ " | " );
            }
            System.out.println();
        }
    }
}
