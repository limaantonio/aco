public class Arco {

    private int origem;
    private int destino;

    public Arco(){}

    public Arco(int origem, int destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Arco{" +
                "origem=" + origem +
                ", destino=" + destino +
                '}';
    }
}
