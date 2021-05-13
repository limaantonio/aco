public class Grafo {
    private double vertice;
    private double aresta;

    private double[][]matrizDeDistancia;

    public Grafo(){

    }

    public Grafo(int numVertice ){

        this.matrizDeDistancia = new double[numVertice][numVertice];
    }

    public double getVertice() {
        return vertice;
    }

    public void setVertice(double vertice) {
        this.vertice = vertice;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }

    public void imprimir() {
        int num = this.matrizDeDistancia.length;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(matrizDeDistancia[i][j]+ " " );

            }
            System.out.println();
        }
    }

    public void gerarMatrizAdjacencia() {
        int num = this.matrizDeDistancia.length;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matrizDeDistancia[i][j] =  Math.random()*10;
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
