public class Main {
    public static void main(String args []){

        Grafo g = new Grafo(4);

        g.gerarMatrizAdjacencia(1, 2, 4);
        g.gerarMatrizAdjacencia(2, 1, 4);
        g.gerarMatrizAdjacencia(2, 3, 5);
        g.gerarMatrizAdjacencia(3, 2, 5);
        g.gerarMatrizAdjacencia(3, 4, 6);
        g.gerarMatrizAdjacencia(4, 3, 6);

        g.imprimir();
    }
}
