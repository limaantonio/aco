public class Main {
    public static void main(String args []){


        Grafo g = new Grafo(3);

        g.gerarMatrizAdjacencia();
        System.out.println();

        g.imprimir();

//        double[][] matrizDeDistancia = new double[2][2];
//
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                matrizDeDistancia[i][j] = Math.random()*10;
//            }
//        }
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(matrizDeDistancia[i][j]+ " " );
//
//            }
//            System.out.println();
//        }

    }
}
